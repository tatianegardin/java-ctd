public class Cliente {
    private String nome;
    private int numeroCliente;
    private double divida;

    public Cliente(String nome, int numeroCliente){
        this.nome = nome;
        this.numeroCliente = numeroCliente;
    }

    public void aumentarDivida(int valor){
        this.divida += valor ;
    }
    public void diminuirDivida(int valor){
        this.divida -= valor ;
    }

    public double getDivida() {
        return divida;
    }
}

