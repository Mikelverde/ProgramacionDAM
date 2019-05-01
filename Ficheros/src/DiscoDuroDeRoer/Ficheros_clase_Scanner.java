package DiscoDuroDeRoer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros_clase_Scanner {

    public static void main(String[] args) {

        String ruta;
        ruta = "C:\\Users\\Alf\\Desktop\\Ficheros\\numeros.txt";
        String ruta_2 = "C:\\Users\\Alf\\Desktop\\Ficheros\\numeros_02.txt";
        File fichero = new File(ruta);
        Scanner entrada;

        Scanner entrada_teclado = new Scanner(System.in);
        System.out.println("¿A partir de que numero quieres leer el documento?");
        int numero = entrada_teclado.nextInt();

        File fichero_salida = new File(ruta_2);

        

        try {
            entrada = new Scanner(fichero);
            PrintWriter escribir = new PrintWriter(fichero_salida);

            while (entrada.hasNext()) {//devuelve true si hay mas datos, false si ha llegado al final
                int fila = entrada.nextInt();
                if (fila > numero) {
                    escribir.println(fila);

                }

            }
            escribir.close();
            

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
