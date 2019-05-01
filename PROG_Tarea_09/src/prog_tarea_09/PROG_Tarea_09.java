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
public class PROG_Tarea_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona mikel=new Persona("mikel", "Fernandez San Higinio","30/12/81");
        CuentaBancaria cb=new CuentaBancaria(mikel,2000,"12345");
        CuentaAhorro ca=new CuentaAhorro(mikel,2000,"12345",25);
        System.out.println(mikel.toString());
        System.out.println(cb.toString());
        System.out.println(ca);
    }
    
}
