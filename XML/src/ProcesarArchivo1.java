import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/* Clase que se encarga de procesar un pedido. 
 * El archivo con el pedido debe estar en codificaciÃ³n UTF8, sino no funciona
 * bien.
 * Tu sistema debe soportar de forma nativa la coficaciÃ³n UTF8, sino no 
 * funcionarÃ¡ del todo bien.
 */
public class ProcesarArchivo1 {

    /* Entrada contendrÃ¡ una instancia de la clase Scanner que permitirÃ¡
    leer las teclas pulsadas desde teclado */
    static Scanner entrada = new Scanner(System.in);
    /* Definimos las expresiones regulares que usaremos una y otra vez para
     cada lÃ­nea del pedido. La expresiÃ³n regular "seccion" permite detectar
     si hay un comienzo o fin de pedido, y la expresiÃ³n campo, permite detectar
     si hay un campo con informaciÃ³n del pedido. */
    static Pattern seccion = Pattern.compile("^##[ ]*(FIN)?[ ]*(PEDIDO|ARTICULOS)[ ]*##$");
    static Pattern campo = Pattern.compile("^(.+):.*\\{(.*)\\}$");
    
    
    public static void main(String[] args) {
        BufferedReader lector;

        /* 1er paso: cargamos el archivo para poder procesarlo lÃ­nea a lÃ­nea
         * para ello nos apoyamos en la clase BufferedReader, que con el mÃ©todo
         * readLine nos permite recorrer todo el archivo lÃ­nea a lÃ­nea.
         */
        if (args.length > 0) {
            lector = cargarArchivo(args[0]);
        } else {
            lector = cargarArchivo();
        }


        if (lector == null) {
            /* Si no se ha podido cargar el archivo, no continÃºa con el 
             * procesado, simplemente termina la ejecuciÃ³n. */
            System.out.println("No se ha podido cargar el archivo.");
        } else {
            /* Si ha podido cargar el archivo, continÃºa el procesado de lÃ­nea 
             * a lÃ­nea. */
            String linea;
            try {
                linea = lector.readLine();
                while (linea != null) {
                    procesarLinea(linea);
                    linea = lector.readLine();
                }
            } catch (IOException ex) {
                System.out.println("Error de entrada y salida.");
            }
        }
    }

    /**
     * Procesa una lÃ­nea del archivo de pedido para detectar que es y 
     * extraer la informaciÃ³n que contiene.
     * @param linea 
     */
    static void procesarLinea(String linea) {
           
        Matcher deteccionSeccion = seccion.matcher(linea);
        Matcher deteccionCampo = campo.matcher(linea);

        /* Si el patrÃ³n coincide con el de un indicador de comienzo del pedido
         * o de la secciÃ³n con el listado de artÃ­culos, se ejecutarÃ¡ este trozo
         * de cÃ³digo, pues habrÃ¡ encontrado el patrÃ³n.
         */
        System.out.println(linea);
      
        if (deteccionSeccion.matches()) {
            if (deteccionSeccion.group(1)!=null) {
                System.out.println("//// Detectado fin secciÃ³n de " + deteccionSeccion.group(2));
            } else {
                System.out.println("//// Detectado inicio secciÃ³n de " + deteccionSeccion.group(2));
            }
        }

        /* Si el patrÃ³n coincide con el de un campo con informaciÃ³n, entonces
           se ejecutarÃ¡ este trozo de cÃ³digo. */
        else if (deteccionCampo.matches()) {
            System.out.print("//// Detectado Campo:" + deteccionCampo.group(1));
            System.out.println("; con el valor:" + deteccionCampo.group(2));
        }
        else 
        {
            System.out.println("//// Esto no se que es (todavÃ­a)");
        }
    }

    /**
     * cargarArchivo crearÃ¡ una instancia de la clase BufferedReader que 
     * permitirÃ¡ leer lÃ­nea a lÃ­nea el archivo de texto. Si no se ha podido 
     * cargar el archivo retornarÃ¡ null.
     * @param name Nombre del archivo a cargar. si el nombre del archivo no 
     * se ha pasado por parÃ¡metro (valor null) se pedirÃ¡ al usuario que lo
     * introduzca.
     * @return null si no ha podido cargar el archivo, o la instancia de la 
     * clase BufferedReader si dicho archivo se ha podido cargar.
     */
    static BufferedReader cargarArchivo(String name) {
        String nombreArchivo = name;
        BufferedReader reader = null;
        if (name == null) {
            System.out.print("Introduce el nombre del archivo:");
            nombreArchivo = entrada.nextLine();
        }
        try {
            FileReader f =new FileReader(nombreArchivo);
            reader = new BufferedReader(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProcesarArchivo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reader;
    }

    /**
     * Igual que el mÃ©todo BufferedReader cargarArchivo(String name), pero
     * que siempre le pedirÃ¡ al usuario que lo introduzca.
     * @return null si no ha podido cargar el archivo, y una instancia de BufferedReader
     * en otro caso.
     */
    static BufferedReader cargarArchivo() {
        return cargarArchivo(null);
    }
}
