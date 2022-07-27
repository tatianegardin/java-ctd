package com.consultorio.models;

public class Particular extends Paciente{

    private double valorConsulta;
    private String rg;

    public Particular(String nome, String sobrenome, String dataNascimento, double valor, String rg) {
        super(nome, sobrenome, dataNascimento);
        this.valorConsulta = valor;
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + " Valor da consulta: " + this.valorConsulta;
    }
}
