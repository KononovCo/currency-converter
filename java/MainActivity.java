package com.example.currencyconverter;

import android.widget.*;
import android.content.*;
import android.os.Bundle;
import android.view.View;
import android.annotation.*;
import androidx.appcompat.app.*;

public class MainActivity extends AppCompatActivity {

    private ImageView resultFlag;
    private ImageView inputFlag;

    private TextView resultCurrency;
    private TextView inputCurrency;

    private TextView resultText;
    private TextView inputText;

    private Number n;
    private AppSettings settings;
    private UploadCurrencyList ucl;
    private final int MAX_LENGTH = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();
        load();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (AppData.getResultFlag() != 0 && AppData.getResultCurrency() != null) {
            resultFlag.setImageResource(AppData.getResultFlag());
            resultCurrency.setText(AppData.getResultCurrency());

            settings.setResultFlag(AppData.getResultFlag());
            settings.setResultCurrency(AppData.getResultCurrency());
        }

        if (AppData.getInputFlag() != 0 && AppData.getInputCurrency() != null) {
            inputFlag.setImageResource(AppData.getInputFlag());
            inputCurrency.setText(AppData.getInputCurrency());

            settings.setInputFlag(AppData.getInputFlag());
            settings.setInputCurrency(AppData.getInputCurrency());
        }

        converter();
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private void initializeComponents() {
        n = new Number(getString(R.string.separator));
        settings = new AppSettings(this);
        ucl = new UploadCurrencyList(this);

        resultFlag = findViewById(R.id.resultFlag);
        inputFlag = findViewById(R.id.inputFlag);

        resultCurrency = findViewById(R.id.resultCurrency);
        inputCurrency = findViewById(R.id.inputCurrency);

        resultText = findViewById(R.id.resultText);
        inputText = findViewById(R.id.inputText);

        Button[] numbers = {
                findViewById(R.id.zero), findViewById(R.id.one), findViewById(R.id.two),
                findViewById(R.id.three), findViewById(R.id.four), findViewById(R.id.five),
                findViewById(R.id.six), findViewById(R.id.seven), findViewById(R.id.eight),
                findViewById(R.id.nine)
        };

        Button[] operations = {
                findViewById(R.id.clear), findViewById(R.id.backspace), findViewById(R.id.separator)
        };

        findViewById(R.id.resultPanel).setOnClickListener(this::chooseCurrency);
        findViewById(R.id.inputPanel).setOnClickListener(this::chooseCurrency);

        for (Button number : numbers) number.setOnClickListener(this::number);
        for (Button operation : operations) operation.setOnClickListener(this::operation);

        getSupportActionBar().hide();
    }

    private void load() {
        if (settings.isResultConfigured()) {
            if (ucl.containsCode(settings.getResultCurrency())) {
                resultFlag.setImageResource(settings.getResultFlag());
                resultCurrency.setText(settings.getResultCurrency());
            }

            else {
                resultFlag.setImageResource(R.drawable.euro);
                resultCurrency.setText(getString(R.string.default_result_currency));

                settings.setResultFlag(0);
                settings.setResultCurrency(null);
            }
        }

        if (settings.isInputConfigured()) {
            if (ucl.containsCode(settings.getInputCurrency())) {
                inputFlag.setImageResource(settings.getInputFlag());
                inputCurrency.setText(settings.getInputCurrency());
            }

            else {
                inputFlag.setImageResource(R.drawable.russia);
                inputCurrency.setText(getString(R.string.default_input_currency));

                settings.setInputFlag(0);
                settings.setInputCurrency(null);
            }
        }

        if (settings.getText() != null) {
            try {
                inputText.setText(n.format(Double.parseDouble(n.parse(settings.getText()))));
            }

            catch (NumberFormatException ignored) {
                inputText.setText(getString(R.string.zero));
            }
        }
    }

    private String getInputText() {
        return n.parse(inputText.getText().toString());
    }

    private void converter() {
        final String RUB = "RUB";

        String rc = resultCurrency.getText().toString();
        String ic = inputCurrency.getText().toString();

        double result = 0;
        double input = Double.parseDouble(getInputText());

        double resultRate = ucl.getRate(rc);
        double inputRate = ucl.getRate(ic);

        int resultNominal = ucl.getNominal(rc);
        int inputNominal = ucl.getNominal(ic);

        if (!rc.equals(RUB) && !ic.equals(RUB)) {
            result = input * inputRate / resultRate * resultNominal / inputNominal;
        }

        else {
            if (rc.equals(RUB)) result = input * inputRate / inputNominal;
            if (ic.equals(RUB)) result = input / resultRate * resultNominal;

            if (rc.equals(RUB) && ic.equals(RUB)) result = input;
        }

        resultText.setText(n.format(result));
    }

    @SuppressLint("NonConstantResourceId")
    private void chooseCurrency(View v) {
        switch (v.getId()) {
            case R.id.resultPanel: {
                AppData.setOption(Option.RESULT);
                break;
            }

            case R.id.inputPanel: {
                AppData.setOption(Option.INPUT);
                break;
            }
        }

        startActivity(new Intent(this, CurrencyActivity.class));
    }

    private void number(View v) {
        if (getInputText().length() <= MAX_LENGTH) {
            inputText.append(((Button) v).getText());
            inputText.setText(n.format(Double.parseDouble(getInputText())));

            settings.setText(getInputText());
        }

        converter();
    }

    @SuppressLint("NonConstantResourceId")
    private void operation(View v) {
        switch (v.getId()) {
            case R.id.clear: {
                inputText.setText(getString(R.string.zero));
                settings.setText(getInputText());

                break;
            }

            case R.id.backspace: {
                String input = getInputText();

                if (input.length() >= 2) {
                    inputText.setText(n.format(Double.parseDouble(n.parse(input.substring(0, input.length() - 1)))));
                }

                else inputText.setText(getString(R.string.zero));
                settings.setText(getInputText());

                break;
            }

            case R.id.separator: {
                String input = getInputText();

                if (!input.contains(".") && input.length() <= MAX_LENGTH - 1) {
                    inputText.append(getString(R.string.separator));
                }

                break;
            }
        }

        converter();
    }

}