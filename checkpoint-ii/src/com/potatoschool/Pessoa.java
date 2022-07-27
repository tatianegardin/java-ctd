package com.potatoschool;

public abstract class Pessoa {

        private String nome;
        private int registro;
        private String email;

        public Pessoa(String nome, String email, int registro ){
            this.nome = nome;
            this.registro = registro;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public int getRegistro() {
            return registro;
        }

        public String getEmail() {
            return email;
        }


}
