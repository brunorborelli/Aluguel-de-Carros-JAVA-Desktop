package com.nohair.controle;

import com.nohair.modelos.Motorista;
import com.nohair.persistencia.MotoristaDao;
import com.nohair.persistencia.IMotoristaDao;

import java.util.ArrayList;
import java.util.Iterator;

    public class MotoristaControle implements IMotoristaControle{

    public static ArrayList<Motorista> buscarMotorista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        IMotoristaDao MotoristaPersistencia = null;
        public MotoristaControle(){
            this.MotoristaPersistencia = new MotoristaDao();
        }
        private boolean buscarMotorista(String nome)throws Exception{
            try {
                ArrayList<Motorista> listagem = MotoristaPersistencia.listagem();
                Iterator<Motorista> lista = listagem.iterator();
                while(lista.hasNext()){
                    Motorista aux = lista.next();
                    if(aux.getNome().equalsIgnoreCase(nome)){
                        return true;
                    }
                }
                return false;
            } catch (Exception erro) {
                throw erro;
            }
        }
        @Override
        public void incluir(Motorista objeto) throws Exception {
            if(buscarMotorista(objeto.getNome())){
                throw new Exception("Motorista já foi cadastrado");
            }
            MotoristaPersistencia.incluir(objeto);
        }
        
        @Override
    public void alterar(Motorista objeto) throws Exception {
        if (buscarMotorista(objeto.getNome())) {
            throw new Exception("Motorista já foi cadastrada");
        }
        if ("".equals(objeto.getTelefone().replace(" ", ""))) {
            throw new Exception("Digite o Telefone");
        }

        if ("".equals(objeto.getEndereco().replace(" ", ""))) {
            throw new Exception("Digite o endereço");
        }
        
        if ("".equals(objeto.getNumeroCNH().replace(" ", ""))) {
            throw new Exception("Digite o numero da CNH");
        }
        
        if ("".equals(objeto.getDataVencimentoCNH().replace(" ", ""))) {
            throw new Exception("Digite a data de vencimento");
        }
        
        if ("".equals(objeto.getFotoMotoristaURL().replace(" ", ""))) {
            throw new Exception("Selecione a foto da CNH");
        }
        MotoristaPersistencia.alterar(objeto);
    }
    /*
        @Override
        public void alterar(Motorista objeto) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
*/
        @Override
        public ArrayList<Motorista> listagem() throws Exception {
            return MotoristaPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

