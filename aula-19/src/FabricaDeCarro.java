public class FabricaDeCarro {

    public static FabricaDeCarro INSTANCE = new FabricaDeCarro();
    private int totalCarrosFiat;
    private int totalCarrosFord;
    private int totalCarrosVolks;

    private FabricaDeCarro() {
        this.totalCarrosVolks = 10;
    }

    public String criarCarroVolks() {
        return new String("Carro Volks #" + totalCarrosVolks++ + " criado.");
    }

    public String criarCarroFord() {
        return new String("Carro Ford #" + totalCarrosFord++ + " criado.");
    }

    public String criarCarroFiat() {
        return new String("Carro Fiat #" + totalCarrosFiat++ + " criado.");
    }
    public String gerarRelatorio() {

        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat
                + "\nTotal de carros Ford vendidos: " + totalCarrosFord
                + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
    }

    public static FabricaDeCarro getInstance() {
        return INSTANCE;
    }
}
