package DiscoDuroDeRoer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Repaso_06 {

    public static void main(String[] args) {

        String matricula;
        String marca;
        double deposito;
        String modelo;
        String ruta;
        ruta = "C:\\Users\\Alf\\Desktop\\Ficheros\\Coches.txt";

        matricula = JOptionPane.showInputDialog("que matricula tiene el coche?");
        marca = JOptionPane.showInputDialog("Que marca es el coche?");
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Capacidad del deposito"));
        modelo = JOptionPane.showInputDialog("Que modelo es el coche?");
        escribir(ruta, matricula, marca, deposito, modelo);
        leer(ruta);

    }

    //------------------------------------------------------------------------
    public static void escribir(String ruta, String matricula, String marca, double deposito, String modelo) {

        DataOutputStream coches;
        try {
            coches = new DataOutputStream(new FileOutputStream(ruta, true));
            coches.writeUTF(matricula);
            coches.writeUTF(marca);
            coches.writeDouble(deposito);
            coches.writeUTF(modelo);
            coches.flush();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Repaso_06.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Repaso_06.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void leer(String ruta) {
        String matricula;
        String marca;
        double deposito;
        String modelo;
        DataInputStream coche;
        try {
            coche = new DataInputStream(new FileInputStream(ruta));
            matricula = "vacio";
            while (matricula != null) {

                matricula = coche.readUTF();
                marca = coche.readUTF();
                deposito = coche.readDouble();
                modelo = coche.readUTF();
                System.out.println("El vehiculo tiene la matricula " + matricula + " es un " + modelo + " de " + marca + " con un deposito de capacidad " + deposito);

            }
            coche.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Repaso_06.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("fin");
        }
    }

}
