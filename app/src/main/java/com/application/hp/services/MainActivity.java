package com.application.hp.services;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity{ // implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("dev2qa.com - Android Foreground Service Example.");

        Button startServiceButton = (Button)findViewById(R.id.start_foreground_service_button);
        startServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyForeGroundService.class);
                intent.setAction(MyForeGroundService.ACTION_START_FOREGROUND_SERVICE);
                startService(intent);
            }
        });

        Button stopServiceButton = (Button)findViewById(R.id.stop_foreground_service_button);
        stopServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyForeGroundService.class);
                intent.setAction(MyForeGroundService.ACTION_STOP_FOREGROUND_SERVICE);
                stopService(intent);
            }
        });
    }
}
