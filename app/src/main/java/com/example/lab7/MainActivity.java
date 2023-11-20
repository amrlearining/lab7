package com.example.lab7;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, pass;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.emailedit);
        pass = (EditText) findViewById(R.id.passedit);
        button = (Button) findViewById(R.id.button);

        email.addTextChangedListener(loginTextWatcher);
        pass.addTextChangedListener(loginTextWatcher);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
                // openBMI();
            }
        });
    }


    public void openBMI(){
        Intent intent = new Intent(this, bmi_calculater.class);
        startActivity(intent);
    }
    public void check(){
        if(email.getText().toString().equals("aaa@gmail.com") && pass.getText().toString().equals("111")){
            Toast.makeText(this, "Success Login", Toast.LENGTH_SHORT).show();
            openBMI();
        }
        else if(email.getText().toString().equals("bbb@gmail.com") && pass.getText().toString().equals("222")){
            Toast.makeText(this, "Success Login", Toast.LENGTH_SHORT).show();
            openBMI();
        }
        else if(email.getText().toString().equals("ccc@gmail.com") && pass.getText().toString().equals("333")){
            Toast.makeText(this, "Successful Login", Toast.LENGTH_SHORT).show();
            openBMI();
        }
        else if(email.getText().toString().equals("ddd@gmail.com") && pass.getText().toString().equals("222")){
            Toast.makeText(this, "Success Login", Toast.LENGTH_SHORT).show();
            openBMI();
        }
        else{

            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }


    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String usernameInput = email.getText().toString().trim();
            String passwordInput = pass.getText().toString().trim();
            button.setEnabled(!usernameInput.isEmpty() && !passwordInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}



