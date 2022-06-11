package com.company;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public String emitirSom() {
        return "au au";
    }

    @Override
    public String movimento() {
        return "modo turbo ativado!";
    }
}
