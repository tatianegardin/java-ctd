package com.company.testes;

import com.company.models.Empresa;
import com.company.models.ExcecaoEstacao;
import com.company.models.Reserva;

public class Main {
    public static void main(String[] args) {
        Reserva reserva1 = new Reserva("123", 5,"Buenos Aires", "Luján");
        Reserva reserva2 = new Reserva("123", 3,"Buenos Aires", "Bragado");
        Reserva reserva3 = new Reserva("123", 1,"Bragado", "Alberti");
        Reserva reserva4 = new Reserva("123", 10,"Luján", "Alberti");
        Reserva reserva5 = new Reserva("123", 2,"Mercedes", "Chivilcoy");

        Empresa empresa = new Empresa();
        empresa.adicionaReserva(reserva1);
        empresa.adicionaReserva(reserva2);
        empresa.adicionaReserva(reserva3);
        empresa.adicionaReserva(reserva4);
        empresa.adicionaReserva(reserva5);

        try{
            System.out.println("Quantidade: " + empresa.quantasVezesVisitada("Buenos Aires"));
            System.out.println("Quantidade: " + empresa.quantasVezesVisitada("Alberti"));
            System.out.println("Quantidade: " + empresa.quantasVezesVisitada("batata"));
        }catch (ExcecaoEstacao ex){
            System.err.println(ex.getMessage());
        }
        finally {
            System.out.println("Valor total arrecadado: " + empresa.valorTotal());
            System.out.println("Valor total reserva 4: " + reserva4.getPreco());
            System.out.println("Fim do programa!");
        }


    }
}