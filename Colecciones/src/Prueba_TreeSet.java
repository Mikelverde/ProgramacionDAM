
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
public class Prueba_TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TreeSet<String> ordena_personas = new TreeSet<String>();
        ordena_personas.add("Sandra");
        ordena_personas.add("Amanda");
        ordena_personas.add("Diana");

        System.out.println(ordena_personas);/*como es un treeSet ordena la lista
        por orden alfabetico. Utiliza la interfaz Comparable del tipo de objetos
        añadidos a la lista
         */

        TreeSet<Articulo> ordena_articulos = new TreeSet<Articulo>();
        ordena_articulos.add(new Articulo(1, "Zapatillas"));
        ordena_articulos.add(new Articulo(5, "Gafas"));
        ordena_articulos.add(new Articulo(3, "Guantes"));

        System.out.println("Ordenados por numero");
        for (Articulo articulo : ordena_articulos) {
            System.out.println(articulo.toString());

        }

        Articulo comparador_articulos = new Articulo();
        TreeSet<Articulo> ordena_articulos_2 = new TreeSet<Articulo>(comparador_articulos);

        ordena_articulos_2.add(new Articulo(1, "Zapatillas"));
        ordena_articulos_2.add(new Articulo(5, "Gafas"));
        ordena_articulos_2.add(new Articulo(3, "Guantes"));

        for (Articulo articulo : ordena_articulos_2) {
            System.out.println(articulo.getDescripcion());

        }

    }

}

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {/*1ºCreamos la clase e implementamos
    la interfaz comparable para poder ordenar la lista. hay que sobreescribir 
    obligatoriamenteel metodo compareTo.
    2ºimplementamos Comparator pàra permitir otro tipo de ordenacion de nuestra 
    lista de objetos Articulo.
     */

    private int numero_articulo;
    private String descripcion;

    public Articulo() {

    }

    public Articulo(int numero_articulo, String descripcion) {
        this.numero_articulo = numero_articulo;
        this.descripcion = descripcion;
    }

    public int getNumero_articulo() {
        return numero_articulo;
    }

    public void setNumero_articulo(int numero_articulo) {
        this.numero_articulo = numero_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Articulo o) {
        if (this.getNumero_articulo() > o.getNumero_articulo()) {
            return 1;
        } else {
            if (this.getNumero_articulo() < o.getNumero_articulo()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Articulo{" + "numero_articulo=" + numero_articulo + ", descripcion=" + descripcion + '}';
    }

    @Override/*usaremos este metodo creando un objeto vacio de la clase articulo
    para despues pasar por parametro el metodo compare 
    TreeSet<Articulo>ordena_articulos_02=new  TreeSet<Articulo>(el objeto vacio);*/
    public int compare(Articulo o1, Articulo o2) {
        String nombre_01 = o1.getDescripcion();
        String nombre_02 = o2.getDescripcion();
        return o1.compareTo(o2);

    }

}
