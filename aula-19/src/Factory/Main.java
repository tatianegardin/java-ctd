package Factory;

public class Main {
    public static void main(String[] args) {
        DispositivoFactory dispositivoFactory = new DispositivoFactory();
        Dispositivo iphoneX = dispositivoFactory.fazerUmIphone("x");
        Dispositivo iphone11 = dispositivoFactory.fazerUmIphone("11");
        Dispositivo iphone = dispositivoFactory.fazerUmIphone("111");

        System.out.println(iphoneX);
        System.out.println(iphone);
        System.out.println(iphone11);


    }
}
