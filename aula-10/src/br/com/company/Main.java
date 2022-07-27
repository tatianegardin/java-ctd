package br.com.company;

/**
 * Tatiane Gardin
 * Henrique Cesar
 * Pedro Marques
 * Samir Libos
 * Moises
 */


public class Main {
    public static void main(String[] args) {
        Objeto ob = new Objeto(1,2,'n');
        Nave nave1 = new Nave(1,2, 'l', 2.0);

        ob.deuCerto();
        nave1.deuCerto();
    }
}
