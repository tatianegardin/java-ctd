package com.consultorio.models;

public class Publico extends Paciente implements Comparable<Publico>{
    private int numSUS;

    public Publico(String nome, String sobrenome, String dataNascimento, int numSUS) {
        super(nome, sobrenome, dataNascimento);
        this.numSUS = numSUS;
    }

    @Override
    public int compareTo(Publico p) {
        return Integer.compare(this.numSUS, p.numSUS);
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +" Numero SUS: " + this.numSUS;
    }
}
