import java.util.Random;
import java.util.Scanner;

//1 pedra
//2 papel
//3 tesoura
public class Main {
    static int pontuacaoJogador = 0, pontuacaoComputador = 0;

    static void pedraPapelTesoura(int jogador, int computador, String nomeJogador){


        if(jogador == computador){
            jogador = 0;
        }
        switch (jogador){
            case 0:
                System.out.println("Empate");
                break;
            case 1: // pedra
                if(computador == 2){ // papel, computador ganhou
                    usuarioGanhou(false, nomeJogador, "pedra", "papel");
                    pontuacaoComputador++;
                }else { // tesoura, jogador ganha
                    usuarioGanhou(true, nomeJogador, "pedra", "papel");
                    pontuacaoJogador++;
                }
                break;
            case 2: // papel
                if (computador == 1){ //pedra
                    usuarioGanhou(true, nomeJogador, "papel", "pedra");
                    pontuacaoJogador++;
                }else { // tesoura
                    usuarioGanhou(false, nomeJogador, "papel", "tesoura");
                    pontuacaoComputador++;
                }
                break;
            case 3: // tesoura
                if(computador == 1){ // pedra
                    usuarioGanhou(false, nomeJogador, "tesoura", "pedra");
                    pontuacaoComputador++;
                } else { //papel
                    usuarioGanhou(true, nomeJogador, "tesoura", "papel");
                    pontuacaoJogador++;
                }
                break;
        }
        System.out.println();
        System.out.println("Pontuação " + nomeJogador + ": " + pontuacaoJogador);
        System.out.println("Pontuação computador: " + pontuacaoComputador);
        System.out.println();
    }

    static void usuarioGanhou(boolean ganhou, String nomeJogador, String escolhaJogador, String escolhaComputador){
        String mensagemPadrao = "Você escolheu " + escolhaJogador + "\nComputador escolheu "+ escolhaComputador +"\n\n";
        if (ganhou){
            System.out.println(mensagemPadrao + nomeJogador +" ganhou!");
        } else {
            System.out.println(mensagemPadrao +"Computador ganhou!");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int computador, jogador;
        String nomeJogador;

        System.out.println("Digite seu nome");
        nomeJogador = scanner.nextLine();
        while (true){

            System.out.println("Olá " + nomeJogador + "!\n" +"Escolha um valor: \n1-Pedra \n2-Papel \n3-Tesoura \n4-Para sair! ");
            jogador = scanner.nextInt();
            computador = random.nextInt(3) +1;

            if(jogador == 4 ){
                System.out.println("Até logo " + nomeJogador + "!");
                break;
            }else {
                pedraPapelTesoura(jogador, computador, nomeJogador);
            }
        }
    }
}