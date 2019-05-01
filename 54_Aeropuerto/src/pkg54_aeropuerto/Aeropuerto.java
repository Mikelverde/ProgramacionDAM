package pkg54_aeropuerto;

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
    private String pais;
    private String calle;
    private int numero;
    private String ciudad;
    private int anioInauguracion;
    private int capacidad;

    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        this.nombre = nombre;
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
        return  "El aeropuerto " + nombre + " esta en el pais " + pais + " en la direccion: \n "
                + "calle " + calle + ", numero " + numero + ", ciudad " + ciudad + ".\n "
                + "Fue inugurado el año " + anioInauguracion + " \n "
                + "y cuenta con una capacidad de " + capacidad + " personas ";
    }

    
}
