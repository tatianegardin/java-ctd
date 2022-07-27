package br.com.porto.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Porto {
    List<Containers> listaDeContainers = new ArrayList<>();

    public int quantidadeDeContainresPerigosos(){
        int contador = 0;
        for(Containers container : listaDeContainers){
            if(container.isContemMaterialPerigoso() && container.getPaisOrigem() == "Desconhecida"){
                contador++;
            }
        }
        return contador;
    }

    public void ordenarContainers(){
        Collections.sort(listaDeContainers);

        for (Containers container : listaDeContainers){
            System.out.println(container);
        }
    }

    public void addContainers(Containers c){
        listaDeContainers.add(c);
    }
}
