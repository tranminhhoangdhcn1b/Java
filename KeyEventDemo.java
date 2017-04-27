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
public class KeyEventDemo extends Frame implements KeyListener {
 
   private TextField txtInput; 
   private TextArea taDisplay;
 
   public KeyEventDemo() {
      setLayout(new FlowLayout()); 
 
      add(new Label("Enter Text: "));
      txtInput = new TextField(10);
      add(txtInput);
      taDisplay = new TextArea(5, 40); 
      add(taDisplay);
 
      txtInput.addKeyListener(this);
 
      setTitle("KeyEvent Demo"); 
      setSize(400, 200);        
      setVisible(true);         
   }

   public static void main(String[] args) {
      new KeyEventDemo();  
   }
 

   @Override
   public void keyTyped(KeyEvent evt) {
      taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void keyPressed(KeyEvent evt) { }
   @Override public void keyReleased(KeyEvent evt) { }
}
    
