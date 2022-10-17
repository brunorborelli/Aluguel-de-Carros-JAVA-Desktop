/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nohair.modelos;

/**
 *
 * @author ejmcc
 */
public class Clientes {
    // 14 Variaveis de Atributos
    private int id = 0;
    private String NomeCompleto = "";
    private String CPF = "";
    private String CNH = "";
    private String Valid_CNH = "";
    private String Data_Nasc = "";
    private String Telefone = "";
    private String Endereco = "";
    private String Bairro = "";
    private String CEP = "";
    private String Cidade = "";
    private String Estado = "";
    private String Moto_Auto = "";
    private String CNH_Moto_Auto = "";
        
    public Clientes(){
    }
    
    public Clientes(int id, String NomeCompleto, String CPF, String CNH, String Valid_CNH, String Data_Nasc, String Telefone,
            String Endereco, String Bairro, String CEP, String Cidade, String Estado, String Moto_Auto, String CNH_Moto_Auto ){
        
        this.id = id;
        this.NomeCompleto = NomeCompleto;
        this.CPF = CPF;
        this.CNH = CNH;
        this.Valid_CNH = Valid_CNH;
        this.Data_Nasc = Data_Nasc;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Moto_Auto = Moto_Auto;
        this.CNH_Moto_Auto = CNH_Moto_Auto;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getValid_CNH() {
        return Valid_CNH;
    }

    public void setValid_CNH(String Valid_CNH) {
        this.Valid_CNH = Valid_CNH;
    }

    public String getData_Nasc() {
        return Data_Nasc;
    }

    public void setData_Nasc(String Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getMoto_Auto() {
        return Moto_Auto;
    }

    public void setMoto_Auto(String Moto_Auto) {
        this.Moto_Auto = Moto_Auto;
    }

    public String getCNH_Moto_Auto() {
        return CNH_Moto_Auto;
    }

    public void setCNH_Moto_Auto(String CNH_Moto_Auto) {
        this.CNH_Moto_Auto = CNH_Moto_Auto;
    }

   
    @Override
    public String toString() {
        return id + ";" + NomeCompleto + ";" + CPF + ";" + CNH + ";" + Valid_CNH 
            + ";"+ Data_Nasc + ";" + Telefone + ";" + Endereco + ";" + Bairro 
            + ";" + CEP + ";" + Cidade + ";" + Estado + ";" + Moto_Auto + ";" + CNH_Moto_Auto + ";";
    }
    
}
