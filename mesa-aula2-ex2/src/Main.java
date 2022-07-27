import java.util.Scanner;

public class Main {
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
        Integer a, b, c;

        System.out.println("Digite um número");
        a = scanner.nextInt();

        System.out.println("Digite outro número");
        b = scanner.nextInt();

        System.out.println("Digite mais um número");
        c = scanner.nextInt();

        maiorNumero(a, b, c);
    }
}