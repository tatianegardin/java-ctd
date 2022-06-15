package br.com.aula14.testes;

import br.com.aula14.models.Equipe;
import br.com.aula14.models.Jogador;

public class Main {
    public static void main(String[] args) {
        Equipe craqueNet = new Equipe("CraqueNet");
        Jogador jogador1 = new Jogador(7,"Bryan",false,true);
        Jogador jogador2 = new Jogador(5,"Lucas",true,true);
        Jogador jogador4 = new Jogador(8,"Matheus",false,false);
        Jogador jogador3 = new Jogador(15,"Aila",true,false);

        craqueNet.addJogador(jogador1);
        craqueNet.addJogador(jogador2);
        craqueNet.addJogador(jogador3);
        craqueNet.addJogador(jogador4);

        craqueNet.mostrarJogadoresTitulares();

        System.out.println(craqueNet.getQuantidadeDeJogadoresLesionados());
    }
}