package com.example.asiagibson.runners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userName = (EditText) findViewById(R.id.user_name);
        final EditText password = (EditText) findViewById(R.id.login_pw);
        final TextView cAccount = (TextView) findViewById(R.id.create_acc);

        cAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });

        final Button login = (Button) findViewById(R.id.login_Button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Logic goes here true false
                startScreen();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void startScreen() {
        Intent intent = new Intent(this, GameStartScreen.class);
        startActivity(intent);
    }
    public void createAccount(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

}
