package com.potatoschool;

public class MinhaExcecao extends RuntimeException{
    public MinhaExcecao(){
        super();
    }

    public MinhaExcecao(String mensagem){
        super(mensagem);
    }
}
