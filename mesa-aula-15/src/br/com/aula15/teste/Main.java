package br.com.aula15.teste;

import br.com.aula15.models.Embarcacao;
import br.com.aula15.models.Iate;
import br.com.aula15.models.Veleiro;

/**
 * Tatiane Gardin
 * Andre Almeida
 * Felipe Arruda
 * Samir Libos
 */

public class Main {
    public static void main(String[] args) {
        Veleiro embarcacao = new Veleiro(12000.0,500.0,2015,12.5,"tatiane", "gardin",123, 4  );
        Veleiro embarcacao1 = new Veleiro(20000.0,500.0,2022,12.5,"tatiane", "gardin",123, 5  );
        Veleiro embarcacao2 = new Veleiro(15000.0,500.0,2020,12.5,"tatiane", "gardin",123, 6  );
        Veleiro embarcacao3 = new Veleiro(4545000.0,500.0,2010,12.5,"tatiane", "gardin",123, 7  );
        Veleiro embarcacao4 = new Veleiro(1242000.0,500.0,2021,12.5,"tatiane", "gardin",123, 5  );
        Veleiro embarcacao5 = new Veleiro(1545000.0,500.0,2015,12.5,"tatiane", "gardin",123, 3  );

        Iate iate = new Iate(12000.0,500.0,2015,12.5,"tatiane", "gardin",123, 4  );
        Iate iate1 = new Iate(20000.0,500.0,2022,12.5,"tatiane", "gardin",123, 5  );
        Iate iate2 = new Iate(15000.0,500.0,2020,12.5,"tatiane", "gardin",123, 6  );
        Iate iate3 = new Iate(4545000.0,500.0,2010,12.5,"tatiane", "gardin",123, 7  );
        Iate iate4 = new Iate(1242000.0,500.0,2021,12.5,"tatiane", "gardin",123, 5  );
        Iate iate5 = new Iate(1545000.0,500.0,2015,12.5,"tatiane", "gardin",123, 3  );

        System.out.println(embarcacao.valorAluguel());
        System.out.println(embarcacao1.valorAluguel());
        System.out.println(embarcacao2.valorAluguel());
        System.out.println(embarcacao3.valorAluguel());
        System.out.println(embarcacao4.valorAluguel());
        System.out.println(embarcacao5.valorAluguel());

        System.out.println(embarcacao.ehGrande());
        System.out.println(embarcacao1.ehGrande());
        System.out.println(embarcacao2.ehGrande());
        System.out.println(embarcacao3.ehGrande());
        System.out.println(embarcacao4.ehGrande());
        System.out.println(embarcacao5.ehGrande());

        System.out.println(iate.iateLuxuoso(iate2));
        System.out.println(iate3.iateLuxuoso(iate4));
        System.out.println(iate4.iateLuxuoso(iate5));
        System.out.println(iate4.iateLuxuoso(iate1));



    }
}