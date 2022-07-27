package br.com.aula15.models;

public class Iate extends Embarcacao implements Comparable<Iate>{
    private int cabine;

    public Iate(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, String nome, String apelido, int registro, int cabine) {
        super(precoBase, valorAdicional, anoFabricacao, comprimento, nome, apelido, registro);
        this.cabine = cabine;
    }


    @Override
    public int compareTo(Iate i) {
        return Integer.compare(this.cabine, i.cabine);
    }

    public String iateLuxuoso(Iate i){
        if(this.compareTo(i) == 0){
            return "São iates do mesmo patamar";
        } if(this.compareTo(i) == -1){
            return "O outro Iate é mais luxuoso";
        }
        return "Seu iate é mais luxuoso";
    }

}
