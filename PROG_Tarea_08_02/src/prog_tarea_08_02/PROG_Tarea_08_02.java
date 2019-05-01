/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_tarea_08_02;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Alf
 */
public class PROG_Tarea_08_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, TransformerConfigurationException {
        //Linea de datos inicial
        String datos = "X12345678F,\"nombre\",\"apellidos\",+(82)12345678, 612345678,test@TEST.com,(91)23456789 ,prueba@prueba.com ";
        //Eliminamos los posibles espacios en blanco
        datos = datos.replaceAll("[ x0Bf ]", "");
        //Definimos un HashSet para cargar los correos electronicos y los telefonos
        HashSet lista_correos = new HashSet();
        HashSet lista_telefonos = new HashSet();
        //Trabajamos con esta linea para ir sacando los datos necesarios
        //Cargamos en un array los datos obtenidos al eliminar las comas
        String array_datos[] = datos.split(",");
        //De esta manera y segun el enuciado las tres primeras posiciones 
        //del array quedan ya definidas
        String dni = array_datos[0];
        //Hay que eliminar las ""
        String nombre = array_datos[1].replace("\"", "");
        String apellidos = array_datos[2].replace("\"", "");
        //Ahora hay que separar los numeros de telefono de los correos
        //Las primeras tres posiciones del array son el dni, el nombre y apellidos
        for (int i = 3; i < array_datos.length; i++) {
            Pattern p = Pattern.compile("@");
            Matcher m = p.matcher(array_datos[i]);
            if (m.find()) {
                //Creo una variable en la que cargo el correo solo en minusculas
                String correo = array_datos[i].toLowerCase();
                //Cargamos los correos en el HashSet, esto eliminara duplicados
                lista_correos.add(correo);
            } else {

                //Creo una variable en la que cargo el telefono sin parentesis
                String telefono = array_datos[i].replaceAll("[\\(\\)]", "");
                //Cargamos los correos en el HashSet, esto eliminara duplicados
                lista_telefonos.add(telefono);
            }

        }
        /*System.out.println(dni);
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(lista_correos);
        System.out.println(lista_telefonos);
        
        Iterator it_correos=lista_correos.iterator();
        while(it_correos.hasNext()){
            System.out.println(it_correos.next());
        }*/
        
        Generar_DOM dom=new Generar_DOM();
        dom.generar_doc(dni, nombre, apellidos, lista_telefonos, lista_correos);
        try {
            dom.generar_XML();
        } catch (IOException ex) {
            Logger.getLogger(PROG_Tarea_08_02.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

}
