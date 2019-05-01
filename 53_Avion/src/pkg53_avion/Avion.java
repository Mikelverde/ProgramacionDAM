package pkg53_avion;

/*
    Crea una clase Avion con los siguientes atributos:
        - Modelo
        - Numero de asientos
        - Velocidad maxima
    Dos constructores:
        - Constructor vacio
        - Constructor completo
    Métodos o propiedades:
        - Getter y setter
        - toString() 
 */
public class Avion {

    // Atributos
    private String modelo;
    private int nAsientos;
    private double velocidadMaxima;

    // Constructores
    public Avion() {
        this.modelo = "";
        this.nAsientos = 0;
        this.velocidadMaxima = 0;
    }

    public Avion(String modelo, int nAsientos, double velocidadMaxima) {
        this.modelo = modelo;
        this.nAsientos = nAsientos;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Metodos o propiedades
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Avion{" + "modelo=" + modelo + ", nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima + '}';
    }

}
