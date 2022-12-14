package com.nohair.modelos;

public class Locacao {
    //atributos da classe locação id, dataInicio, dataFim, valorDaLocacao, situacao
    private int id;
    private String dataInicio;
    private String dataFim;
    private Float valorDaLocacao;
    private String situacao;

    private int idCliente;
    private int idVeiculo;
    private int idMotorista;
    private int idAcessorios;

    //construtor da classe locação
    public Locacao(int id, String dataInicio, String dataFim, Float valorDaLocacao, String situacao, int idCliente, int idVeiculo, int idMotorista, int idAcessorios) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorDaLocacao = valorDaLocacao;
        this.situacao = situacao;
        this.idCliente = idCliente;
        this.idVeiculo = idVeiculo;
        this.idMotorista = idMotorista;
        this.idAcessorios = idAcessorios;
    }

    public Locacao() {

    }

    //getters e setters da classe locação
public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Float getValorDaLocacao() {
        return valorDaLocacao;
    }

    public void setValorDaLocacao(Float valorDaLocacao) {
        this.valorDaLocacao = valorDaLocacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public int getIdAcessorios() {
        return idAcessorios;
    }

    public void setIdAcessorios(int idAcessorios) {
        this.idAcessorios = idAcessorios;
    }


    //método toString da classe locação
    @Override
    public String toString() {
        return id + ";" + dataInicio + ";" + dataFim + ";" + valorDaLocacao + ";" + situacao + ";" + idCliente + ";" + idVeiculo + ";" + idMotorista + ";" + idAcessorios;
    }




}
