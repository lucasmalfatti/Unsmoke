package com.example.unsmoke;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Cadastro extends AppCompatActivity {
EditText cadastroLogin, cadastroSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();
        cadastroLogin = findViewById(R.id.loginCadastro);
        cadastroSenha = findViewById(R.id.senhaCadastro);

    }

}