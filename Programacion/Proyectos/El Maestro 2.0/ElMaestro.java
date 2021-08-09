import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.URI;

public class ElMaestro extends JFrame implements ActionListener{

  private JLabel label1, label2, label3;
  private JButton boton1, boton2; 

  public ElMaestro(){
  
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("El mejor Vládimir");
   getContentPane().setBackground(new Color(0,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon imagen = new ImageIcon("C:/Users/demia/Desktop/Programacion/Proyectos/El Maestro 2.0/images/vladimir.png");
   label1 = new JLabel(imagen);
   label1.setBounds(220,100,338,600);
   add(label1);

   label2 = new JLabel("EL MAESTRO 2.0");                     
   label2.setBounds(220,10,500,100);
   label2.setFont(new Font("Times New Roman", 3, 45));
   label2.setForeground(new Color(224,224,224));
   add(label2);

   label3 = new JLabel("©El Maestro 2.0 todos los derechos reservados");
   label3.setBounds(200,680,500,100);
   label3.setFont(new Font("Times New Roman", 1, 20));
   label3.setForeground(new Color(224,224,224));
   add(label3);

   boton1 = new JButton("Visitar");
   boton1.setBounds(570,350,200,180);
   boton1.setBackground(new Color(224,224,224));
   boton1.setFont(new Font("Times New Roman", 1, 30));
   boton1.setForeground(new Color(0,0,0));
   boton1.addActionListener(this);
   add(boton1);
   
   boton2 = new JButton("Continuar");
   boton2.setBounds(10,350,200,180);
   boton2.setBackground(new Color(224,224,224));
   boton2.setFont(new Font("Times New Roman", 1, 30));
   boton2.setForeground(new Color(0,0,0));
   boton2.addActionListener(this);
   add(boton2);
 }

   public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == boton1){
     
    }

    if(evento.getSource() == boton2){
       Segunda segunda1 = new Segunda();
       segunda1.setBounds(0,0,800,800);
       segunda1.setVisible(true);
       segunda1.setResizable(false);
       segunda1.setLocationRelativeTo(null);
       this.setVisible(false);
    }
  }  

   public static void main(String args[]){
   
   ElMaestro maestro = new ElMaestro();
   maestro.setBounds(0,0,800,800);
   maestro.setVisible(true);
   maestro.setLocationRelativeTo(null);
   maestro.setResizable(false);
      
   }
}

