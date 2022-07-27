package br.com.porto.teste;

import br.com.porto.models.Containers;
import br.com.porto.models.Porto;

public class Main {
    public static void main(String[] args) {
        Porto porto = new Porto();
        Containers container1 = new Containers(123,"Desconhecida", true);
        Containers container2 = new Containers(3211,"China", true);
        Containers container3 = new Containers(021,"EUA", false);
        Containers container4 = new Containers(154,"Brasil", false);
        Containers container5 = new Containers(00213,"Russia", true);
        Containers container6 = new Containers(48778,"Canada", false);
        Containers container7 = new Containers(54785,"Desconhecida", false);
        Containers container8 = new Containers(5555,"Desconhecida", true);

        porto.addContainers(container1);
        porto.addContainers(container2);
        porto.addContainers(container3);
        porto.addContainers(container4);
        porto.addContainers(container5);
        porto.addContainers(container6);
        porto.addContainers(container7);
        porto.addContainers(container8);

        porto.ordenarContainers();
        System.out.println();
        System.out.println("Quantidade de containers de origem desconhecida com material perigoso: " +porto.quantidadeDeContainresPerigosos());
    }
}