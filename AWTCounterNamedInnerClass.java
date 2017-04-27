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
 public class AWTCounterNamedInnerClass extends Frame {
  
   private TextField txtCount;
   private Button btnCount;
   private int count = 0;
 
   public AWTCounterNamedInnerClass () {
      setLayout(new FlowLayout());  
      add(new Label("Counter"));   
      txtCount = new TextField("0", 10);
      txtCount.setEditable(false);   
      add(txtCount);               
 
      btnCount = new Button("Count");
      add(btnCount);                

      btnCount.addActionListener(new BtnCountListener());
 
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 

   public static void main(String[] args) {
      new AWTCounterNamedInnerClass(); // Let the constructor do the job
   }
 
   /**
    * BtnCountListener is a "named inner class" used as ActionListener.
    * This inner class can access private variables of the outer class.
    */
   private class BtnCountListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
         ++count;
         txtCount.setText(count + "");
      }
   }
}

