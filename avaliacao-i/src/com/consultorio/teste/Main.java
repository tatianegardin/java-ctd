package com.consultorio.teste;

import com.consultorio.models.Particular;
import com.consultorio.models.Publico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Publico pacPublico = new Publico("Tatiane", "Lacerda", "11/11/1900", 1234);
        Publico pacPublico1 = new Publico("Lucas", "Arruda", "21/11/1900", 12345);
        Particular pacParticular = new Particular("Batatinha", "Gardin", "11/11/1900", 220, "123456789");

        System.out.println(pacPublico);
        System.out.println(pacPublico1);
        System.out.println(pacParticular);

    }
}