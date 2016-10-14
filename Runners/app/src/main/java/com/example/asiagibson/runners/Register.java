package com.example.asiagibson.runners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText user_age = (EditText) findViewById(R.id.user_age);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText userName = (EditText) findViewById(R.id.created_name);
        final EditText password = (EditText) findViewById(R.id.user_pw);

        final Button registarB = (Button) findViewById(R.id.register_button);




    }
}
