package com.mqds;

public class EnviarEmails {
    public EnviarEmails(String tipo, String endereco, String senha){

    }

    public static EnviarEmails obterDadosEmail(){
        return new EnviarEmails("stmp", "contato@marcelqds.com","opa");
    }

    public void retornar(String mensagem){
        System.out.println("Email enviado");
    }
}
