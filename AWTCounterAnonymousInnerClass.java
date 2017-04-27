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

public class AWTCounterAnonymousInnerClass extends Frame {
  
   private TextField txtCount;
   private Button btnCount;
   private int count = 0;
 
   public AWTCounterAnonymousInnerClass () {
      setLayout(new FlowLayout()); 
      add(new Label("Counter"));    
      txtCount = new TextField("0", 10);
      txtCount.setEditable(false); 
      add(txtCount);               
 
      btnCount = new Button("Count");
      add(btnCount);               
 
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            txtCount.setText(count + "");
         }
      });
 
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   public static void main(String[] args) {
      new AWTCounterAnonymousInnerClass(); // Let the constructor do the job
   }
}
