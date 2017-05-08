import java.awt.*;
import java.awt.event.*;
public class TongHieuTichThuong extends Frame implements ActionListener, WindowListener{
    Label lblA=new Label("A=");
    Label lblB=new Label("b=");
    Label lblKQ=new Label("KQ");
    TextField txtA=new TextField(10);
    TextField txtB=new TextField(10);
    TextField txtKQ=new TextField(20);
    Button btnTong=new Button("Tong");
    Button btnHieu=new Button("Hieu");
    Button btnTich=new Button("Tich");
    Button btnThuong=new Button("Thuong");
    Button btnThoat=new Button("Thoat");
    public TongHieuTichThuong()
    {
        this.add(lblA);
        this.add(txtA);
        this.add(lblB);
        this.add(txtB);
        this.add(btnTong);
        btnTong.addActionListener(this);
        this.add(btnHieu);
        btnHieu.addActionListener(this);
        this.add(btnTich);
        btnTich.addActionListener(this);
        this.add(btnThuong);
        btnThuong.addActionListener(this);
        this.add(lblKQ);
        this.add(txtKQ);
        this.add(btnThoat);
        btnThoat.addActionListener(this);
        txtKQ.setEditable(false);
        addWindowListener(this);
        
        
        this.setLayout(new GridLayout(6,2,0,10));
        this.setBackground(Color.cyan);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnTong)
        {
            long a=Integer.parseInt(txtA.getText());
            long b=Integer.parseInt(txtB.getText());
            long c=a+b;
            txtKQ.setText(c + ""); 
        }
         if(e.getSource()==btnHieu)
        {
            long a=Integer.parseInt(txtA.getText());
            long b=Integer.parseInt(txtB.getText());
            long c=a-b;
            txtKQ.setText(c + ""); 
            

        }
          if(e.getSource()==btnTich)
        {
            long a=Integer.parseInt(txtA.getText());
            long b=Integer.parseInt(txtB.getText());
            long c=a*b;
            txtKQ.setText(c + ""); 
            

        }
           if(e.getSource()==btnThuong)
        {
            long a=Integer.parseInt(txtA.getText());
            long b=Integer.parseInt(txtB.getText());S
            double c=(float)a/b;
            txtKQ.setText(c + ""); 
            

        }
           if(e.getSource()==btnThoat)
        {
            System.exit(0);
            

        }
    }
    public static void main(String[] args) {
        TongHieuTichThuong thtt=new TongHieuTichThuong();
        thtt.setTitle("TongHieuTichThuong");
        thtt.setSize(400,250);
        
        thtt.setVisible(true);
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