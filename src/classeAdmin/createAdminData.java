/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeAdmin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import classeAdmin.admin;
import telaVisao.telaAdminCadFuncionario;

/**
 *
 * @author bruno
 */






/*
public class createAdminData {
    
    public static void criarArquivoDeADM()throws FileNotFoundException, IOException{
        String cadastroADM ="./src/dataSetFiles/cadastroADM.txt";
         FileWriter fw = new FileWriter(cadastroADM);
        //Criar o buffer do arquivo
        BufferedWriter bw =new BufferedWriter(fw);
        //Escreve no arquivo
        String saida = 1+"";
        bw.write(saida);
        //fecha o arquivo
        bw.close();	
    }
    public static int getID()throws FileNotFoundException, IOException{
        admin usuario = new admin (jTextFieldUsuarioCadNome.getText(), jTextFieldSenhaFunc.getText());
        
        String cadastroADM ="./src/dataSetFiles/cadastroADM.txt";
        FileReader fr = new FileReader(cadastroADM);
        BufferedReader br  = new BufferedReader(fr);
        String linha=br.readLine();
        int id = Integer.parseInt(linha);
        String usuarioAdm = admin.usuarioAdm;
        String senhaAdm = "";
        br.close();
        id++;
        //cria o arquivo
        FileWriter fw = new FileWriter(cadastroADM);
        //Criar o buffer do arquivo
        BufferedWriter bw =new BufferedWriter(fw);
        //Escreve no arquivo
        String saida = id+";"+usuarioAdm+";"+senhaAdm;
        bw.write(saida);
        //fecha o arquivo
        bw.close();	
        return id;
        
        String usuarioTeste = usuario.usuarioAdm;
    }
    
}
*/