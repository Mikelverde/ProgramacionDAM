/*no esta terminado del todo pq se puede poner como fecha el 00/00/0000*/
package exresiones_regulares;

import java.util.*;
import java.util.regex.*;

/**
 *
 * @author Alf
 */
public class calendario_dd_mm_aaaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String regex = "^(([0-2][0-9])|([3][0-1]))/((0[0-9])|(1[012]))/[0-9]{4}";/* La expresion regular 
        que vanos a utilizar*/

        while (true) {
            System.out.println("Introduzca una fecha de formato dd/mm/aaaa");
            String fecha = entrada.next();

            if (fecha.equalsIgnoreCase("exit")) {
                break;
            }

            Pattern patron = Pattern.compile(regex);
            Matcher comprueba = patron.matcher(fecha);
            if (comprueba.find()) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("El formato de la fecha es incorrecto");
            }

        }

    }
}
