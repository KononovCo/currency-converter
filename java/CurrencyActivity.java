package com.example.currencyconverter;

import java.util.*;
import android.text.*;
import android.view.*;
import android.widget.*;
import android.os.Bundle;
import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;

public class CurrencyActivity extends AppCompatActivity {

    private CurrencyAdapter adapter;
    private ArrayList<Currency> matches;

    @Override
    @SuppressLint("UseCompatLoadingForDrawables")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        fillCurrencyList();

        matches = new ArrayList<>();

        ((EditText) findViewById(R.id.search)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                fillCurrencyList();
                search(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle(getString(R.string.currency_selection_header));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.app_color));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) onBackPressed();

        return super.onOptionsItemSelected(item);
    }

    private void calc() {
        getSupportActionBar().setSubtitle("Найдено: " + adapter.getCount());
    }

    private void search(String search) {
        TextView notFound = findViewById(R.id.notFound);

        matches.clear();
        notFound.setVisibility(View.GONE);

        for (int i = 0; i < adapter.getCount(); i++) {
            Currency element = adapter.getItem(i);

            String find = search.toLowerCase();
            String currency = element.getCurrency().toLowerCase();
            String state = element.getState().toLowerCase();

            if (currency.contains(find) || state.contains(find)) {
                if (!matches.contains(element)) matches.add(element);
            }

            else matches.remove(element);
        }

        adapter.clear();

        for (Currency match : matches) adapter.add(match);

        if (matches.isEmpty()) {
            notFound.setVisibility(View.VISIBLE);
            notFound.setText("Нет результатов для \"" + search + '"');
        }

        calc();
    }

    private void fillCurrencyList() {
        ArrayList<Currency> list = new ArrayList<>();
        ListView listView = findViewById(R.id.listView);

        FillCurrencyList fcl = new FillCurrencyList();
        UploadCurrencyList ucl = new UploadCurrencyList(this);

        ArrayList<Integer> flagList = fcl.getFlagList();
        ArrayList<String> currencyList = fcl.getCurrencyList();
        ArrayList<String> stateList = fcl.getStateList();

        for (int i = 0; i < flagList.size(); i++) {
            String code = currencyList.get(i);

            if (!code.equals("")) {
                code = code.substring(0, 3).toUpperCase();

                if (ucl.containsCode(code) || code.equals("RUB")) {
                    list.add(new Currency(flagList.get(i), currencyList.get(i), stateList.get(i)));
                }
            }
        }

        adapter = new CurrencyAdapter(this, R.layout.currency_item, list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            int flag = adapter.getItem(i).getFlag();
            String currency = adapter.getItem(i).getCurrency();

            if (AppData.getOption().equals(Option.RESULT)) {
                AppData.setResultFlag(flag);
                AppData.setResultCurrency(currency);
            }

            else if (AppData.getOption().equals(Option.INPUT)) {
                AppData.setInputFlag(flag);
                AppData.setInputCurrency(currency);
            }

            onBackPressed();
        });

        calc();
    }

}