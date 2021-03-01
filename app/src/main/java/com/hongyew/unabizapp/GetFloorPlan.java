package com.hongyew.unabizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetFloorPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_floor_plan);

        Button download = findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button next = findViewById(R.id.next);
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
    public void onBackPressed(){
        Intent toMain = new  Intent(getApplicationContext(), MainActivity.class);
        startActivity(toMain);
        finish();
    }
}