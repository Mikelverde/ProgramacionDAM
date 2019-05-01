
package DiscoDuroDeRoer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Repaso_02 {

   
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada=new Scanner(System.in);
        
        System.out.println("Ruta del archivo");
        String ruta;
        ruta=entrada.nextLine();
        
        System.out.println("Escribe un texto");
        String texto;
        texto=entrada.nextLine();
        
       escribir_fichero(ruta,texto);
       
    }
    
    public static void escribir_fichero (String ruta, String texto){
        
        FileWriter escribir;
        try {
            escribir= new FileWriter(ruta);
            escribir.write(texto);
            escribir.close();

        } catch (IOException ex) {
            Logger.getLogger(Repaso_02.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    


}
