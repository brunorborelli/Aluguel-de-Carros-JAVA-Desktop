/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nohair.controle;

import com.nohair.modelos.Acessorios;
import com.nohair.persistencia.AcessoriosDao;
import com.nohair.persistencia.IAcessoriosDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bruno
 */
public class AcessoriosControle implements IAcessoriosControle{
    
    
    IAcessoriosDao AcessoriosPersistencia = null;

    public AcessoriosControle() {
        this.AcessoriosPersistencia = new AcessoriosDao();
    }

    private boolean buscarAcessorios (String descricao) throws Exception {
      try {
            ArrayList<Acessorios> listagem = AcessoriosPersistencia.listagem();
            Iterator<Acessorios> lista = listagem.iterator();
            while (lista.hasNext()) {
                Acessorios aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
          throw erro;
        }
    }

    @Override
    public void incluir(Acessorios objeto) throws Exception {
        if (buscarAcessorios(objeto.getDescricao())) {
            throw new Exception("Acessorio já foi cadastrado");
        }

        if ("".equals(objeto.getDescricao().replace(" ", ""))) {
            throw new Exception("Digite a Descrição");
        }

       if (objeto.getValorDaLocacao()==0) {
           throw new Exception("Digite o Valor da Locação");
        }

        AcessoriosPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Acessorios objeto) throws Exception {
        /*if (buscarAcessorios(objeto.getDescricao())) {
            throw new Exception("Acessorio já foi cadastrado");
        }*/
        if ("".equals(objeto.getDescricao().replace(" ", ""))) {
            throw new Exception("Digite a Descrição");
        }

       // if ("".equals(objeto.getUrl().replace(" ", ""))) {
         //   throw new Exception("Selecione Uma Imagem");
        //}
        AcessoriosPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Acessorios> listagem() throws Exception {
        return AcessoriosPersistencia.listagem(); 
    }

    @Override
    public Acessorios buscar(int id) throws Exception {
        return AcessoriosPersistencia.buscar(id);
    }

    
}
