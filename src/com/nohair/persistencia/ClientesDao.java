/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nohair.persistencia;

import com.nohair.modelos.Clientes;
import com.nohair.util.id.GeradorID;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author ejmcc
 */
public class ClientesDao implements IClientesDao{
    
    private String nomeDoArquivoNoDisco;
    
    public ClientesDao() {
        nomeDoArquivoNoDisco = "./src/com/nohair/dados/txt/Clientes.txt";

    }
    
    @Override
    public void incluir(Clientes objeto) throws Exception {
        try{
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            //Criar o buffer do arquivo
            BufferedWriter bw =new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorID.getID());
            //Escreve no arquivo
            bw.write(objeto.toString()+"\n");
            //fecha o arquivo
            bw.close();		
        }
        catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public void alterar(Clientes objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Clientes> listagem() throws Exception {
        try {
            ArrayList<Clientes> listaDeClientes = new ArrayList<Clientes>();
            
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
                while((linha=br.readLine())!=null){
                
                    Clientes objetoClientes = new Clientes();
                
                    String vetorString[] = linha.split(";");
                
                    objetoClientes.setId(Integer.parseInt(vetorString[0]));
                
                    objetoClientes.setNomeCompleto(vetorString[1]); 
                
                    objetoClientes.setCPF(vetorString[2]);
                
                    objetoClientes.setCNH(vetorString[3]);
                
                    objetoClientes.setValid_CNH(vetorString[4]);
                
                    objetoClientes.setData_Nasc(vetorString[5]);
                
                    objetoClientes.setTelefone(vetorString[6]);
                
                    objetoClientes.setEndereco(vetorString[7]);
                
                    objetoClientes.setBairro(vetorString[8]);
                
                    objetoClientes.setCEP(vetorString[9]);
                
                    objetoClientes.setCidade(vetorString[10]);
                
                    objetoClientes.setEstado(vetorString[11]);
                
                    objetoClientes.setMoto_Auto(vetorString[12]);
                
                    objetoClientes.setCNH_Moto_Auto(vetorString[13]);
                    
                    objetoClientes.setCaminho_Foto(vetorString[14]);
                
                    listaDeClientes.add(objetoClientes);
                }
         br.close();
         return listaDeClientes;
        } 
        catch(Exception erro){
            throw erro;
        }
    }
    
    
}
