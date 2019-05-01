
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
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
public class Escritura_DOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, TransformerConfigurationException {
        
        Generador_DOM generar=new Generador_DOM();
        generar.generar_doc();
        try {
            generar.generar_XML();
        } catch (IOException ex) {
            Logger.getLogger(Escritura_DOM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
