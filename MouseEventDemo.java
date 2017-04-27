/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframe;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PC
 */
    
public class MouseEventDemo extends Frame implements MouseListener {
   
   private TextField txtMouseX; 
   private TextField txtMouseY; 
 
   public MouseEventDemo() {
      setLayout(new FlowLayout()); 

      add(new Label("X-Click: ")); 

      txtMouseX = new TextField(10); 
      txtMouseX.setEditable(false); 
      add(txtMouseX);               

      add(new Label("Y-Click: "));

      txtMouseY = new TextField(10);
      txtMouseY.setEditable(false); 
      add(txtMouseY);               
 
      addMouseListener(this);
        
      setTitle("MouseEvent Demo"); 
      setSize(350, 100);           
      setVisible(true);           
   }
 
   public static void main(String[] args) {
      new MouseEventDemo(); 
   }
 
   @Override
   public void mouseClicked(MouseEvent evt) {
      txtMouseX.setText(evt.getX() + "");
      txtMouseY.setText(evt.getY() + "");
   }
 
   // Not used - need to provide an empty body to compile.
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
}