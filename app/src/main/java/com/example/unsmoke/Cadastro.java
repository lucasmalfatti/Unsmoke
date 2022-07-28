package com.example.unsmoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {
EditText login, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();
        login = findViewById(R.id.loginCadastro);
        senha = findViewById(R.id.senhaCadastro);

    }

}