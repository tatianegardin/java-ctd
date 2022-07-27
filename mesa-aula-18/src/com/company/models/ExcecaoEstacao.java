package com.company.models;

public class ExcecaoEstacao extends Exception{
    public ExcecaoEstacao() {
    }

    public ExcecaoEstacao(String message) {
        super(message);
    }
}
