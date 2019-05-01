
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alf
 */
public class Prueva_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<String> personas=new LinkedList<String>();
        personas.add("Pepe");
        personas.add("Carlos");
        personas.add("Mariano");
        /*Añade el elemento a la LinkedList en la posicion
        inicial,0*/
        //personas.add(0,"Juan");
                System.out.println(personas.size()); 
        
        personas.add("Ramon");
        
        ListIterator<String> it=personas.listIterator();
        it.next();//nos movemos una posicion en la LinkedList
        it.next();
        it.add("Romeo");/*Se añade en la tercera posicion, pq nos hemos movido
        dos posiciones*/
        
        for (String persona : personas) {
            System.out.println(persona);
            
        }
    }
    
}
