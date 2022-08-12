package com.example.unsmoke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaEscolha extends AppCompatActivity {
    static String login;
    static int senha, cigarro, vaper;
    Usuario usu = new Usuario(login, senha, cigarro, vaper);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha);
        getSupportActionBar().hide();

    }
    public void confirmarCigarro(View v){
        usu.cigarro ++;
        respostaCigarro();
    }

    public void respostaCigarro(){
            Intent a = new Intent(this, RespostaCigarro.class);
            startActivity(a);
    }

    public void confirmarVape(View v){
        usu.vaper ++;
        respostaVape();
    }
    public void respostaVape(){
        Intent i = new Intent(this,RespostaVape.class);
        startActivity(i);
    }
}