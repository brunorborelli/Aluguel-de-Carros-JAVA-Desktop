/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nohair.controle;

import com.nohair.modelos.Locacao;
import com.nohair.persistencia.ILocacaoDao;
import com.nohair.persistencia.LocacaoDao;
import java.util.ArrayList;



/**
 *
 * @author bruno
 */
public class LocacaoControle implements ILocacaoControle{
    
ILocacaoDao locacaoPersistencia = new LocacaoDao();

    @Override
    public void locar(Locacao objeto) throws Exception {
        locacaoPersistencia.locar(objeto);
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Locacao> listagem() throws Exception {
        return locacaoPersistencia.listagem();
    }
}