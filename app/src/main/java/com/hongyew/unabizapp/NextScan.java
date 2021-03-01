package com.hongyew.unabizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextScan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_scan);

        Button markLocation = findViewById(R.id.next_scan);
        markLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toScanning = new Intent(getApplicationContext(), Scanning.class);
                startActivity(toScanning);
                finish();
            }
        });

        Button next = findViewById(R.id.cancel);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPreScan = new Intent(getApplicationContext(), PreScan.class);
                startActivity(toPreScan);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed(){}
}