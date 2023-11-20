package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class bmi_calculater extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculater);
        double result = 30;
        bmiCat(result);
    }

    public void bmiCat(double num){
        textView = findViewById(R.id.cat);

        if (num < 18.5){
            textView.setText("Underweight");
        } else if (num >= 18.5 && num < 25.0) {
            textView.setText("Normal weight");
        } else if (num >= 25.0 && num < 30.0){
            textView.setText("Overweight");
        } else if (num >= 30.0 && num < 35) {
            textView.setText("Obesity class|");
        } else if (num >= 35.0 && num < 40) {
            textView.setText("Obesity class||");
        } else if (num >= 40) {
            textView.setText("Obesity class |||");
        }
    }
}