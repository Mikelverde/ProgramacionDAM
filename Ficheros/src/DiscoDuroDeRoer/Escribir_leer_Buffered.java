
package DiscoDuroDeRoer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Escribir_leer_Buffered {

    
    public static void main(String[] args) {
        
        try {
            //creamos los objetos necesarios, en este caso un file y un buffered
            BufferedWriter escribir =new BufferedWriter(new FileWriter("C:\\Users\\Alf\\Desktop\\Ficheros\\Buffered.txt",true));
            BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\Alf\\Desktop\\Ficheros\\Buffered.txt"));
            
            escribir.write("Programa ejemplo del uso de la clase Buffered \n \r");
            escribir.flush();
            String linea=leer.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=leer.readLine();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Escribir_leer_Buffered.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
    }
    
}
