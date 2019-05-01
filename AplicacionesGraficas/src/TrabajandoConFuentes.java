
import java.awt.*;
import javax.swing.*;


public class TrabajandoConFuentes {


    public static void main(String[] args) {
        
        MarcoConFuentes ventana=new MarcoConFuentes();
        ventana.setDefaultCloseOperation(3);
 
    }
    
}

//---------------------------------------------------------------------------

class MarcoConFuentes extends JFrame{
    
    public MarcoConFuentes(){
    setTitle("Prueba con Fuentes");
    setSize(400,400);
    LaminaConFuentes lamina=new LaminaConFuentes();
    this.add(lamina);
    setVisible(true);
    
    }
  }

class LaminaConFuentes extends JPanel{

   public void paintComponent(Graphics g){
       super.paintComponent(g);
       Graphics2D g2=(Graphics2D)g;
       Font miFuente=new Font("Arial",Font.BOLD,26);
       Font miFuente2=new Font("Arial",Font.BOLD,18);
       g2.setFont(miFuente);
       g2.drawString("Me huele el pito a ...", 100, 100);
       g2.setFont(miFuente2);
       g2.drawString("canelaaaaaa!", 100, 130);
       
   }
    
}
