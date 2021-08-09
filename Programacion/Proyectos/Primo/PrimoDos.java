import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

  public class PrimoDos extends JFrame implements ActionListener{

  private JLabel jlabel1, jlabel2, jlabel3, jlabel4, jlabel5, jlabel6;
  private JButton boton1;  

   public PrimoDos(){
 
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Que lo disfrutes");
   getContentPane().setBackground(new Color(151,191,242));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.jpg")).getImage());

   jlabel1 = new JLabel("Posdata");
   jlabel1.setBounds(280,30,500,200);
   jlabel1.setFont(new Font("Harrington" , 1 , 50));
   add(jlabel1);

   jlabel2 = new JLabel("Busca en Steam: App Game Kit Classic");
   jlabel2.setBounds(40,200,800,200);
   jlabel2.setFont(new Font("Harrington" , 1 , 36));
   add(jlabel2);

   jlabel3 = new JLabel("para que empieces a desarrollar juegos");
   jlabel3.setBounds(40,400,800,200);
   jlabel3.setFont(new Font("Harrington" , 1 , 36));
   add(jlabel3);
 
   jlabel4 = new JLabel("GRATIS");
   jlabel4.setBounds(310,600,800,200);
   jlabel4.setFont(new Font("Harrington" , 1 , 36));
   add(jlabel4);
   
   ImageIcon imagen = new ImageIcon("images/regalo.jpg");
   jlabel4 = new JLabel(imagen);
   jlabel4.setBounds(5,5,160,300);
   add(jlabel4);
 
   ImageIcon imagen1 = new ImageIcon("images/regalo.jpg");
   jlabel5 = new JLabel(imagen1);
   jlabel5.setBounds(535,5,300,300);
   add(jlabel5);

   boton1 = new JButton("Salir");
   boton1.setBounds(650,650,100,100);
   boton1.setBackground(new Color(224,224,224));
   boton1.setForeground(new Color(0,0,0));
   boton1.setFont(new Font("Harrington" , 1 , 26));
   boton1.addActionListener(this);
   add(boton1);
   

  }  

    public void actionPerformed(ActionEvent evento){
      if(evento.getSource() == boton1){
        System.exit(0);
      }
 
  }

   
     public static void main(String args[]){

      PrimoDos primo2 = new PrimoDos();
      primo2.setBounds(0,0,800,800);
      primo2.setVisible(true);
      primo2.setLocationRelativeTo(null);
      primo2.setResizable(false);

 } 
}