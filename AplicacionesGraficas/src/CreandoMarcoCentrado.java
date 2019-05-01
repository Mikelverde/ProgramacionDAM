
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;


public class CreandoMarcoCentrado {

    public static void main(String[] args) {
        
        MarcoCentrado marco=new MarcoCentrado();
        marco.setVisible(true);
        marco.setTitle("Marco Centrado");
        marco.setDefaultCloseOperation(3);
        
        // TODO code application logic here
    }
    
}

//------------------------------------------------------------------------

 class MarcoCentrado extends JFrame{
     
     public MarcoCentrado(){
         
         Toolkit mipantalla= Toolkit.getDefaultToolkit();
         
         Dimension tamanoPantalla=mipantalla.getScreenSize();
         
         int alturaPantalla= tamanoPantalla.height;
         int anchoPantalla= tamanoPantalla.width;
         
         setSize(anchoPantalla/2,alturaPantalla/2);
         setLocation(anchoPantalla/4,alturaPantalla/4);
         
       
     }
     
     
    
}
