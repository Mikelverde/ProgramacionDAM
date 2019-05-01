/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alf
 */
public class Uso_libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro_01=new Libro("P en Java", "Juan",25);
        Libro libro_02=new Libro("P en Java", "Juan",25);
        
        if(libro_01.equals(libro_02)){/*demostracion de que e metodo equals no
            distingue entre dos objetos iguales pero con distinto nombre*/
            System.out.println("Es el mismo libro");
        }else{
            System.out.println("No es el mismo libro");
        }
        
        if(libro_01.compara_isbn(libro_02)){/*creo un metodo que compare el
            codigo isbn entre dos librosn y asi poder determinar sin son el
            mismo*/
            System.out.println("Los libros son iguales");
        }else{
            System.out.println("Los libros son distintos");
        }
        
        
        
    }
    
}
