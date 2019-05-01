/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_tarea_09;

import java.util.HashMap;

/**
 *
 * @author mikel
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
//Los unico atributo que necesitamos y que no hereda son elinteres que genera
// un descubierto y elmaximo descubierto posible
    private double interes_descubierto;
    private double max_descubierto;
//Constructor de clase con los datos necesarios---------------------------------
    public CuentaCorrienteEmpresa(Persona titular, double saldo, String ccc,
            HashMap entidades_auto, double interes_descubierto, double max_descubierto) {
        super(titular, saldo, ccc, entidades_auto);
        this.interes_descubierto = interes_descubierto;
        this.max_descubierto = max_descubierto;
    }
//Metodos "get" y "set"---------------------------------------------------------

    public double getInteres_descubierto() {
        return interes_descubierto;
    }

    public void setInteres_descubierto(double interes_descubierto) {
        this.interes_descubierto = interes_descubierto;
    }

    public double getMax_descubierto() {
        return max_descubierto;
    }

    public void setMax_descubierto(double max_descubierto) {
        this.max_descubierto = max_descubierto;
    }
    
    
    
    
    
    
    
}
