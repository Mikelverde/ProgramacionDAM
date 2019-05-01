package DiscoDuroDeRoer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Repaso_01 {

    public static void main(String[] args) {

        FileReader leer;
        try {
            leer = new FileReader("C:\\Users\\Alf\\Desktop\\Ficheros\\repaso_01.txt");
            int condicion = 0;
            int valor;
            while (condicion != -1) {
                valor = leer.read();
                if (valor != 32) {
                    if (valor == -1) {

                    } else {
                        System.out.print((char) valor);
                    }
                    condicion = valor;
                }

            }
            System.out.println("");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Repaso_01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Repaso_01.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
