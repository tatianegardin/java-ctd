package com.consultorio.models;

public abstract class Paciente {
    private String nome, sobrenome, dataNascimento;
    private boolean primeiraConsulta;


    public Paciente(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.primeiraConsulta = false;
    }

    public void avaliacaoInicial(){
        if(!primeiraConsulta) {
            System.out.println("Preencha a ficha de anamnese!");
            this.primeiraConsulta = true;
        }else {
            System.out.println("Você já é nosso paciente!");
        }
    }

    public void agendarConsulta(String data, String horario, String especialidade){
        avaliacaoInicial();
        new Consulta(data, horario, especialidade);
        System.out.println("Consulta agendada com sucesso!");
    }

    public String getNome() {
        return nome;
    }
}
