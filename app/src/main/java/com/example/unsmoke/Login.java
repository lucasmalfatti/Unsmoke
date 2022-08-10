package com.example.unsmoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class Login extends AppCompatActivity {
    EditText login, senha;
    AlertDialog.Builder alerta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
        alerta = new AlertDialog.Builder(this);
    }

    public void irCadastro(View v){
        Intent i = new Intent(this, Cadastro.class);
        startActivity(i);
    }

    public void mudarTela() {
        Intent a = new Intent(this, TelaEscolha.class);
        startActivity(a);
    }
    public void print(String p) {
        Toast.makeText(this, p, Toast.LENGTH_SHORT).show();
    }
    public void verificaUsuario(View v) {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Usuario");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                boolean auxiliar = false;

                String l = login.getText().toString();
                int s = Integer.parseInt(senha.getText().toString());

                for (DataSnapshot usuario : snapshot.getChildren()) {
                    if (usuario.getValue(Usuario.class).getLogin().equals(l) && usuario.getValue(Usuario.class).getSenha() == s) {
                        auxiliar = true;
                        print("Bem Vindo!");
                        mudarTela();
                        break;
                    }

                }
                if (!auxiliar) {
                    print("Usuario não Encontrado!");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
