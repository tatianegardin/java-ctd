package com.company;


import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {


        Calendar calendario = new Calendar();
        calendario.set(2022, Calendar.JUNE, 23);
        try{
            Paciente paciente=new Paciente("Juan","Perez","12345",calendario.getTime());
        }
        catch (ExcecaoPersonalizada e){
            System.err.println(e.getMessage());
        }

    }
}
