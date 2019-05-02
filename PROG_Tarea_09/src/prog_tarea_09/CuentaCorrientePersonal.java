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
public class CuentaCorrientePersonal extends CuentaCorriente {
//El unico atributo que necesitamos y que no hereda es el interes
//de mantenimiento    

    private double interes_mantenimiento;
//Constructor de clase con los datos necesarios---------------------------------

    public CuentaCorrientePersonal(Persona titular, double saldo, String ccc, HashMap entidades_auto,
            double interes_mantenimiento) {

        super(titular, saldo, ccc, entidades_auto);
        this.interes_mantenimiento = interes_mantenimiento;
    }
//Metodos "get" y "set"---------------------------------------------------------

    public double getInteres_mantenimiento() {
        return interes_mantenimiento;
    }

    public void setInteres_mantenimiento(double interes_mantenimiento) {
        this.interes_mantenimiento = interes_mantenimiento;
    }

}
