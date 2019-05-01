package pkg85_login_frames;

/**
 * Clase Direccion, representa una direccion
 * @author Fernando
 */
public class Direccion {

    private String pais;
    private String calle;
    private int numero;
    private String ciudad;

    /**
     * Constructor vacio
     */
    public Direccion() {
        this("", "", 0, "");
    }

    /**
     * Constructor completo
     * @param pais pais donde se encuentra
     * @param calle calle donde se encuentra
     * @param numero numero donde se encuentra
     * @param ciudad ciudad donde se encuentra
     */
    public Direccion(String pais, String calle, int numero, String ciudad) {
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    /**
     * Devuelve el pais
     * @return pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Modifica el pais
     * @param pais nuevo pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Devuelve la calle
     * @return calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Modifica la calle
     * @param calle nueva calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Devuelve el numero
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Modifica el numero
     * @param numero nuevo numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Devuelve la ciudad
     * @return ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Modifica la ciudad
     * @param ciudad nueva ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Devuelve la informacion del objeto
     * @return info
     */
    @Override
    public String toString() {
        return "esta en el pais " + pais + " en la direccion: \n "
                + "calle " + calle + ", numero " + numero + ", ciudad " + ciudad + ".";
    }

}
