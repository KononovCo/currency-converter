package com.example.currencyconverter;

import java.util.*;
import java.util.regex.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import android.content.*;

public class UploadCurrencyList {

    private boolean isError = false;

    private final Context context;
    private final ArrayList<String> codeList;
    private final ArrayList<Integer> nominalList;
    private final ArrayList<Double> rateList;

    public UploadCurrencyList(Context context) {
        this.context = context;

        codeList = new ArrayList<>();
        nominalList = new ArrayList<>();
        rateList = new ArrayList<>();
    }

    private int getNumber(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            return Integer.parseInt(str.substring(matcher.start(), matcher.end()));
        }

        return 0;
    }

    public boolean containsCode(String code) {
        for (int i = 0; i < AppData.getCodeList().size(); i++) {
            if (AppData.getCodeList().get(i).equals(code)) return true;
        }

        return false;
    }

    public int getNominal(String code) {
        for (int i = 0; i < AppData.getCodeList().size(); i++) {
            if (AppData.getCodeList().get(i).equals(code)) {
                return AppData.getNominalList().get(i);
            }
        }

        return 0;
    }

    public double getRate(String code) {
        for (int i = 0; i < AppData.getCodeList().size(); i++) {
            if (AppData.getCodeList().get(i).equals(code)) {
                return AppData.getRateList().get(i);
            }
        }

        return 0;
    }

    public void upload() {
        Thread thread = new Thread(() -> {
            try {
                Document doc = Jsoup.connect("https://www.alta.ru/currency").get();

                String codeRequest = "table.pCurrency_table tbody td.t-center span.gray";
                String nominalRequest = "table.pCurrency_table tbody td.t-left";
                String rateRequest = "table.pCurrency_table tbody td.t-right";

                int codeRequestSize = doc.select(codeRequest).size();
                int nominalRequestSize = doc.select(nominalRequest).size();
                int rateRequestSize = doc.select(rateRequest).size();

                if (codeRequestSize != 0 && nominalRequestSize != 0 && rateRequestSize != 0) {
                    for (Element element : doc.select(codeRequest)) {
                        codeList.add(element.text());
                    }

                    for (Element element : doc.select(nominalRequest)) {
                        nominalList.add(getNumber(element.text()));
                    }

                    for (Element element : doc.select(rateRequest)) {
                        rateList.add(Double.parseDouble(element.text()));
                    }
                }

                else throw new Exception();
                if (codeList.isEmpty() || nominalList.isEmpty() || rateList.isEmpty()) throw new Exception();
            }

            catch (Exception e) {
                isError = true;
            }
        });

        thread.start();

        try {
            thread.join();

            if (!isError) {
                AppData.setCodeList(codeList);
                AppData.setNominalList(nominalList);
                AppData.setRateList(rateList);

                context.startActivity(new Intent(context, MainActivity.class));
            }
        }

        catch (InterruptedException ignored) {}
    }

}