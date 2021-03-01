package com.hongyew.unabizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class MappingAccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapping_access);

        EditText adminpwEditText = findViewById(R.id.adminpw);
        adminpwEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("0000")) {
                    Intent toGetFloorPlan = new Intent(getApplicationContext(), GetFloorPlan.class);
                    startActivity(toGetFloorPlan);
                    finish();
                } else if (s.length() == 4) {
                    Toast.makeText(getBaseContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
                    adminpwEditText.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
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