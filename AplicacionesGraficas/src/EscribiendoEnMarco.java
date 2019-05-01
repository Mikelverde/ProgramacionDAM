
import java.awt.*;
import javax.swing.*;


public class EscribiendoEnMarco {

    public static void main(String[] args) {
        
        MarcoConTexto ventana=new MarcoConTexto();
        ventana.setDefaultCloseOperation(3);
        // TODO code application logic here
    }
    
}

//---------------------------------------------------------------------------

class MarcoConTexto extends JFrame{

    public MarcoConTexto() {
        
        setVisible(true);
        setSize(500,500);
        setLocation(600,400);
        setTitle("Marco con Texto");
        
        Lamina miLamina= new Lamina();
        
        add(miLamina);
        
    }
     
}

class Lamina extends JPanel{

    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo Swing", 100, 100);
        
    }
    
    
}
