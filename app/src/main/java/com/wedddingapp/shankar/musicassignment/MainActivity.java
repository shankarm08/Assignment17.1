package com.wedddingapp.shankar.musicassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{



    Button startButton, stopButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        startButton = (Button) findViewById(R.id.start_button);
        stopButton = (Button) findViewById(R.id.stop_button);
        startButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);

    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_button:// Play audio
                 Intent inn=new Intent(getApplicationContext(),MyService.class);
                 startService(inn);
                 break;
            case R.id.stop_button:
                 stopService(new Intent(this, MyService.class));
                  break;
        }
    }
}






