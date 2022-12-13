package com.nohair.modelos;

public class Motorista {

    //atributos classe motorista id nome telefone endereco numeroCNH dataVencimentoCNH
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private String numeroCNH;
    private String dataVencimentoCNH;


    //construtor classe motorista
    public Motorista(int id, String nome, String telefone, String endereco, String numeroCNH, String dataVencimentoCNH) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numeroCNH = numeroCNH;
        this.dataVencimentoCNH = dataVencimentoCNH;
    }

    public Motorista() {

    }

    //getters e setters classe motorista
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public String getDataVencimentoCNH() {
        return dataVencimentoCNH;
    }

    public void setDataVencimentoCNH(String dataVencimentoCNH) {
        this.dataVencimentoCNH = dataVencimentoCNH;
    }

    //toString classe motorista
    @Override
    public String toString() {
        return id + ";" + nome + ";" + telefone + ";" + endereco + ";" + numeroCNH + ";" + dataVencimentoCNH;
    }


}

