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

public class MouseMotionDemo extends Frame implements MouseListener, MouseMotionListener {

   private TextField txtMouseClickX;
   private TextField txtMouseClickY;
 
   private TextField txtMousePositionX;
   private TextField txtMousePositionY;
 
   public MouseMotionDemo() {
      setLayout(new FlowLayout()); 
 
      add(new Label("X-Click: "));
      txtMouseClickX = new TextField(10);
      txtMouseClickX.setEditable(false);
      add(txtMouseClickX);
      add(new Label("Y-Click: "));
      txtMouseClickY = new TextField(10);
      txtMouseClickY.setEditable(false);
      add(txtMouseClickY);
 
      add(new Label("X-Position: "));
      txtMousePositionX = new TextField(10);
      txtMousePositionX.setEditable(false);
      add(txtMousePositionX);
      add(new Label("Y-Position: "));
      txtMousePositionY = new TextField(10);
      txtMousePositionY.setEditable(false);
      add(txtMousePositionY);
 
      addMouseListener(this);
      addMouseMotionListener(this);
 
      setTitle("MouseMotion Demo");
      setSize(400, 120);           
      setVisible(true);          
   }
 
   // The entry main() method
   public static void main(String[] args) {
      new MouseMotionDemo();  
   }

   @Override
   public void mouseClicked(MouseEvent evt) {
      txtMouseClickX.setText(evt.getX() + "");
      txtMouseClickY.setText(evt.getY() + "");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
 
   /** MouseMotionEvent handlers */
   // Called back when the mouse-pointer has been moved
   @Override
   public void mouseMoved(MouseEvent evt) {
      txtMousePositionX.setText(evt.getX() + "");
      txtMousePositionY.setText(evt.getY() + "");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void mouseDragged(MouseEvent evt) { }
}
   
