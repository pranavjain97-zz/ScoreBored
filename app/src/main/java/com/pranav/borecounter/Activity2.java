package com.pranav.borecounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();

        int num1  = intent.getIntExtra("num1",0);
         int num2 = intent.getIntExtra("num2",0);

        int add=num1+num2;
        display(add);


    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreUpdate);
        quantityTextView.setText("" + number);
    }



}
