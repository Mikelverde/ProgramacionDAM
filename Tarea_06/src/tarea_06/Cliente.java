
package tarea_06;

import java.io.Serializable;


public class Cliente implements Serializable {
    
    //----------------------------------------------ATRIBUTOS
    
    private String nif;
    private String nombre;
    private int telefono;
    private String direccion;
    private double deuda;
    
    //----------------------------------------------CONSTRUCTORES

    public Cliente(String nif, String nombre, int telefono, String direccion, double deuda) {
        this.nif = nif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.deuda = deuda;
    }
    
     public Cliente() {
        this.nif = "";
        this.nombre = "";
        this.telefono =0;
        this.direccion ="";
        this.deuda =0;
    }
         
    
    //----------------------------------------------METODOS

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nif=" + nif + ", nombre=" + nombre + ", telefono=" + 
                telefono + ", direccion=" + direccion + ", deuda=" + deuda + '}';
    }
    
    
    
    
}
