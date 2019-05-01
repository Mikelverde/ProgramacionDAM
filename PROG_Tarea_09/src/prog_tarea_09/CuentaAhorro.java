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
public class CuentaAhorro extends CuentaBancaria {
//El unico atributo que necesitamos y que no hereda es interes_anual   
    private double interes_anual;
//Constructor de clase con los datos necesarios---------------------------------
    public CuentaAhorro(Persona titular, double saldo, String ccc, double interes_anual) {
        super(titular, saldo, ccc);//por heredar de CuentaBancaria
        this.interes_anual= interes_anual;
        
    }
//Metodos "get" y "set"---------------------------------------------------------
    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public double getInteres_anual() {
        return interes_anual;
    }
//Sobrescribimos el metodo "toString" añadiendole el interes anual
    @Override
    public String toString() {
        return super.toString()+", tipo de interes anual=" + interes_anual; 
    }
    
    
    
    
}
