package br.com.potatoSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Professor> listaDePessoas = new ArrayList<Professor>();

        Scanner scanner = new Scanner(System.in);
        boolean inicializador = true;
        while(inicializador) {
            System.out.println("1- Professor \n2- Aluno \n3-sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite um nome");
                    String nomeProfessor = scanner.next();
                    listaDePessoas.add(new Professor(nomeProfessor));
                    break;
                case 2:
                    System.out.println("Digite um nome");
                    String nomeAluno = scanner.next();
                    System.out.println("digite qual professor vc quer atribuir");
                    for (int i = 0; i< listaDePessoas.size(); i++){
                         System.out.println(i + listaDePessoas.get(i).getNome());
                    }
                    int indice = scanner.nextInt();
                    listaDePessoas.get(indice).adicionaAluno(new Aluno(nomeAluno));
                    break;
                case 3:
                    inicializador = false;
                    break;
                default :
                    System.out.println("Numero Inválido!");
                    break;
            }
        }

        for(Professor pessoa: listaDePessoas){
            System.out.println("Professor: " + pessoa.getNome());
            for(Aluno aluno: pessoa.getListaAluno()){
                System.out.println("Aluno: " + aluno.getNome());
            }
            System.out.println();
        }
    }
}
