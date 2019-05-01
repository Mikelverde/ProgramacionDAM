package Aereopuertos;

import java.util.Calendar;

/*
    Haz que la función de calcularAnio() no se pueda modificar en las 
    clases hijas.
*/
public abstract class Aeropuerto {

    private static int id_automerado = 1;

    private final int MAX_AVIONES = 20;

    // Atributos
    private int id;
    private String nombre;
    private Direccion direccion;
    private int anioInauguracion;
    private int capacidad;
    private Avion[] aviones;
    private int numeroAviones;

    // Constructores
    public Aeropuerto() {
        this("", "", "", 0, "", 0, 0);
    }

    public Aeropuerto(String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
        this(nombre, direccion.getPais(),
                direccion.getCalle(),
                direccion.getNumero(),
                direccion.getCiudad(),
                anioInauguracion,
                capacidad);
    }

    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        this.id = id_automerado++;
        this.nombre = nombre;
        this.direccion = new Direccion(pais, calle, numero, ciudad);
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
        this.aviones = new Avion[MAX_AVIONES];
        this.numeroAviones = 0;
    }

    // Metodos o propiedades
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

    public final int aniosAbierto() {

        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        return anioActual - this.anioInauguracion;

    }

    public int getNumero_aviones() {
        return numeroAviones;
    }

    public void aniadirAvion(Avion a) {

        if (numeroAviones < MAX_AVIONES) {
            this.aviones[numeroAviones] = a;
            numeroAviones++;
        } else {
            System.out.println("No puedes meter mas aviones");
        }

    }

    private String mostrarAviones() {

        String avionesCadena = "";
        for (int i = 0; i < numeroAviones; i++) {
            avionesCadena += this.aviones[i].toString() + "\n";
        }
        return avionesCadena;

    }

    public abstract void gananciasTotales(double cantidad);
    
    
    @Override
    public String toString() {
        return "El aeropuerto con id " + this.id + " y nombre " + nombre + " " + this.direccion + " \n "
                + "Fue inugurado el año " + anioInauguracion + " \n "
                + "y cuenta con una capacidad de " + capacidad + " personas. \n"
                + "Cuenta con los siguientes aviones: \n"
                + mostrarAviones()+"\n";
    }

}
