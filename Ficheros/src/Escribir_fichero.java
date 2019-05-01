
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escribir_fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Escribiendo fichero = new Escribiendo();
        fichero.escribir();

    }

}
//----------------------------------------------------------------------------------//

class Escribiendo {

    public void escribir() {
        String frase = "Esto es una prueba de ecritura en fichero caracter a caracter";

        try {
            FileWriter escritura = new FileWriter("C:/Users/Alf/Desktop/texto_nuevo.txt");

            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }

            escritura.close();

        } catch (IOException ex) {
            Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
