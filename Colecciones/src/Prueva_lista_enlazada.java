
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
public class Prueva_lista_enlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LinkedList<String> paises = new LinkedList<String>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales = new LinkedList<String>();
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("Mexico DF");
        capitales.add("Lima");

        System.out.println(paises);
        System.out.println(capitales);

        ListIterator<String> it_paises = paises.listIterator();
        ListIterator<String> it_capitales = capitales.listIterator();

        while (it_paises.hasNext() && it_capitales.hasNext()) {
            it_paises.next();
            it_paises.add(it_capitales.next());

        }
        System.out.println(paises);

        //de la LinkedList capitales eliminar los elementos pares
        it_capitales = capitales.listIterator();/*iniciamos de nuevo el iterador
        para volver a la posicion inicial de la LinkedList.Si no hacemos
        esto partiremos de la ultima posicion*/
        while (it_capitales.hasNext()) {
            it_capitales.next();
            if (it_capitales.hasNext()) {
                it_capitales.next();
                it_capitales.remove();
            }
        }
        System.out.println(capitales);
        
        paises.removeAll(capitales);/*Eliminamos de la lista paises los elementos
        que quedan en la lista capitales*/
        System.out.println(paises);
    }

}
