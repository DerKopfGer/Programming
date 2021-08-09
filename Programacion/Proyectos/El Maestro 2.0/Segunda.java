import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Segunda extends JFrame implements ActionListener{

  private JButton boton1, boton2, boton3, boton4;
  private JLabel jlabel;
  
  public Segunda(){
 
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("La magia existe");
    getContentPane().setBackground(new Color(224,224,224));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

    boton1 = new JButton("Logros");
    boton1.setBounds(40,300,150,100);
    boton1.setBackground(new Color(165,28,48));
    boton1.setFont(new Font("Times New Roman", 1, 20));
    boton1.setForeground(new Color(0,0,0));
    boton1.addActionListener(this);
    add(boton1);

    boton2 = new JButton("Season 7");
    boton2.setBounds(20,30,350,200);
    boton2.setBackground(new Color(165,28,48));
    boton2.setFont(new Font("Times New Roman", 1, 32));
    boton2.setForeground(new Color(0,0,0));
    boton2.addActionListener(this);
    add(boton2);

    boton3 = new JButton("Acerca de");
    boton3.setBounds(200,300,150,100);
    boton3.setBackground(new Color(165,28,48));
    boton3.setFont(new Font("Times New Roman", 1, 20));
    boton3.setForeground(new Color(0,0,0));
    boton3.addActionListener(this);
    add(boton3);

    boton4 = new JButton("ALFAJORCITOS");
    boton4.setBounds(20,500,350,200);
    boton4.setBackground(new Color(165,28,48));
    boton4.setFont(new Font("Times New Roman", 1, 32));
    boton4.setForeground(new Color(0,0,0));
    boton4.addActionListener(this);
    add(boton4);

    ImageIcon imagen = new ImageIcon("images/vandalo.jpg");
    jlabel = new JLabel(imagen);
    jlabel.setBounds(400,100,338,600);
    add(jlabel); 

  }

    public void actionPerformed(ActionEvent evento){
     if(evento.getSource() == boton1){

     }
  
     if(evento.getSource() == boton2){

     }
  
     if(evento.getSource() == boton3){

     }
 
     if(evento.getSource() == boton4){

     }
 
   }

       public static void main(String args[]){
       Segunda segunda1 = new Segunda();
       segunda1.setBounds(0,0,800,800);
       segunda1.setVisible(true);
       segunda1.setResizable(false);
       segunda1.setLocationRelativeTo(null);
     
    } 
        
}