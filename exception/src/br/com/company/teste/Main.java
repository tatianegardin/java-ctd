package br.com.company.teste;

import br.com.company.models.Data;

public class Main {
    public static void main(String[] args)  {
        try {
            Data data = new Data(31, 11, 3001);
            data.getData();
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}