package com.juniormargalho.organizze.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfiguracaoFirebase {

    private static FirebaseAuth autenticacao; //atributo estático será o mesmo, independente de quantas instancias voce crie da classe
    private static DatabaseReference firebase;

    //Retorna a instancia do FirebaseDatabase
    public static DatabaseReference getFirebaseDatabase(){
        if(firebase == null){
            firebase = FirebaseDatabase.getInstance().getReference();
        }
        return firebase;

    }

    //Retorna instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao(){ //metodo estático não precisa ser instanciado
        if( autenticacao == null ){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;

    }

}
