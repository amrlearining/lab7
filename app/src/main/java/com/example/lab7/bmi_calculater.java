package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class bmi_calculater extends AppCompatActivity {
    EditText EditTextweight;
    EditText EditTextheight;
    Button buttom;
    TextView textView,Bmiresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculater);

        EditTextweight =findViewById(R.id.weight);
        EditTextheight  =findViewById(R.id.height);
        buttom =findViewById(R.id.button2);
        Bmiresult =findViewById(R.id.result);

        buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float height=Float.parseFloat(String.valueOf(EditTextheight.getText()));
                float weight=Float.parseFloat(String.valueOf(EditTextweight.getText()));
                float bmi = weight / (height * height);
                Bmiresult.setText(String.valueOf(bmi), TextView.BufferType.EDITABLE);
                bmiCat(bmi);

            }
        });
    }

    public void bmiCat(float num) {
        textView = findViewById(R.id.cat);

        if (num < 18.5) {
            textView.setText("Underweight");
        } else if (num >= 18.5 && num < 25.0) {
            textView.setText("Normal weight");
        } else if (num >= 25.0 && num < 30.0) {
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
