import java.util.Scanner;

public class Main {
    //Exercicio 1
    static boolean numeroPrimo(Integer numero) {
        boolean primo = false;
        if (numero.equals(2)) {
            primo = true;
        }
        for (Integer i = 2; i < numero; i++) {
            if (!numero.equals(i)) {
                int resto = numero % i;
                if (resto != 0) {
                    primo = true;
                } else {
                    primo = false;
                    break;
                }
            }
        }
        return primo;
    }

    //Exercicio 1
    static void respostaNumeroPrimo(boolean result) {
        if (result) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
        }
    }

    //Exercicio 2
    static void maiorNumero(Integer a, Integer b, Integer c) {
        Integer maxNum;
        if (a.compareTo(b) == 1) {
            if (a.compareTo(c) == 1) {
                maxNum = a;
            } else {
                maxNum = c;
            }
        } else {
            if (b.compareTo(c) == 1) {
                maxNum = b;
            } else {
                maxNum = c;
            }
        }
        System.out.println("O maior número que você digitou é " + maxNum);
    }



        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numeroPrimo, a, b, c;


        System.out.println("Digite um valor para saber se ele é número primo ou não");
        numeroPrimo = scanner.nextInt();
        respostaNumeroPrimo(numeroPrimo(numeroPrimo));


        System.out.println("Digite um número");
        a = scanner.nextInt();

        System.out.println("Digite outro número");
        b = scanner.nextInt();

        System.out.println("Digite mais um número");
        c = scanner.nextInt();

        maiorNumero(a, b, c);

    }
}