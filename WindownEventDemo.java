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
public class WindownEventDemo extends Frame implements ActionListener, WindowListener{
   
   private TextField tfCount; 
   private Button btnCount;    
   private int count = 0;      
   
   public WindownEventDemo() {
      setLayout(new FlowLayout());
 
      add(new Label("Counter"));  
 
      tfCount = new TextField("0", 10); 
      tfCount.setEditable(false);       
      add(tfCount);                   
 
      btnCount = new Button("Count");  
      add(btnCount);                   
 
      btnCount.addActionListener(this);
 
      addWindowListener(this);
 
      setTitle("WindowEvent Demo");
      setSize(250, 100);           
      setVisible(true);           
   }
 
   public static void main(String[] args) {
      new WindownEventDemo();  
   }
 
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count;
      tfCount.setText(count + "");
   }
 
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0); 
   }
 
  
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
}