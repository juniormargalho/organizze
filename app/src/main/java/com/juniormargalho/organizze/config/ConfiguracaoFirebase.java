package com.juniormargalho.organizze.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFirebase {

    private static FirebaseAuth autenticacao; //atributo estático será o mesmo, independente de quantas instancias voce crie da classe

    //Retorna instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao(){ //metodo estático não precisa ser instanciado

        if( autenticacao == null ){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;

    }

}
