package com.nohair.modelos;

public class Motorista {

    //atributos classe motorista id nome telefone endereco numeroCNH dataVencimentoCNH
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private String numeroCNH;
    private String dataVencimentoCNH;
    private String fotoMotoristaURL;


    //construtor classe motorista
    public Motorista(int id, String nome, String telefone, String endereco, String numeroCNH, String dataVencimentoCNH, String fotoMotoristaURL) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numeroCNH = numeroCNH;
        this.dataVencimentoCNH = dataVencimentoCNH;
        this.fotoMotoristaURL = fotoMotoristaURL;
    }

    public Motorista() {

    }

    public Motorista(int i, String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    //getters e setters classe motorista
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getFotoMotoristaURL() {
        return fotoMotoristaURL;
    }

    public void setFotoMotoristaURL(String fotoMotoristaURL) {
        this.fotoMotoristaURL = fotoMotoristaURL;
    }
    
    

    //toString classe motorista
    @Override
    public String toString() {
        return id + ";" + nome + ";" + telefone + ";" + endereco + ";" + numeroCNH + ";" + dataVencimentoCNH + ";" + fotoMotoristaURL;
    }


}

