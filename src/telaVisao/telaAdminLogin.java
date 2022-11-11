/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telaVisao;

import com.nohair.modelos.admin;
import com.nohair.persistencia.AdminDao;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telaVisao.telaAdminOpcoes;

/**
 *
 * @author bruno
 */
public class telaAdminLogin extends javax.swing.JFrame {
    
    //admin admin = new admin();
    
    
    
    
    

    /**
     * Creates new form telaAdminLogin
     */
    public telaAdminLogin() {
        initComponents();
        AdminDao objeto = new AdminDao();
        objeto.ChecarTxt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoUsuarioAdm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoSenhaAdm = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha:");

        CampoUsuarioAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioAdmActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Administrador");

        CampoSenhaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaAdmActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CampoUsuarioAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin)
                            .addComponent(CampoSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoUsuarioAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoSenhaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaAdmActionPerformed

    private void CampoUsuarioAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioAdmActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        /*                  Botão login 
            Vamos pegar o usuario e a senha do administrador e validar
        */
        
      /* admin.*///String usuarioAdm="admin";
      /* admin.*///String senhaAdm= "admin";
        
        
        // String usuarioAdm = CampoUsuarioAdm.getText();
        // String senhaAdm = String.valueOf(CampoSenhaAdm.getPassword());
        
        /*if( "admin".equals(usuarioAdm) && senhaAdm=="admin" ){   //usuarioAdm.equals(admin.getUsuarioAdm()) && senhaAdm.equals(admin.getSenhaAdm())){
            telaAdminOpcoes f = new telaAdminOpcoes();
            this.dispose();
            f.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "Usuario ou Senha incorreta");
        }*/
        
        
        /*try {
            BufferedReader b;
            b = new BufferedReader(new FileReader("<path to file>"));
            String[] user=new String[30];
            String line="";
            while ((line = b.readLine()) != null) {
             user[i]=line; 
             System.out.println(user[1]);
             i++;}
            } catch (FileNotFoundException ex) {
            Logger.getLogger(telaAdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        /*telaAdminOpcoes f = new telaAdminOpcoes();
            this.dispose();
            f.setVisible(true);
        */
        
        try {
                
                String s;
                String bypassid = "guest";
                String bypasspw = "guest";
                String[] array;
                boolean isLogin= false; 
                BufferedReader br = new BufferedReader(new FileReader("./src/com/nohair/dados/txt/Admin.txt"));
                while((s=br.readLine())!=null) {
                    array=s.split(";");
                    if(CampoUsuarioAdm.getText().equals(array[1])&&CampoSenhaAdm.getText().equals(array[2])){
                        //JOptionPane.showMessageDialog(null, "erro1");
                        telaAdminOpcoes f = new telaAdminOpcoes();
                        this.dispose();                     // Faz com que a tela feche ao abrir outra
                        f.setLocationRelativeTo(null);      // Comando para centralizar a aplicação no centro do monitor
                        f.setVisible(true);
                        isLogin = true;
                        break;
                    } else if(array.length != 0 && bypassid.equals(CampoUsuarioAdm.getText())&&bypasspw.equals(CampoSenhaAdm.getText())){
                        JOptionPane.showMessageDialog(null, "erro2");
                        isLogin = true;
                       
                        break;
                    } 
                }
                if(isLogin == false) {
                    JOptionPane.showMessageDialog(this, "Usuario ou Senha incorreta");
                        telaInicio f = new telaInicio();
                        this.dispose();
                        f.setLocationRelativeTo(null);      // Comando para centralizar a aplicação no centro do monitor
                        f.setVisible(true);
                        
                }
                //br.close();
            } catch (IOException e10) {
                
                
                
                e10.printStackTrace();
            }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaAdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CampoSenhaAdm;
    private javax.swing.JTextField CampoUsuarioAdm;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
