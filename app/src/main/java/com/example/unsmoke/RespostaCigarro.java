package com.example.unsmoke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RespostaCigarro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_cigarro);
        getSupportActionBar().hide();
    }
    public void voltarEscolha(View C){
        Intent i = new Intent(this, TelaEscolher.class);
        startActivity(i);
    }
}