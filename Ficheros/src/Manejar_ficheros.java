
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manejar_ficheros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 1;
        FileWriter nuevo_fichero = null;
        String directorio = "";
        while (opcion != 0) {
            System.out.println("     Escoja una opcion:");
            System.out.println("-------------------------------");
            System.out.println("1. Nuevo fichero.");
            System.out.println("2. Escribir fichero");
            System.out.println("3. Leer fichero.");
            System.out.println("0. Salir.");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el directorio y el nombre del archivo.");
                    directorio = entrada.nextLine();
                    try {
                        nuevo_fichero = new FileWriter(directorio);
                    } catch (IOException e) {
                        System.out.println("No se ha podido crear el fichero");
                    }
                    break;
                case 2:
                    System.out.println("¿que desa grabar en el fichero?");
                    String grabar = entrada.nextLine();
                    System.out.println(grabar);
                    try {
                        nuevo_fichero = new FileWriter("C:/Users/Alf/Desktop/Ficheros/Mikel.txt");
                        nuevo_fichero.write(grabar);
                    } catch (IOException ex) {
                        System.out.println("No se ha podido grabar la informacion");
                    }

                    break;
                case 3:
                    break;

            }

        }
    }
}
