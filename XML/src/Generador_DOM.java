
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alf
 */
public class Generador_DOM {
    
    private Document doc;
    
    public Generador_DOM() throws ParserConfigurationException{
        
        DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
        DocumentBuilder builder= dbf.newDocumentBuilder();
        doc=builder.newDocument();
    }
    
    public void generar_doc(){
        Element productos=doc.createElement("Productos");
        doc.appendChild(productos);
        
        Element producto=doc.createElement("Producto");
        productos.appendChild(producto);
        
        Element nombre=doc.createElement("Nombre");
        nombre.appendChild(doc.createTextNode("Teclado"));
        producto.appendChild(nombre);
        
        producto.setAttribute("codigo", "1");
    }
    
    public void generar_XML() throws TransformerConfigurationException, TransformerException, IOException{
        TransformerFactory tf=TransformerFactory.newInstance();
        /*El objeto transformer permite pasar la informacion en memoria del doc
        a un documento fisico en el disco duro*/
        Transformer t=tf.newTransformer();
        Source source=new DOMSource(doc);
        File f=new File("productos.xml");
        FileWriter fw=new FileWriter(f);
        PrintWriter pw= new PrintWriter(fw);
        Result result= new StreamResult(pw);
        t.transform(source, result);
    }
    
    
}
