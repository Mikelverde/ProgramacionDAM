
package DiscoDuroDeRoer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Copiar_imagen_FileInputStream {


    public static void main(String[] args) {
        
        try {
            FileInputStream leer=new FileInputStream("C:\\Users\\Alf\\Desktop\\Ficheros\\imagen.jpg");
            int valor=0;
            int contador=0;
            int [] datos=new int[17514];
            while(valor!=-1){
                valor=leer.read();
                datos[contador]=valor;               
                contador++;
            }
           
            FileOutputStream escribir=new FileOutputStream("C:\\Users\\Alf\\Desktop\\Ficheros\\imagen_copia.jpg");
             for(int i=0;i<datos.length-1;i++){
                escribir.write(datos[i]);
            }
            

   
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Copiar_imagen_FileInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Copiar_imagen_FileInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
