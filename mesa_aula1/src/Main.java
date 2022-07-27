public class Main {
    public static void main(String[] args) {
        Animais cachorro = new Animais();
        Animais gato = new Animais();
        Animais peixe = new Animais();

        cachorro.setTipo("Cachorro");
        cachorro.setNome("Shesheu");
        cachorro.setIdade(2);
        cachorro.setQtdComida("1kg e meio");
        cachorro.setBarulho("au au");

        gato.setTipo("Gato");
        gato.setNome("Snow");
        gato.setIdade(3);
        gato.setQtdComida("meio quilo");
        gato.setBarulho("miau");

        peixe.setTipo("Peixe");
        peixe.setNome("Nemo");
        peixe.setIdade(1);
        peixe.setQtdComida("140 gramas");
        peixe.setBarulho("glub glub");

        System.out.println(cachorro.getNome() + " " + cachorro.getIdade() + " anos");
        System.out.println(cachorro.getNome() + " come " + cachorro.getQtdComida() + " e faz " + cachorro.getBarulho());

        System.out.println();
        System.out.println(gato.getNome() + " " + gato.getIdade() + " anos");
        System.out.println(gato.getNome() + " come " + gato.getQtdComida() + " e faz " + gato.getBarulho());

        System.out.println();
        System.out.println(peixe.getNome() + " " + peixe.getIdade() + " anos");
        System.out.println(peixe.getNome() + " come " + peixe.getQtdComida() + " e faz " + peixe.getBarulho());
    }
}