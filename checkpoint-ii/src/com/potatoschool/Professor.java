package com.potatoschool;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    private List<Aluno> listaAluno = new ArrayList<>();

    public Professor(String nome, String email, int registro) {
        super(nome, email, registro);
    }

    public void adicionaAluno(Aluno aluno){
        listaAluno.add(aluno);
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }
}
