package br.com.porto.models;

public class Containers implements Comparable<Containers>{
    private int numero;
    private String paisOrigem;
    private String descricao;
    private boolean contemMaterialPerigoso;

    public Containers(int numero, String paisOrigem, boolean contemMaterialPerigoso) {
        this.numero = numero;
        this.paisOrigem = paisOrigem;
        this.contemMaterialPerigoso = contemMaterialPerigoso;
    }


    @Override
    public int compareTo(Containers o) {
        return Integer.compare(this.numero, o.numero);
    }

    public int getNumero() {
        return numero;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public boolean isContemMaterialPerigoso() {
        return contemMaterialPerigoso;
    }

    @Override
    public String toString() {
        return "Container: " + this.numero + " Pais de origem: " + this.paisOrigem;
    }
}
