package pkg55_direccion;

/*
    Mejoremos la clase Aeropuerto agrupando algunos de sus atributos en un objeto.
    Crea la clase Direccion, que tiene los siguientes atributos:
        - País
        - Calle
        - Numero
        - Ciudad
    Crea dos constructores:
        - Constructor vacio
        - Constructor completo
    Crea sus getters y setters.
    Crea también un toString
    Debes cambiar todos esos atributos de aeropuerto por direccion
 */
public class Direccion {

    private String pais;
    private String calle;
    private int numero;
    private String ciudad;

    public Direccion() {
    }

    public Direccion(String pais, String calle, int numero, String ciudad) {
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
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

    @Override
    public String toString() {
        return "esta en el pais " + pais + " en la direccion: \n "
                + "calle " + calle + ", numero " + numero + ", ciudad " + ciudad + ".";
    }

}
