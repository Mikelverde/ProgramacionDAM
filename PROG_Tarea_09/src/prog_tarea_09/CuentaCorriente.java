/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_tarea_09;

import java.util.Hashtable;

/**
 *
 * @author Alf
 */
public class CuentaCorriente extends CuentaBancaria {
    
    private String cod_entidades;//codigo que identifica a las entidades que pueden
    //pasar recibos
    private double recibo_max;//importe maximo de los recibos
    private Hashtable entidades;
    
    public Hashtable set_entidades(String cod_entidades,double recibo_max){
        Hashtable entidades=new Hashtable<cod_entidades, double>();
        entidades.put(cod_entidades, recibo_max);
        return entidades;
    }
    
    
    
    
}
