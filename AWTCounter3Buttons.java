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
public class AWTCounter3Buttons extends Frame {
   private TextField txtCount;
   private Button btnCountUp, btnCountDown, btnReset;
   private int count = 0;

   public AWTCounter3Buttons () {
      setLayout(new FlowLayout());
      add(new Label("Counter"));   
      txtCount = new TextField("0", 10);
      txtCount.setEditable(false); 
      add(txtCount);                
 
      btnCountUp = new Button("Count Up");
      add(btnCountUp);

      btnCountUp.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            txtCount.setText(count + "");
         }
      });
 
      btnCountDown = new Button("Count Down");
      add(btnCountDown);
      btnCountDown.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count--;
            txtCount.setText(count + "");
         }
      });
 
      btnReset = new Button("Reset");
      add(btnReset);
      btnReset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count = 0;
            txtCount.setText("0");
         }
      });
 
      setTitle("AWT Counter");
      setSize(400, 100);
      setVisible(true);
   } 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounter3Buttons();  
   }
}
   
