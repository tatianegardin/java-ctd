package br.com.company.models;

public class DataException extends Exception{

    public DataException() {
        super();
    }

    public DataException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "A seguinte exceção ocorreu " + this.getClass().getName() + "\n" + "Mensagem: " + this.getMessage();
    }
}
