package com.example.currencyconverter;

import android.os.*;
import androidx.appcompat.app.AppCompatActivity;

public class UploadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        Handler handler = new Handler();
        UploadCurrencyList ucl = new UploadCurrencyList(this);

        getSupportActionBar().hide();
        handler.postDelayed(ucl::upload, 1000);
    }

}