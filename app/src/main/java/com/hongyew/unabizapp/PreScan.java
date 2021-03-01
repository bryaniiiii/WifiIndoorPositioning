package com.hongyew.unabizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreScan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_scan);

        Button markLocation = findViewById(R.id.open_map);
        markLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button next = findViewById(R.id.start_scan);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toScanning = new Intent(getApplicationContext(), Scanning.class);
                startActivity(toScanning);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed(){
        Intent toGetFloorPlan = new  Intent(getApplicationContext(), GetFloorPlan.class);
        startActivity(toGetFloorPlan);
        finish();
    }
}