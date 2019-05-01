package pkg85_login_frames;

import java.util.Calendar;

/**
 * Clase Aeropuerto, representa a un aeropuerto
 *
 * @author DiscoDurodeRoer
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

    /**
     * Constructor vacio
     */
    public Aeropuerto() {
        this("", "", "", 0, "", 0, 0);
    }

    /**
     * Conctructor con direccion
     *
     * @param nombre nombre del aeropuerto
     * @param direccion direccion del aeropuerto
     * @param anioInauguracion año de inauguracion del aeropuerto
     * @param capacidad capacidad del aeropuerto
     */
    public Aeropuerto(String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
        this(nombre, direccion.getPais(),
                direccion.getCalle(),
                direccion.getNumero(),
                direccion.getCiudad(),
                anioInauguracion,
                capacidad);
    }

    /**
     * Constructor completo
     *
     * @param nombre nombre del aeropuerto
     * @param pais pais del aeropuerto
     * @param calle calle del aeopuerto
     * @param numero numero del aeropuerto
     * @param ciudad ciudad del aeropuerto
     * @param anioInauguracion año de inauguracion del aeropuerto
     * @param capacidad capacidad del aeropuerto
     */
    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        this.id = id_automerado++;
        this.nombre = nombre;
        this.direccion = new Direccion(pais, calle, numero, ciudad);
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
        this.aviones = new Avion[MAX_AVIONES];
        this.numeroAviones = 0;
    }

    public int getId() {
        return id;
    }
    
    /**
     * Devuelve el nombre del aeropuerto
     *
     * @return nombre del aeropuerto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del aeropuerto
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la dirección
     *
     * @return direccion del aeropuerto
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la direccion del aeropuerto
     *
     * @param direccion nueva direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el año de inauguración del aeropuerto
     *
     * @return año de inauguracion del aeropuerto
     */
    public int getAnioInauguracion() {
        return anioInauguracion;
    }

    /**
     * Modifica el año de inauguracion del aeropuerto
     *
     * @param anioInauguracion
     */
    public void setAnioInauguracion(int anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }

    /**
     * Devuelve la capacidad del aeropuerto
     *
     * @return capacidad del aeropuerto
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Modifica la capacidad del aeropuerto
     *
     * @param capacidad nueva capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Indica el numero de años que lleva abierto el aeropuerto No se puede
     * sobrescribir
     *
     * @return diferencia de la fecha actual con el año de inauguracion
     */
    public final int aniosAbierto() {

        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        return anioActual - this.anioInauguracion;

    }

    /**
     * Devuelve el numero de aviones
     *
     * @return numero de aviones
     */
    public int getNumeroAviones() {
        return numeroAviones;
    }

    /**
     * Añade un avion al array
     *
     * @param a Avion a añadir
     */
    public void aniadirAvion(Avion a) {

        if (numeroAviones < MAX_AVIONES) {
            this.aviones[numeroAviones] = a;
            numeroAviones++;
        } else {
            System.out.println("No puedes meter mas aviones");
        }

    }

    /**
     * Muestra los aviones Solo aquellos que esten activados
     *
     * @return Cadena con la informacion de los aviones activados
     */
    private String mostrarAviones() {

        String avionesCadena = "";
        for (int i = 0; i < numeroAviones; i++) {
            if (this.aviones[i].isActivado()) {
                avionesCadena += this.aviones[i].toString() + "\n";
            }
        }
        return avionesCadena;

    }

    /**
     * Método abstracto que muestra las ganancias totales Implementada en las
     * clases hijas
     *
     * @param cantidad cantidad ganada
     */
    public abstract void gananciasTotales(double cantidad);

    /**
     * Muestra la informacion del objeto
     * @return info
     */
    @Override
    public String toString() {
        return "El aeropuerto con id " + this.id + " y nombre " + nombre + " " + this.direccion + " \n "
                + "Fue inugurado el año " + anioInauguracion + " \n "
                + "y cuenta con una capacidad de " + capacidad + " personas. \n"
                + "Cuenta con los siguientes aviones: \n"
                + mostrarAviones() + "\n";
    }

}
