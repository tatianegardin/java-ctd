package br.com.potatoSchool;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private int senha;
    List<Aluno> listaAluno = new ArrayList<Aluno>();

    public Professor(String nome) {
        super(nome);
    }

    public void editarPortal(String cpf, int senha){
        if(autenticaSenha(cpf, senha)){
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Acesso negado, sua senha está incorreta!");
        }
    }

    public boolean autenticaSenha(String cpf, int senha){
        if(super.getCpf() == cpf && this.senha == senha){
            return true;
        }
        return false;
    }

    public void adicionaAluno(Aluno aluno){
        listaAluno.add(aluno);
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    @Override
    public double bonificacao() {
        return super.bonificacao() + 200;
    }
}
