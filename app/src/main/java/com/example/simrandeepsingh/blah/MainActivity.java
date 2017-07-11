package com.example.simrandeepsingh.blah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1,l5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l5=(LinearLayout)findViewById(R.id.linearLayout3);
        l1=(LinearLayout)findViewById(R.id.discountLL);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Discount.class);
                startActivity(i);

            }
        });
    }

    public void next(View v)
    {

        Intent i=new Intent(MainActivity.this,Client_details.class);
        startActivity(i);
    }
}
