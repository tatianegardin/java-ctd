package com.company;

import com.company.Animal;
import com.company.Cachorro;
import com.company.Cavalo;
import com.company.Preguica;

/**
 * Mesa 1
 * Tatiane Gardin
 * André Almeida
 * Sabrina S. Augusto
 * Tiago Guerreiro
 * Wallacy dos Santos Silva
 */

public class Main {
    public static void main(String[] args) {
        Cachorro auau = new Cachorro("caramelo", 5);
        Animal pocoto = new Cavalo("Garanhão", 2);
        Preguica dorminhoca = new Preguica("Carnaval", 4);

        System.out.println(auau.emitirSom());
        System.out.println(auau.movimento() + "\n");

        System.out.println(pocoto.emitirSom());
        System.out.println(pocoto.movimento()+ "\n");

        System.out.println(dorminhoca.emitirSom());
        System.out.println(dorminhoca.movimento()+ "\n");
    }
}