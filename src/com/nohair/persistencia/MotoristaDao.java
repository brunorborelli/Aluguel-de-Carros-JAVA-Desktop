package com.nohair.persistencia;

import com.nohair.modelos.Motorista;
import com.nohair.util.id.GeradorID;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MotoristaDao implements IMotoristaDao {

    private String nomeDoArquivoNoDisco;
    public MotoristaDao() {
        nomeDoArquivoNoDisco = "./src/com/nohair/dados/txt/Motorista.txt";
    }

    @Override
    public void incluir(Motorista objeto) throws Exception {
        try{
            //Escreve o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            //Criar o buffer do arquivo
            BufferedWriter bw =new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorID.getID());
            //Escreve no arquivo
            bw.write(objeto.toString()+"\n");
            //fecha o arquivo
            bw.close();
        }catch(Exception erro){

            throw erro;
        }
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {
        try {
            Iterator<Motorista> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            //Criar o buffer do arquivo
           BufferedWriter bw =new BufferedWriter(fw);
            while(lista.hasNext()){
                Motorista aux = lista.next();
                if(aux.getId()== objeto.getId()){
                     bw.write(objeto.toString()+"\n");
                }
                else{
                    bw.write(aux.toString()+"\n");
                }
               }// GRAVAR NO ARQUIVO OBJETO
            bw.close();
         } catch(Exception erro){
         throw erro;
        }   
    }

    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        try {
            ArrayList<Motorista> listaDeMotorista = new ArrayList<Motorista>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Motorista objetoMotorista = new Motorista();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setTelefone(vetorString[2]);
                objetoMotorista.setEndereco(vetorString[3]);
                objetoMotorista.setNumeroCNH(vetorString[4]);
                objetoMotorista.setDataVencimentoCNH(vetorString[5]);
                objetoMotorista.setFotoMotoristaURL(vetorString[6]);
                listaDeMotorista.add(objetoMotorista);
            }
            br.close();
            return listaDeMotorista;
        } catch(Exception erro){
            throw erro;
        }
    }

        @Override
    public Motorista buscar(int id) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Motorista objetoMotorista = new Motorista();
            String vetorString[] = linha.split(";");
            objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setTelefone(vetorString[2]);
                objetoMotorista.setEndereco(vetorString[3]);
                objetoMotorista.setNumeroCNH(vetorString[4]);
                objetoMotorista.setDataVencimentoCNH(vetorString[5]);
                objetoMotorista.setFotoMotoristaURL(vetorString[6]);
                br.close();
                return new Motorista((Integer.parseInt(vetorString[0])), vetorString[1], vetorString[2],vetorString[3],vetorString[4],vetorString[5],vetorString[6]);
            }
        
        return null;

    }
    public void ChecarTxt(){
        try{
            File Motorista = new File("./src/com/nohair/dados/txt/Motorista.txt");
            if(!Motorista.exists()){
                Motorista.createNewFile();
            }
        }catch(IOException ex){

        }
    }

}

