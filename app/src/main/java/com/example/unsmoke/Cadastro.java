package com.example.unsmoke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    public void cadastra(View v){
        String l = cadastroLogin.getText().toString();
        int s = Integer.parseInt(cadastroSenha.getText().toString());
        Usuario usuario = new Usuario(l,s, 0, 0);
        usuario.salvar();
        Intent i = new Intent(this, TelaEscolher.class);
        startActivity(i);
    }

}