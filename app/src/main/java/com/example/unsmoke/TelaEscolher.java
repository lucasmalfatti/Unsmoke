package com.example.unsmoke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaEscolher extends AppCompatActivity {
    public static int senha, cigarro, vaper;
    public static String login;
    static Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolher);
        getSupportActionBar().hide();
    }

    public void confirmarCigarro(View v){
        cigarro++;
        usuario.cigarro = cigarro;
        Usuario u = new Usuario(login, senha, 1, 0);
        u.salvar();
        respostaCigarro();
    }

    public void respostaCigarro(){
        Intent a = new Intent(this, RespostaCigarro.class);
        startActivity(a);
    }

    public void confirmarVape(View v){
        vaper = vaper + 1;
        Usuario u = new Usuario(login,senha,0,1);
        u.salvar();
        respostaVape();
    }
    public void respostaVape() {
        Intent i = new Intent(this, RespostaVape.class);
        startActivity(i);
    }
}