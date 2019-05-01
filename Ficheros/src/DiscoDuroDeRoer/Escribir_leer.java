package DiscoDuroDeRoer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir_leer {

    public static void main(String[] args) throws IOException {

        //crear un objeto FileWriter pàra crear el fichero
        FileWriter escribir;
        escribir = new FileWriter("C:\\Users\\Alf\\Desktop\\Ficheros\\DiscoDuroRoer.txt");
        escribir.write("Esto es una prueba joñgjomnqrñonghinqéh");
        escribir.close();
        //crear un objeto que FileReader para leer el fichero
        FileReader leer;
        leer = new FileReader("C:\\Users\\Alf\\Desktop\\Ficheros\\DiscoDuroRoer.txt");
        int valor;
        valor = 0;
        while (valor != -1) {
            valor = leer.read();
            System.out.print((char) valor);

        }
        leer.close();

    }

}
