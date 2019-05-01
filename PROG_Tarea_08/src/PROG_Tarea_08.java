
import prog_tarea_08_02.Generador_DOM;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alf
 */
public class PROG_Tarea_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dni;
        String nombre;
        String apellidos;
        ArrayList <String> telefonos=new ArrayList <>();
        ArrayList <String> correos=new ArrayList <>();



        String cadena = "12345678Z,\"nombre\",\"apellidos\", prueba@prueba.com,"
                + "(952)333333,test@test.com ,+952333333,test@TEST.com ";
        String[] elementos_cadena = cadena.split("[,]");
        dni=elementos_cadena[0];
        nombre=elementos_cadena[1].replace("\"", "");
        apellidos=elementos_cadena[2].replace("\"", "");;
        
      
        /*No consigo que no reconozaca la parte numerica del DNI como un numero 
        de telefono, asi que para solucionarlo genero una nueva cadena de texto
        en la que ya no aparezcan ni el telefono, ni el nombre ni los apellidos*/
        
        cadena = "";
        for (int i = 3; i < elementos_cadena.length; i++) {
            cadena = cadena + elementos_cadena[i] + ",";
        }

        Pattern p = Pattern.compile("(\\+?(\\([0-9]{2,3}\\))?[0-9]{6,9}[^A-Z a-z])");
        Pattern p_mail = Pattern.compile("([A-Z a-z 0-9]*@[A-Z a-z 0-9]*\\.[A-Z a-z]{2,3})");
        Matcher m = p.matcher(cadena);
        Matcher m_mail = p_mail.matcher(cadena);

        while (m.find()) {
            telefonos.add(m.group(1));

        }
        while (m_mail.find()) {
            correos.add(m_mail.group(1));

        }
        
       
        
        
        try {
            Generador_DOM dom=new Generador_DOM();
            dom.generar_doc(dni,nombre,apellidos,telefonos,correos);
            dom.generar_XML();
        } catch (ParserConfigurationException | TransformerException | IOException ex) {
            Logger.getLogger(PROG_Tarea_08.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }
}
