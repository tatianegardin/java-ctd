package com.potatoschool;

public class Aluno extends Pessoa { // Extendendo por heran�a a classe m�e Pessoa
    public Aluno(String nome, String email, int registro) throws ExcecaoPessoa { // Construtor da classe Aluno j� dando throws a nossa exce��o
        super(nome, email, registro);
    }

    public void cadastrarAluno(Professor professor) { // metodo que cadastra o aluno a lista professor
        professor.adicionaAluno(this);
    }

    public String toString() { // metodo toString
        return " Aluno: " + this.getNome() + ", Registro: " + this.getRegistro();
    }
}


