/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nohair.persistencia;

import com.nohair.modelos.Acessorios;
import com.nohair.util.id.GeradorID;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bruno
 */
public class AcessoriosDao implements IAcessoriosDao {
    private String nomeDoArquivoNoDisco;

    public AcessoriosDao() {
        nomeDoArquivoNoDisco = "./src/com/nohair/dados/txt/Acessorios.txt";
    }

    @Override
    public void incluir(Acessorios objeto) throws Exception {
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
    public void alterar(Acessorios objeto) throws Exception {
        try {
            Acessorios objetoAcessorios = new Acessorios();
            Iterator<Acessorios> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Acessorios aux = lista.next();
                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");

                } else {
                    bw.write(aux.toString() + "\n");
                }
            }
            bw.close();

        } catch (Exception e) {
        }

    }

    @Override
    public ArrayList<Acessorios> listagem() throws Exception {
        try {
            ArrayList<Acessorios> listaDeAcessorios = new ArrayList<Acessorios>();
            File arquivo = new File("./src/com/nohair/dados/txt/Acessorios.txt");
            if(!arquivo.exists()){
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/nohair/dados/txt/Acessorios.txt";
            }
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Acessorios objetoAcessorios = new Acessorios();
                String vetorString[] = linha.split(";");
                objetoAcessorios.setId(Integer.parseInt(vetorString[0]));
                objetoAcessorios.setDescricao(vetorString[1]);
                objetoAcessorios.setValorDaLocacao(Float.parseFloat(vetorString[2]));
                objetoAcessorios.setSituacao(vetorString[3]);
                listaDeAcessorios.add(objetoAcessorios);
            }
            br.close();
            return listaDeAcessorios;
        } catch (Exception erro) {
            throw erro;
        }
    }
public void ChecarTxt(){
            try{
                File Admin = new File("./src/com/nohair/dados/txt/Acessorio.txt");
                if(!Admin.exists()){
                    Admin.createNewFile();
                }
            }catch(IOException ex){
                
            }}
    @Override
    public Acessorios buscar(int id) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Acessorios objetoAcessorios = new Acessorios();
            String vetorString[] = linha.split(";");
            objetoAcessorios.setId(Integer.parseInt(vetorString[0]));
            objetoAcessorios.setDescricao(vetorString[1]);
            objetoAcessorios.setValorDaLocacao(Float.parseFloat(vetorString[2]));
            if (objetoAcessorios.getId() == id) {
                br.close();
                return new Acessorios((Integer.parseInt(vetorString[0])), vetorString[1], Float.parseFloat(vetorString[2]),vetorString[3]);
            }
        }
        return null;
    }
}
