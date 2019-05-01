package pkg55_direccion;

import java.util.Calendar;

/*
    Crea una clase Aeropuerto con los siguientes atributos:
        - Nombre
        - País
        - Calle
        - Numero
        - Ciudad
        - Año inauguración
        - Capacidad
    Dos constructores:
        - Constructor vacio
        - Constructor completo
    Métodos o propiedades:
        - Getter y setter
        - aniosAbierto(): devuelve el numero de años que ha estado abierto.
        - toString() 
*/
public class Aeropuerto {
    
    private String nombre;
    private Direccion direccion;
    private int anioInauguracion;
    private int capacidad;

    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        this.nombre = nombre;
        this.direccion = new Direccion(pais, calle, numero, ciudad);
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
    }

    public Aeropuerto(String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getAnioInauguracion() {
        return anioInauguracion;
    }

    public void setAnioInauguracion(int anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public int aniosAbierto(){
        
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        
        return anioActual - this.anioInauguracion;

    }

    @Override
    public String toString() {
        return  "El aeropuerto " + nombre + " "+ this.direccion +" \n "
                + "Fue inugurado el año " + anioInauguracion + " \n "
                + "y cuenta con una capacidad de " + capacidad + " personas ";
    }

    
}
