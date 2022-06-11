public class Main {
    public static void main(String[] args) {
        Cliente tatiane = new Cliente("Tatiane", 123456);
        tatiane.aumentarDivida(300);
        System.out.println(tatiane.getDivida());

        tatiane.diminuirDivida(100);
        System.out.println(tatiane.getDivida());
    }
}