/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exresiones_regulares;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Alf
 */
public class Exresiones_regulares_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String a_evaluar = "Hola mundo";
        String regex;/* La expresion regular que vanos a utilizar*/

        while (true) {/*abrimos un buclke que se repetira constantemente hasta que 
            realizemos un break
             */
            regex = entrada.next();
            /*el programa cabara cuando introduzcamos un exit en la consola */
            if (regex.equalsIgnoreCase("exit")) 
                break;
            
            /*Creaos un objeto Pattern y cargamos la expresion regular que 
            utilizaremos 
            */
            Pattern patron=Pattern.compile(regex);
            /*Creamos un objeto Matcher donde cargaremos el texto que queremos
            comprobar
            */
            Matcher m=patron.matcher(a_evaluar);
            boolean coincidencia=m.find();
            System.out.println("¿Hay alguna coincidencia? "+coincidencia);
            }

        }
    }


