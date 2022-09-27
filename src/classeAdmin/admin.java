/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeAdmin;

/**
 *
 * @author bruno
 */
public class admin {
    
    //Atributos
    
    public String usuarioAdm;
    public String senhaAdm;
    
    
    //Construtor

    public admin(String usuarioAdm, String senhaAdm) {
        this.usuarioAdm = usuarioAdm;
        this.senhaAdm = senhaAdm;
    }
    
    //Getters & Setters

    public String getUsuarioAdm() {
        return usuarioAdm;
    }

    public void setUsuarioAdm(String usuarioAdm) {
        this.usuarioAdm = usuarioAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }
    
    
    
    
    
}
