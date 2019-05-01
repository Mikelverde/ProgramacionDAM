
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Copiar_imagen {

    public static void main(String[] args) {

        int[] datos = new int[17513];
        try {
            FileInputStream file_input = new FileInputStream("C:\\Users\\Alf\\Desktop\\Ficheros\\imagen.jpg");
            try {
                int c = 0;
                int contador = 0;
                
                while (c != -1) {
                    c = file_input.read();
                    if (c != -1) {
                        contador++;
                        datos[contador] = c;
                    }
                    System.out.println(c);
                }

            } catch (IOException ex) {

            }

        } catch (FileNotFoundException ex) {

        }

        try {
            FileOutputStream file_out = new FileOutputStream("C:\\Users\\Alf\\Desktop\\Ficheros\\imagen_02.jpg");
            for(int i=0;i<datos.length;i++){
            file_out.write(datos[i]);
            }

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
            Logger.getLogger(Copiar_imagen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
