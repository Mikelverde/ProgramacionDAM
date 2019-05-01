/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_tarea_08_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alf
 */
public class Pueba_Pattern_Matcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "X12345678F,\"nombre\",\"apellidos\",+(82)12345678, "
                + "612345678,test@TEST.com,(91)23456789 ,prueba@prueba.com";
        String[] array_datos = cadena.split(",");
        for (int i = 3; i < array_datos.length; i++) {
            Pattern p = Pattern.compile("@");
            Matcher m = p.matcher(array_datos[i]);
            if (m.find()) {
                System.out.println("Es un correo "+array_datos[i]);
            }else{
                System.out.println("Es un telefono "+array_datos[i]);
            }

                

        }

    }

}
