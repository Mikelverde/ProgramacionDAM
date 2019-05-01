
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alf
 */
public class Generar_XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
try {
    //Generamos el doc que nos permitira trabajar con el DOM
         DocumentBuilderFactory dbFactory =DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.newDocument();
         
         // root element
         Element rootElement = doc.createElement("datos_personales");
         doc.appendChild(rootElement);
         
         



         // write the content into xml file
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(new File("datos_personales.xml"));
         transformer.transform(source, result);
         
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}