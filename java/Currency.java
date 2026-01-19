package com.example.currencyconverter;

public class Currency {

    private final int flag;
    private final String currency;
    private final String state;

    public Currency(int flag, String currency, String state) {
        this.flag = flag;
        this.currency = currency;
        this.state = state;
    }

    public int getFlag() {
        return flag;
    }

    public String getCurrency() {
        return currency;
    }

    public String getState() {
        return state;
    }

}