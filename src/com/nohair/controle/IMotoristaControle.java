package com.nohair.controle;

import com.nohair.modelos.Motorista;

import java.util.ArrayList;

public interface IMotoristaControle {

    void incluir(Motorista objeto)throws Exception;
    void alterar(Motorista objeto)throws Exception;
    ArrayList<Motorista> listagem()throws Exception;
}
