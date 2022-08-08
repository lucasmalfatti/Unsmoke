package com.example.unsmoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaCigarro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cigarro);
        getSupportActionBar().hide();

    }
}