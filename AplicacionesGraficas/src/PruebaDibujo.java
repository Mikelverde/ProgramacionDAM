
import java.awt.*;
import javax.swing.*;


public class PruebaDibujo {

 
    public static void main(String[] args) {
        
        MarcoConDibujos ventana=new MarcoConDibujos();
       

    }
    
}

//---------------------------------------------------------

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,300);
        setTitle("Prueba de Dibujo");
        
        LaminaConFiguras miLamina=new LaminaConFiguras();
        add(miLamina);
        
    }
}

class LaminaConFiguras extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 200);
       
        
        
        
        
    }
    
}
