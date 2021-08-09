import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel jlabel1, jlabel2;
  private JButton boton1, boton2;
  private JTextArea jtext1;
  private JCheckBox check1;
  private JScrollPane scrollpane1;
  String nombre = "";

  public Licencia(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombre = ventanaBienvenida.texto;
   
   jlabel1 = new JLabel("TÉRMINOS Y CONDICIONES");
   jlabel1.setBounds(215,5,200,30);
   jlabel1.setFont(new Font("Andale Mono", 1, 14));
   jlabel1.setForeground(new Color(0,0,0));
   add(jlabel1); 

   jtext1 = new JTextArea();
   jtext1.setEditable(false);
   jtext1.setFont(new Font("Andale Mono" , 0, 9));
   jtext1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                  "\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE DEMIÁN BAQUÉ." +
                  "\n          B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                  "\n          C.  DEMIÁN BAQUÉ NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                  "\n\n        LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                  "\n        EL CREADOR DEMIÁN BAQUÉ, NO SE RESPONSABILIZA DEL USO QUE USTED" +
                  "\n        HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (ACEPTO)" +
                  "\n        SI USTED NO ACEPTA ESTOS TÉRMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+
                  "\n\n        PARA MAYOR INFORMACIÓN SOBRE NUESTOS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +        
                  "\n        FACEBOOK.COM/DEMIÁNBAQUÉ");        
   scrollpane1 = new JScrollPane(jtext1);
   scrollpane1.setBounds(10,40,575,200);
   add(scrollpane1);

   check1 = new JCheckBox("Yo " + nombre + " Acepto");
   check1.setBounds(10,250,300,30);
   check1.addChangeListener(this);
   add(check1);

   boton1 = new JButton("Continuar");
   boton1.setBounds(10,290,100,30);
   boton1.addActionListener(this);
   boton1.setEnabled(false);
   add(boton1);

   boton2 = new JButton("No Acepto");
   boton2.setBounds(120,290,100,30);
   boton2.addActionListener(this);
   boton2.setEnabled(true);
   add(boton2);

   ImageIcon imagen = new ImageIcon("images/coca-cola.png");
   jlabel2 = new JLabel(imagen);
   jlabel2.setBounds(315,135,300,300);
   add(jlabel2);
      

  }

   public void stateChanged(ChangeEvent evento){
    if(check1.isSelected() == true){
     boton1.setEnabled(true);
     boton2.setEnabled(false);
    } else {
     boton1.setEnabled(false);
     boton2.setEnabled(true);
    }

  }
   
   public void actionPerformed(ActionEvent evento){
     if(evento.getSource() == boton1){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);

     } else if(evento.getSource() == boton2 ){
       Bienvenida ventanabienvenida = new Bienvenida();
       ventanabienvenida.setBounds(0,0,350,450);
       ventanabienvenida.setVisible(true);
       ventanabienvenida.setResizable(false);
       ventanabienvenida.setLocationRelativeTo(null);
       this.setVisible(false);
     }

  }


   public static void main(String args[]){
    Licencia licencia1 = new Licencia();
    licencia1.setBounds(0,0,600,370);
    licencia1.setVisible(true);
    licencia1.setLocationRelativeTo(null);
    licencia1.setResizable(false);

  }
}
