package com.company.models;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();

    public void adicionaReserva(Reserva reserva){
        listaReservas.add(reserva);
    }

    public double valorTotal(){
        double valor = 0;
        for(Reserva reserva: listaReservas){
            valor += reserva.getPreco();
        }
        return valor;
    }

    public int quantasVezesVisitada(String estacao) throws ExcecaoEstacao {
        int quantidade = 0;

            if(!estacaoDisponivel(estacao)){
                throw new ExcecaoEstacao(estacao + " é uma estação inválida!");
            }
            for(Reserva reserva: listaReservas){
                if(reserva.getEstacaoOrigem() == estacao || reserva.getEstacaoDestino() == estacao){
                    quantidade += reserva.getQtdPassageiros();
                }
            }
            return quantidade;
    }

    public boolean estacaoDisponivel(String estacao){
        ArrayList<String> estacoes = new ArrayList<String>(7);
        estacoes.add("Buenos Aires");
        estacoes.add("Luján");
        estacoes.add("Mercedes");
        estacoes.add("Suipacha");
        estacoes.add("Chivilcoy");
        estacoes.add("Bragado");
        estacoes.add("Alberti");

        return estacoes.contains(estacao);
    }
}
