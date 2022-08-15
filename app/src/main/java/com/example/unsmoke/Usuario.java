package com.example.unsmoke;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Usuario {
    String login;
    int senha;
    int cigarro;
    int vaper;
    public Usuario(String login, int senha, int cigarro, int vaper) {
        this.login = login;
        this.senha = senha;
        this.cigarro = cigarro;
        this.vaper = vaper;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getCigarro() { return cigarro; }

    public void setCigarro(int cigarro) { this.cigarro = cigarro; }

    public int getVaper() { return vaper; }

    public void setVaper(int vaper) { this.vaper = vaper; }

    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Usuarios").child(login).setValue(this);
    }


}

