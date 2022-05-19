import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String seuNome ;
        Integer num;
        Integer num2;
        int compatibilidade;

        System.out.println("Digite um nome");
        nome = scanner.nextLine();

        System.out.println("Digite o Seu nome");
        seuNome = scanner.nextLine();

        System.out.println("Digite um valor");
        num = scanner.nextInt();

        System.out.println("Digite outro valor");
        num2 = scanner.nextInt();


        if (num % num2 == 0) {
            System.out.println(num + " é divisivel por " + num2 + " o resultado da divisão é " + num / num2);
        } else {
            System.out.println("Não é divisivel");
        }
        System.out.println();

        if (nome.equals(seuNome)) {
            System.out.println("Os nomes são iguais");
        } else {
            System.out.println("Os nomes são diferentes");
        }

        System.out.println();

        compatibilidade = num.compareTo(num2);
        if (num.equals(num2)) {
            System.out.println("Os números são iguais");
        } else {
            if (compatibilidade > 0) {
                System.out.println("O primeiro número é maior");
            } else {
                System.out.println("O segundo número é maior");
            }
        }


    }
}