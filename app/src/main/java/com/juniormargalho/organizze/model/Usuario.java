package com.juniormargalho.organizze.model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.juniormargalho.organizze.config.ConfiguracaoFirebase;

public class Usuario {

    private String idUsusario, nome, email, senha;

    public Usuario() {
    }

    public void salvar(){
        DatabaseReference firebase = ConfiguracaoFirebase.getFirebaseDatabase();
        firebase.child("usuarios")
                .child(this.idUsusario)
                .setValue(this);

    }

    @Exclude //desconsidera o idUsuario no momento de salvaar no Database
    public String getIdUsusario() {
        return idUsusario;
    }

    public void setIdUsusario(String idUsusario) {
        this.idUsusario = idUsusario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Exclude
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
