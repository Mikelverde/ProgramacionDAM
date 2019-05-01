package DiscoDuroDeRoer;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Copiar_cualquier_fichero {

    public static void main(String[] args) {

        String direccion = "C:\\Users\\Alf\\Desktop\\Ficheros\\imagen.jpg";
        String direccion_copia = "C:\\Users\\Alf\\Desktop\\Ficheros\\imagen_nueva.jpg";
        Ficheros fichero = new Ficheros();
        int[] datos = new int[fichero.numero_bytes(direccion)];
        System.out.println(fichero.numero_bytes(direccion));
        fichero.leer_fichero(direccion, datos);
        try {
            fichero.escribir_fichero(direccion_copia, datos);
        } catch (IOException ex) {
            Logger.getLogger(Copiar_cualquier_fichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
