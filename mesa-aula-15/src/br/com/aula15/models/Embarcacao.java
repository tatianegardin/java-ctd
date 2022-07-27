package br.com.aula15.models;

public abstract class Embarcacao {
    private double precoBase;
    private double valorAdicional;
    private int anoFabricacao;
    private double comprimento;
    private Capitao capitao;

    public Embarcacao(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, String nome, String apelido, int registro) {
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
        this.capitao = new Capitao(nome, apelido, registro);
    }

    public double valorAluguel(){
        if(this.anoFabricacao > 2020){
            return this.precoBase + this.valorAdicional;
        }
        return this.precoBase;
    }
}
