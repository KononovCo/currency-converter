package com.example.currencyconverter;

import java.util.ArrayList;

public class AppData {

    private static Option option;

    private static int resultFlag;
    private static int inputFlag;

    private static String resultCurrency;
    private static String inputCurrency;

    private static ArrayList<String> codeList;
    private static ArrayList<Integer> nominalList;
    private static ArrayList<Double> rateList;

    private static String getCode(String currency) {
        return currency != null ? currency.substring(0, 3) : null;
    }

    public static Option getOption() {
        return option;
    }

    public static int getResultFlag() {
        return resultFlag;
    }

    public static int getInputFlag() {
        return inputFlag;
    }

    public static String getResultCurrency() {
        return getCode(resultCurrency);
    }

    public static String getInputCurrency() {
        return getCode(inputCurrency);
    }

    public static ArrayList<String> getCodeList() {
        return codeList;
    }

    public static ArrayList<Integer> getNominalList() {
        return nominalList;
    }

    public static ArrayList<Double> getRateList() {
        return rateList;
    }

    public static void setOption(Option option) {
        AppData.option = option;
    }

    public static void setResultFlag(int resultFlag) {
        AppData.resultFlag = resultFlag;
    }

    public static void setInputFlag(int inputFlag) {
        AppData.inputFlag = inputFlag;
    }

    public static void setResultCurrency(String resultCurrency) {
        AppData.resultCurrency = resultCurrency;
    }

    public static void setInputCurrency(String inputCurrency) {
        AppData.inputCurrency = inputCurrency;
    }

    public static void setCodeList(ArrayList<String> codeList) {
        AppData.codeList = codeList;
    }

    public static void setNominalList(ArrayList<Integer> nominalList) {
        AppData.nominalList = nominalList;
    }

    public static void setRateList(ArrayList<Double> rateList) {
        AppData.rateList = rateList;
    }

}