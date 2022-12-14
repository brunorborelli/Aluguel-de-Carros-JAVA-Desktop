package com.nohair.persistencia;

import com.nohair.modelos.Motorista;

import java.util.ArrayList;

public interface IMotoristaDao {
    void incluir(Motorista objeto)throws Exception;
    void alterar(Motorista objeto)throws Exception;
    ArrayList<Motorista> listagem()throws Exception;
    Motorista buscar(int id) throws Exception;

}
