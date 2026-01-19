package com.example.currencyconverter;

import android.content.*;

public class AppSettings {

    private final SharedPreferences sp;
    private final String TEXT = "text";

    private final String RESULT_FLAG = "rf";
    private final String INPUT_FLAG = "if";

    private final String RESULT_CURRENCY = "rc";
    private final String INPUT_CURRENCY = "ic";

    public AppSettings(Context context) {
        sp = context.getSharedPreferences("settings", Context.MODE_PRIVATE);
    }

    private void save(String key, int data) {
        sp.edit().putInt(key, data).apply();
    }

    private void save(String key, String data) {
        sp.edit().putString(key, data).apply();
    }

    public boolean isResultConfigured() {
        return getResultFlag() != 0 && getResultCurrency() != null;
    }

    public boolean isInputConfigured() {
        return getInputFlag() != 0 && getInputCurrency() != null;
    }

    public String getText() {
        return sp.getString(TEXT, null);
    }

    public int getResultFlag() {
        return sp.getInt(RESULT_FLAG, 0);
    }

    public int getInputFlag() {
        return sp.getInt(INPUT_FLAG, 0);
    }

    public String getResultCurrency() {
        return sp.getString(RESULT_CURRENCY, null);
    }

    public String getInputCurrency() {
        return sp.getString(INPUT_CURRENCY, null);
    }

    public void setText(String data) {
        save(TEXT, data);
    }

    public void setResultFlag(int data) {
        save(RESULT_FLAG, data);
    }

    public void setInputFlag(int data) {
        save(INPUT_FLAG, data);
    }

    public void setResultCurrency(String data) {
        save(RESULT_CURRENCY, data);
    }

    public void setInputCurrency(String data) {
        save(INPUT_CURRENCY, data);
    }

}