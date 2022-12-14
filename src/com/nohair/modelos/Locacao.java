package com.nohair.modelos;

public class Locacao {
    public class Locacao {
    
    private int id;
    private Clientes cliente;
    private Motorista motorista;
    private Veiculos veiculo;
    private Acessorios acessorio;
    private String dataInicio;
    private String dataFim;
    private Float valorDaLocação;
    private Object situacao;

    public Locacao() {
    }

    public Locacao(int id, Clientes cliente, Motorista motorista, Veiculos veiculo, Acessorios acessorio, String dataInicio, String dataFim, Float valorDaLocação, Object situacao) {
        this.id = id;
        this.cliente = cliente;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.acessorio = acessorio;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorDaLocação = valorDaLocação;
        this.situacao = situacao;
    }

    public Object getSituacao() {
        return situacao;
    }

    public void setSituacao(Object situacao) {
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    public Acessorios getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorios acessorio) {
        this.acessorio = acessorio;
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

    public Float getValorDaLocação() {
        return valorDaLocação;
    }

    public void setValorDaLocação(Float valorDaLocação) {
        this.valorDaLocação = valorDaLocação;
    }

    @Override
    public String toString() {
        return id + ";" + cliente.getId() + ";" + motorista.getId()  + ";" + veiculo.getId() + ";" + acessorio.getId() + ";" + dataInicio + ";" + dataFim + ";" + valorDaLocação + ";" + situacao;
    }
    



    }
}
