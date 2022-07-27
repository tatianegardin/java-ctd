package br.com.aula15.models;

public class Veleiro extends Embarcacao{

    private int mastro;


    public Veleiro(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, String nome, String apelido, int registro, int mastro) {
        super(precoBase, valorAdicional, anoFabricacao, comprimento, nome, apelido, registro);
        this.mastro = mastro;
    }

    public boolean ehGrande(){
        if(this.mastro > 4){
            return true;
        }
        return false;
    }
}
