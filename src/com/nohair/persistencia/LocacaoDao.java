/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nohair.persistencia;

import com.nohair.modelos.Locacao;
import com.nohair.util.id.GeradorID;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class LocacaoDao implements ILocacaoDao{
    
    private String nomeDoArquivoNoDisco;

    public LocacaoDao() {
        nomeDoArquivoNoDisco = "./src/com/nohair/dados/txt/Locacao.txt";
    }


    @Override
    public void locar(Locacao objeto) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorID.getID());
            //Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {
        throw new UnsupportedOperationException("erro no locacaoDao"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Locacao> listagem() throws Exception {
        try {
            ArrayList<Locacao> listaDeLocacao = new ArrayList<Locacao>();
            File arquivo = new File("./src/com/nohair/dados/txt/Locacao.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/nohair/dados/txt/Locacao.txt";
            }
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                IVeiculosDao objetoVeiculo = new VeiculosDao();
                IMotoristaDao objetoMotorista = new MotoristaDao();
                IAcessoriosDao objetoAcessorio = new AcessoriosDao();
                Locacao objetoLocacao = new Locacao();
                String vetorString[] = linha.split(";");
                objetoLocacao.setId(Integer.parseInt(vetorString[0]));
                int idMotorista = Integer.parseInt(vetorString[2]);
                objetoLocacao.setMotorista(objetoMotorista.buscar(idMotorista));
                int idVeiculo = Integer.parseInt(vetorString[3]);
                objetoLocacao.setVeiculo(objetoVeiculo.buscar(idVeiculo));
                int idAcessorios = Integer.parseInt(vetorString[4]);
                objetoLocacao.setAcessorio(objetoAcessorio.buscar(idAcessorios));
                objetoLocacao.setDataInicio(vetorString[5]);
                objetoLocacao.setDataFim(vetorString[6]);
                objetoLocacao.setValorDaLocação(Float.parseFloat(vetorString[7]));
                objetoLocacao.setSituacao(vetorString[8]);
                
                
                listaDeLocacao.add(objetoLocacao);

            }
            br.close();
            return listaDeLocacao;
        } catch (Exception erro) {
            throw erro;
        }
    } 
    {
}
}
