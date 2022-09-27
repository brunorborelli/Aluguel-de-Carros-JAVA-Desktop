/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nohair.controle;

import com.nohair.modelos.Marca;
import java.util.ArrayList;

/**
 *
 * @author dhion
 */
public interface IMarcaControle {
     void incluir(Marca objeto)throws Exception;
    void alterar(Marca objeto)throws Exception;
    ArrayList<Marca> listagem()throws Exception;
}
