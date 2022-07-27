package br.com.company;

public class Objeto {
    private int posx;
    private int posy;
    private char direcao;


    public Objeto(int x, int y, char direcao){
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao){
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }


    public void deuCerto(){
        System.out.println(posx);
        System.out.println(posy);
        System.out.println(direcao);
    }
}
