package com.example.simrandeepsingh.blah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Discount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
