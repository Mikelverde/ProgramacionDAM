/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_tarea_09;

/**
 *
 * @author Alf
 */
public class Persona {
//Atributos de Persona, nombre y apellidos de la persona y su fecha de nacimiento
//con el modificador de acceso "final" para que no puedan ser modificados    
    private final String nombre;
    private final String apellidos;
    private final String f_nacimiento;
//Constructor de clase con los datos necesarios---------------------------------
    public Persona(String nombre, String apellidos, String f_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.f_nacimiento = f_nacimiento;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//Metodos "get" para trabajar con los atributos de la clase---------------------
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }
    
//Metodo "toString" para imprimir toda la informacion de Persona----------------
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", f_nacimiento=" + f_nacimiento + '}';
    }
    
    
    
    
    
}
