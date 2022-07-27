public interface EstadoReparo {
    void mudarEndereco(String endereco);
    void mudarEstado();
    void darOrcamento(double valor);
    void adicionarItensExtras(double valorExtra);
}
