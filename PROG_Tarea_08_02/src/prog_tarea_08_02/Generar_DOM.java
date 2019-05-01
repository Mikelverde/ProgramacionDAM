package prog_tarea_08_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.util.HashSet;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alf
 */
public class Generar_DOM {

    private Document doc;
    //Generamos un documento doc sobre el que trabajar
    public Generar_DOM() throws ParserConfigurationException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        doc = builder.newDocument();
    }
//Generamos el estilo del documento xml con un DOM
    public void generar_doc(String dni, String nombre, String apellidos, HashSet telefonos, HashSet correos) {

        String array_correos[] = new String[correos.size()];
        correos.toArray(array_correos);

        Element datos_cliente = doc.createElement("datos_cliente");
        doc.appendChild(datos_cliente);

        Element e_id = doc.createElement("id");
        e_id.appendChild(doc.createTextNode("" + dni));
        datos_cliente.appendChild(e_id);

        Element e_nombre = doc.createElement("nombre");
        e_nombre.appendChild(doc.createTextNode("" + nombre));
        datos_cliente.appendChild(e_nombre);

        Element e_apellidos = doc.createElement("apellidos");
        e_apellidos.appendChild(doc.createTextNode("" + apellidos));
        datos_cliente.appendChild(e_apellidos);

        Element e_telefonos = doc.createElement("telefonos");
        datos_cliente.appendChild(e_telefonos);
        e_telefonos.setAttribute("numeros_de_telefono", "" + telefonos.size());
                        
        Iterator it_telefonos=telefonos.iterator();
        while(it_telefonos.hasNext()){
            Element e_telefono=doc.createElement("telefono");
            e_telefonos.appendChild(e_telefono);
            e_telefono.appendChild(doc.createTextNode((String)it_telefonos.next()));
         }
                    
        Element e_correos = doc.createElement("correos");
        datos_cliente.appendChild(e_correos);
        e_correos.setAttribute("numeros_de_correos", "" + correos.size());
        
        Iterator it_correos=correos.iterator();
        while(it_correos.hasNext()){
            Element e_correo=doc.createElement("correo");
            e_correos.appendChild(e_correo);
            e_correo.appendChild(doc.createTextNode((String)it_correos.next()));
         }
        
       
        
        

        /* for (int i = 0; i < telefonos.size(); i++) {
 HashSet<String> lista_telefonos = new HashSet<String>();
            Element e_telefono = doc.createElement("telefono");
            e_telefonos.appendChild(e_telefono);

            String telefono = (String) telefonos.get(i);
            telefono = telefono.replaceAll("[^\\+0-9]", "");
            lista_telefonos.add(telefono);

            e_telefono.appendChild(doc.createTextNode(lista_telefonos.iterator().next()));

        }
        

        for (int i = 0; i < correos.size(); i++) {
            HashSet<String> lista_correos = new HashSet<String>();
            Element e_correo = doc.createElement("correo");
            e_correos.appendChild(e_correo);

            String correo = (String) correos.get(i);
            correo = correo.toLowerCase();
            lista_correos.add(correo);
            e_correo.appendChild(doc.createTextNode(lista_correos.iterator().next()));
        }

        /*  Element nombre=doc.createElement("Nombre");
        nombre.appendChild(doc.createTextNode("Teclado"));
        producto.appendChild(nombre);
        
        producto.setAttribute("codigo", "1");*/
    }
//Generamos un archivo XML con el doc y el fichero cliente.xml
    public void generar_XML() throws TransformerConfigurationException, TransformerException, IOException {
        TransformerFactory tf = TransformerFactory.newInstance();

        Transformer t = tf.newTransformer();
        Source source = new DOMSource(doc);
        File f = new File("cliente.xml");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        Result result = new StreamResult(pw);
        t.transform(source, result);
    }

}
