package DiscoDuroDeRoer.folder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fichero {

    private String ruta;
    private String texto;
    private String nombre;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String leer(String ruta) {

        try {
            BufferedReader leer = new BufferedReader(new FileReader(ruta));
            texto=leer.readLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
return texto;
    }
    
    public String get_nombre(String ruta){
        File archivo;
        archivo = new File(ruta);
        return this.nombre=archivo.getName();
    }
    
    public void escribir(String ruta, String texto){
        
        BufferedWriter escribir;
        try {
            escribir= new BufferedWriter(new FileWriter(ruta));
            escribir.write(texto);
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    

}
