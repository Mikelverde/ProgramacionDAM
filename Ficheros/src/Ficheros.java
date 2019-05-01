
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alf
 */
//public class Ficheros {
//
//    public void escribir(String frase) {
//
//        String frase_1 = frase;
//        try {
//            FileWriter escritura = new FileWriter("C:/Users/Alf/Desktop/tarea06.txt");
//            for (int i = 0; i < frase_1.length(); i++) {
//                escritura.write(frase_1.charAt(i));
//            }
//            escritura.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("algun problema hay");
//        }
//    }
//
//}
public class Ficheros {

    public void escribir(String frase) {// escribe caracter a caracter

        String frase_01 = frase;

        try {
            FileWriter escritura = new FileWriter("C:/Users/Alf/Desktop/Tarea06.txt");

            for (int i = 0; i < frase_01.length(); i++) {
                escritura.write(frase_01.charAt(i));
            }

            escritura.close();

        } catch (IOException ex) {
            Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void escribir_string(String frase) {// escribe el String entero

        String frase_01 = frase;

        try {
            FileWriter escritura = new FileWriter("C:/Users/Alf/Desktop/Tarea06.txt", true);

            escritura.write(frase_01);

            escritura.close();

        } catch (IOException ex) {
            Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void leer(String frase) {
        String directorio = frase;
        try {
            FileReader leer_fichero = new FileReader(directorio);
            int c = 0;
            do {
                try {
                    c = leer_fichero.read();
                    char letra = (char) c;
                    System.out.print(letra);
                } catch (IOException ex) {
                    Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
                }

            } while (c != -1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void lee() {
        try {
            /*El direcctorio tiene que estar con doble barra \\ o con bara invertida / y escrito en ingles*/
            FileReader entrada = new FileReader("C:\\Users\\Alf\\Desktop\\Tarea06.txt");
            int c = 0;//el metodo read devuelve un numero real//

            while (c != -1) {// el metodo read devuelve un -1 al llegar al final de la informacion//
                c = entrada.read();
                char letra = (char) c;//convertimos el numero que devuelve el metodo char en una letra//
                System.out.print(letra);
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el fichero");
        }
    }
}
