package DiscoDuroDeRoer.folder;

import javax.swing.JOptionPane;

public class Repaso_03 {

    public static void main(String[] args) {

        String ruta_01 = JOptionPane.showInputDialog("Escribe la ruta del primer archivo");
        String ruta_02 = JOptionPane.showInputDialog("Escribe la ruta del segundo archivo");
        String ruta_copia = JOptionPane.showInputDialog("Escribe la ruta de destino para la copia");

        ruta_01 = "C:\\Users\\Alf\\Desktop\\Ficheros\\Repaso_02.txt";
        ruta_02 = "C:\\Users\\Alf\\Desktop\\Ficheros\\repaso_01.txt";

        Fichero leer_01 = new Fichero();
        leer_01.leer(ruta_01);
        System.out.println(leer_01.getTexto());

        Fichero leer_02 = new Fichero();
        leer_02.leer(ruta_02);
        System.out.println(leer_02.getTexto());

        String nombre_fichero_copia_01= leer_01.get_nombre(ruta_01).substring(0, (leer_01.get_nombre(ruta_01).length() - 4));
        String nombre_fichero_copia_02= leer_02.get_nombre(ruta_02).substring(0, (leer_02.get_nombre(ruta_02).length() - 4));
        String nombre_fichero_copia=nombre_fichero_copia_01+nombre_fichero_copia_02+".txt";
        
        ruta_copia="C:\\Users\\Alf\\Desktop\\Ficheros"+"\\"+nombre_fichero_copia;
        
        String Texto_copia=(leer_01.getTexto()+leer_02.getTexto());
        Fichero copia=new Fichero();
        copia.escribir(ruta_copia, Texto_copia);
        
        

    }

}
