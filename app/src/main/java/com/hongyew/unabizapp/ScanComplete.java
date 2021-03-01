package com.hongyew.unabizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScanComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_complete);

        Button home = findViewById(R.id.to_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(toMain);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent toMain = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(toMain);
        finish();
    }
}