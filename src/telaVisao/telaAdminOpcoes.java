/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telaVisao;

import java.text.ParseException;

/**
 *
 * @author bruno
 */
public class telaAdminOpcoes extends javax.swing.JFrame {

    /**
     * Creates new form telaAdminOpcoes
     */
    public telaAdminOpcoes() {
        initComponents();
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
        Bt_Cad_Veiculos = new javax.swing.JButton();
        jButton2CadastrarMarcas = new javax.swing.JButton();
        Bt_Cad_Cliente = new javax.swing.JButton();
        Bt_Cad_Modelos = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2Locacao = new javax.swing.JButton();
        Bt_Cad_Acessorios = new javax.swing.JButton();
        Bt_Cad_Categoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Consulta");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bem vindo, colaborador!");

        Bt_Cad_Veiculos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bt_Cad_Veiculos.setText("Cad. veículos");
        Bt_Cad_Veiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_VeiculosActionPerformed(evt);
            }
        });

        jButton2CadastrarMarcas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2CadastrarMarcas.setText("Cad. Marcas");
        jButton2CadastrarMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CadastrarMarcasActionPerformed(evt);
            }
        });

        Bt_Cad_Cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bt_Cad_Cliente.setText("Cadastrar Cliente");
        Bt_Cad_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_ClienteActionPerformed(evt);
            }
        });

        Bt_Cad_Modelos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bt_Cad_Modelos.setText("Cad. Modelos");
        Bt_Cad_Modelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_ModelosActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("Cad. Funcionário");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("Buscar Funcionario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setText("Buscar Motorista");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("Cad. Motorista");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2Locacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2Locacao.setText("Locaçao de Veículos");
        jButton2Locacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LocacaoActionPerformed(evt);
            }
        });

        Bt_Cad_Acessorios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bt_Cad_Acessorios.setText("Cad. Acessórios");
        Bt_Cad_Acessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_AcessoriosActionPerformed(evt);
            }
        });

        Bt_Cad_Categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bt_Cad_Categoria.setText("Cad. Categoria");
        Bt_Cad_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_CategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Bt_Cad_Veiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bt_Cad_Cliente, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2CadastrarMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_Cad_Modelos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2Locacao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bt_Cad_Acessorios)
                                .addGap(18, 18, 18)
                                .addComponent(Bt_Cad_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(31, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Cad_Cliente)
                    .addComponent(Bt_Cad_Modelos))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Cad_Veiculos)
                    .addComponent(jButton2CadastrarMarcas))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Cad_Acessorios)
                    .addComponent(Bt_Cad_Categoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton2Locacao)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_Cad_VeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_VeiculosActionPerformed
        // TODO add your handling code here:
        
        //telaAdminCadVeiculo f = new telaAdminCadVeiculo();
            TelaDeVeiculos f = new TelaDeVeiculos();
            this.dispose();
            f.setVisible(true);
    }//GEN-LAST:event_Bt_Cad_VeiculosActionPerformed

    private void jButton2CadastrarMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CadastrarMarcasActionPerformed
        // TODO add your handling code here:
        
        TelaDasMarcas b = new TelaDasMarcas();
            this.dispose();
            b.setVisible(true);
        
    }//GEN-LAST:event_jButton2CadastrarMarcasActionPerformed

    private void Bt_Cad_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_ClienteActionPerformed
            TelaDeClientes b = new TelaDeClientes();
            this.dispose();
            b.setVisible(true);
    }//GEN-LAST:event_Bt_Cad_ClienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        telaAdminCadFuncionario b = new telaAdminCadFuncionario();
            this.dispose();
            b.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Bt_Cad_ModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_ModelosActionPerformed
        TelaDosModelos b = new TelaDosModelos();
            this.dispose();
            b.setVisible(true);
    }//GEN-LAST:event_Bt_Cad_ModelosActionPerformed


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        TelaAdminBuscarMotorista f = new TelaAdminBuscarMotorista();
            this.dispose();                     // Fechar a tela ao abrir outra janela
            f.setLocationRelativeTo(null);      // Comando para centralizar a aplicação no centro do monitor
            f.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        TelaAdminCadMotorista b = null;
        try {
            b = new TelaAdminCadMotorista();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.dispose();
            b.setVisible(true);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2LocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LocacaoActionPerformed
        // TODO add your handling code here:
        TelaLocacao b = new TelaLocacao();
            this.dispose();
            b.setVisible(true);
    }//GEN-LAST:event_jButton2LocacaoActionPerformed

    private void Bt_Cad_AcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_AcessoriosActionPerformed
        // TODO add your handling code here:
        TelaAcessorios f = new TelaAcessorios();
            this.dispose();                     // Fechar a tela ao abrir outra janela
            f.setLocationRelativeTo(null);      // Comando para centralizar a aplicação no centro do monitor
            f.setVisible(true);
    }//GEN-LAST:event_Bt_Cad_AcessoriosActionPerformed

    private void Bt_Cad_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_CategoriaActionPerformed
        // TODO add your handling code here:
        TelaCategoria f = new TelaCategoria();
            this.dispose();                     // Fechar a tela ao abrir outra janela
            f.setLocationRelativeTo(null);      // Comando para centralizar a aplicação no centro do monitor
            f.setVisible(true);
    }//GEN-LAST:event_Bt_Cad_CategoriaActionPerformed


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
            java.util.logging.Logger.getLogger(telaAdminOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAdminOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAdminOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAdminOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAdminOpcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Cad_Acessorios;
    private javax.swing.JButton Bt_Cad_Categoria;
    private javax.swing.JButton Bt_Cad_Cliente;
    private javax.swing.JButton Bt_Cad_Modelos;
    private javax.swing.JButton Bt_Cad_Veiculos;
    private javax.swing.JButton jButton2CadastrarMarcas;
    private javax.swing.JButton jButton2Locacao;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
