import java.util.Random;
import java.util.Scanner;

//1 pedra
//2 papel
//3 tesoura
public class Main {
    static int pontuacaoJogador = 0, pontuacaoComputador = 0;

    static void pedraPapelTesoura(int jogador, int computador){

        if(jogador == computador){
            jogador = 0;
        }
        switch (jogador){
            case 0:
                System.out.println("Empate");
                break;
            case 1: // pedra
                if(computador == 2){ // papel
                    System.out.println("Você escolheu Pedra \nComputador escolheu Papel\n\nComputador ganhou!");
                    pontuacaoComputador++;
                }else { // tesoura
                    System.out.println("Você escolheu Pedra \nComputador escolheu tesoura\n\nJogador ganhou!");
                    pontuacaoJogador++;
                }
                break;
            case 2: // papel
                if (computador == 1){ //pedra
                    System.out.println("Você escolheu Papel \nComputador escolheu Pedra\n\nJogador ganhou!");
                    pontuacaoJogador++;
                }else { // tesoura
                    System.out.println("Você escolheu Pedra \nComputador escolheu tesoura\n\nComputador ganhou!");
                    pontuacaoComputador++;
                }
                break;
            case 3: // tesoura
                if(computador == 1){ // pedra
                    System.out.println("Você escolheu Tesoura \nComputador escolheu pedra\n\nComputador ganhou!");
                    pontuacaoComputador++;
                } else { //papel
                    System.out.println("Você escolheu Tesoura \nComputador escolheu Papel\n\nJogador ganhou!");
                    pontuacaoJogador++;
                }
                break;
        }
        System.out.println();
        System.out.println("Pontuação do jogador: " + pontuacaoJogador);
        System.out.println("Pontuação computador: " + pontuacaoComputador);
        System.out.println();
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int computador;
        int jogador;


        while (true){

            System.out.println("Escolha um valor: \n1-Pedra \n2-Papel \n3-Tesoura \n4-Para sair! ");
            jogador = scanner.nextInt();
            computador = random.nextInt(3) +1;

            if(jogador == 4 ){
                System.out.println("Até logo!");
                break;
            }else {
                pedraPapelTesoura(jogador, computador);
            }
        }
    }
}