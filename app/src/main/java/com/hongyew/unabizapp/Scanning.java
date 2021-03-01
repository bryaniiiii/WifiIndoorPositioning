package com.hongyew.unabizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Scanning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanning);

        Button cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPreScan = new Intent(getApplicationContext(), PreScan.class);
                startActivity(toPreScan);
                finish();
            }
        });

        //temporary for testing
        Button nextScan = findViewById(R.id.next);
        nextScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNextScan = new Intent(getApplicationContext(), NextScan.class);
                startActivity(toNextScan);
                finish();
            }
        });

        Button done = findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toScanComplete = new Intent(getApplicationContext(), ScanComplete.class);
                startActivity(toScanComplete);
                finish();
            }
        });
    }
}