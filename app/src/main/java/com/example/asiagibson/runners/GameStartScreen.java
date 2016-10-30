package com.example.asiagibson.runners;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by asiagibson on 10/9/16.
 */

public class GameStartScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Intent intent = getIntent();

        Button sButton = (Button) findViewById(R.id.start_button);
        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Game();
            }
        });



    }

  /*  public void Game (){
        Intent intent = new Intent(this, .class);
        startActivity(intent);
    }*/
}
