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
public class AWTCount extends Frame implements ActionListener {
   
   private Label lblCount;    
   private TextField txtCount; 
   private Button btnCount;  
   private int count = 0;    
 
   public AWTCount() {
      setLayout(new FlowLayout());
         
      lblCount = new Label("Counter");  
      add(lblCount);                   
 
      txtCount = new TextField("0", 10); 
      txtCount.setEditable(false);       
      add(txtCount);                   
 
      btnCount = new Button("Count");   
      add(btnCount);                    
 
      btnCount.addActionListener(this);
         
      setTitle("AWT Counter");  
      setSize(250, 100);      
 
      setVisible(true);       
      
   }
 
   public static void main(String[] args) {
        
        AWTCount app = new AWTCount();
   }
 
   // ActionEvent handler - Called back upon button-click.
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count; // Increase the counter value
      // Display the counter value on the TextField txtCount
      txtCount.setText(count + ""); // Convert int to String
   }
}
