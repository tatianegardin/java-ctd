package com.potatoschool;

public class Aluno extends Pessoa{
    public Aluno(String nome, String email, int registro) {
        super(nome, email, registro);
    }

    public void cadastrarAluno(Professor professor){
        professor.adicionaAluno(this);
    }
}
