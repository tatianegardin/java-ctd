package br.com.company;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave(int x, int y, char direcao, double velocidade){
        super(x, y, direcao);
        this.velocidade = velocidade;
    }

    @Override
    public void irA(int x, int y, char direcao) {
        super.irA(x, y, direcao);
    }

    public void girar(char direcao){
        super.setDirecao(direcao);
    }

    public void restaVida(int valor){
        this.vida += valor;
    }
}
