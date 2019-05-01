package DiscoDuroDeRoer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros {

    private String direccion;
    private int numero_bytes;
    private int[] datos;

    public int numero_bytes(String direccion) {
        FileInputStream leer;
        int contador = 0;

        try {
            int condicion = 0;
            leer = new FileInputStream(direccion);
            while (condicion != -1) {
                condicion = leer.read();
                contador++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero_bytes = contador;

    }

  
    public void leer_fichero(String direccion, int[] datos) {
        FileInputStream leer;
        int contador = 0;
        try {
            leer = new FileInputStream(direccion);
            int condicion = 0;
            while (condicion != -1) {
                condicion = leer.read();
                datos[contador] = condicion;
                contador++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void escribir_fichero(String direccion, int[]datos) throws IOException{
        FileOutputStream escribir_fichero;
        try {
            escribir_fichero=new FileOutputStream(direccion);
            for(int i=0;i<datos.length-1;i++){
                escribir_fichero.write(datos[i]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

}
