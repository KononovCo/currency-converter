package com.example.currencyconverter;

import java.util.List;
import android.view.*;
import android.widget.*;
import android.content.Context;
import android.annotation.SuppressLint;

public class CurrencyAdapter extends ArrayAdapter<Currency> {

    private final int resourceLayout;
    private final LayoutInflater inflater;
    private final List<Currency> currencyList;

    public CurrencyAdapter(Context context, int resourceLayout, List<Currency> currencyList) {
        super(context, resourceLayout, currencyList);

        this.resourceLayout = resourceLayout;
        inflater = LayoutInflater.from(context);
        this.currencyList = currencyList;
    }

    @SuppressLint("ViewHolder")
    public View getView(int position, View convertView, ViewGroup parent) {
        Currency element = currencyList.get(position);
        View view = inflater.inflate(resourceLayout, parent, false);

        ImageView flag = view.findViewById(R.id.flag);
        TextView currency = view.findViewById(R.id.currency);
        TextView state = view.findViewById(R.id.state);

        flag.setImageResource(element.getFlag());
        currency.setText(element.getCurrency());
        state.setText(element.getState());

        return view;
    }

}