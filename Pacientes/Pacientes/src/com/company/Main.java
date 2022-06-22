package com.company;

import java.util.Date;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
        try{
	    Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2022,10,10));
        }
        catch (ExcecaoPersonalizada e){
            System.err.println(e.getMessage());
        }

    }
}
