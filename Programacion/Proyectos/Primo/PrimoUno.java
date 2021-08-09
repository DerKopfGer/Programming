import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PrimoUno extends JFrame implements ActionListener{

  private JLabel jlabel1, jlabel2, jlabel3, jlabel4, jlabel5;
  private JButton boton1;
 
  public PrimoUno(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Mi regalo");
   getContentPane().setBackground(new Color(249,231,183));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.jpg")).getImage());

   jlabel1 = new JLabel("Feliz Cumpleaños primo");
   jlabel1.setBounds(170,10,500,100);
   jlabel1.setFont(new Font("Harrington" , 1 , 36));
   add(jlabel1);

   jlabel2 = new JLabel("!!Te queremos mucho!!");
   jlabel2.setBounds(180,660,500,100);
   jlabel2.setFont(new Font("Harrington" , 1 , 36));
   add(jlabel2);

   ImageIcon imagen1 = new ImageIcon("images/Familia.jpg");
   jlabel3 = new JLabel(imagen1);
   jlabel3.setBounds(140,5,500,780);
   add(jlabel3);

   ImageIcon imagen2 = new ImageIcon("images/corazon.jpg");
   jlabel4 = new JLabel(imagen2);
   jlabel4.setBounds(5,5,160,300);
   add(jlabel4);

   ImageIcon imagen3 = new ImageIcon("images/corazon.jpg");
   jlabel5 = new JLabel(imagen3);
   jlabel5.setBounds(535,5,300,300);
   add(jlabel5);
   

   boton1 = new JButton("Continuar");
   boton1.setBounds(10,250,160,150);
   boton1.setFont(new Font("Harrington" , 1 , 20));
   boton1.setBackground(new Color(224,224,224));
   boton1.setForeground(new Color(0,0,0));
   boton1.addActionListener(this);
   add(boton1);   

  } 

   public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == boton1){
    PrimoDos primo2 = new PrimoDos();
    primo2.setBounds(0,0,800,800);
    primo2.setVisible(true);
    primo2.setLocationRelativeTo(null);
    primo2.setResizable(false);
    this.setVisible(false);   
 
    }
 }
    public static void main(String args[]){
      PrimoUno primo1 = new PrimoUno();
      primo1.setBounds(0,0,780,800);
      primo1.setVisible(true);
      primo1.setLocationRelativeTo(null);
      primo1.setResizable(false);
    
    }

}