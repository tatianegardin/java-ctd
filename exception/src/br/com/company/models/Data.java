package br.com.company.models;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int d, int m, int a) throws Exception {

        if(d<1 | d>31 ){
            throw new DataException("Dia inválido");
        }
        if( m<1 |m>12){
            throw new DataException("Mês inválido");
        }
        if(a<1900 | a>3000){
            throw new DataException("Ano inválido");
        }
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void getData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
