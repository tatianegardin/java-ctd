package com.company.models;

public class Reserva {
    private String codigo;
    private int qtdPassageiros;
    private String estacaoOrigem, estacaoDestino;

    public Reserva(String codigo, int qtdPassageiros, String estacaoOrigem, String estacaoDestino) {
        this.codigo = codigo;
        this.qtdPassageiros = qtdPassageiros;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
    }

    public double getPreco(){
        double preco = 50.0*this.qtdPassageiros;
        if(this.estacaoDestino == "Buenos Aires" && this.estacaoOrigem == "Bragado" || this.estacaoDestino == "Bragado" && this.estacaoOrigem == "Buenos Aires"){
            return preco - (preco * 0.2);
        }
        return preco;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public String getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public String getEstacaoDestino() {
        return estacaoDestino;
    }
}
