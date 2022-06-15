package br.com.aula14.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipe {

    private String nome;
    private List<Jogador> listaDeJogador = new ArrayList<Jogador>();


    public void addJogador(Jogador j){
        listaDeJogador.add(j);
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void mostrarJogadoresTitulares(){

        Collections.sort(listaDeJogador);
        for(Jogador jogador : listaDeJogador){
            if(jogador.isTitular()){
                System.out.println("Nome: "+ jogador.getNome() + " Numero da camisa: " + jogador.getNumCamisa());
            }
        }
    }

    public int getQuantidadeDeJogadoresLesionados(){
        int contador = 0;
        for (Jogador jogador: listaDeJogador){
            if(jogador.isLesionado() && jogador.isTitular()){
                contador++;
            }
        }
        return contador;
    }






}
