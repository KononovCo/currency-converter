package com.example.currencyconverter;

import java.text.*;

public class Number {

    private final String sep;

    public Number(String sep) {
        this.sep = sep;
    }

    public String parse(String n) {
        return n.replace(" ", "").replace(sep, ".");
    }

    public String format(double n) {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        DecimalFormat df = new DecimalFormat();

        dfs.setGroupingSeparator(' ');
        df.setDecimalFormatSymbols(dfs);

        return df.format(n).replace(".", sep);
    }

}