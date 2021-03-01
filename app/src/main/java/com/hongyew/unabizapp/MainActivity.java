package com.hongyew.unabizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toMapping = findViewById(R.id.mapping);
        toMapping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMappingIntent = new Intent(getApplicationContext(), MappingAccess.class);
                startActivity((toMappingIntent));
            }
        });

        Button toTesting = findViewById(R.id.testing);
        toTesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTestingIntent = new Intent(getApplicationContext(), Testing.class);
                startActivity(toTestingIntent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}