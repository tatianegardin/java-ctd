package com.company;

public class Preguica extends Animal{
    public Preguica(String nome, int idade){
        super(nome, idade);

    }

    @Override
    public String emitirSom() {
        return "zZzzZzZ";
    }

    @Override
    public String movimento() {
        return "Escalando a árvore movimentando......lenta.....mente";
    }
}
