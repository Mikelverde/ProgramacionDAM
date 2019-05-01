package DiscoDuroDeRoer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Repaso_05 {

    public static void main(String[] args) {

        int numeros;
        String ruta;

        numeros = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros genero?"));
        ruta = JOptionPane.showInputDialog("ruta del fichero");
        escribir(ruta, numeros);
        leer(ruta);

    }

    //--------------------------------------------------------------------------------------
    public static int aleatorios() {

        int numero_aleatorio = (int) (Math.random() * 100);
        return numero_aleatorio;

    }

    public static void escribir(String ruta, int numeros) {
        DataOutputStream escribir;
        try {
            escribir = new DataOutputStream(new FileOutputStream(ruta));
            for (int i = 0; i < numeros; i++) {
                escribir.writeInt(aleatorios());
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Repaso_05.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Repaso_05.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void leer(String ruta) {
        DataInputStream leer;
        try {
            leer = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                System.out.println(leer.readInt());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Repaso_05.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Repaso_05.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        }

    }

}
