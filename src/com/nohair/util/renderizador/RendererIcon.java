/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nohair.util.renderizador;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author dhion
 */
public class RendererIcon extends DefaultTableCellRenderer{
    
JLabel icone = new JLabel();

@Override
public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col){

if(isSelected){
    this.setBackground(table.getBackground());
    this.setForeground(table.getForeground());
}else{
this.setBackground(table.getBackground());
this.setForeground(table.getForeground());
}
ImageIcon logo = new ImageIcon(table.getValueAt(2, col-1).toString());
icone.setText("");
logo.setImage(logo.getImage().getScaledInstance(60, 60,1));
icone.setIcon(logo);
icone.setHorizontalAlignment(CENTER);
    return icone;



}

    
  
    

}