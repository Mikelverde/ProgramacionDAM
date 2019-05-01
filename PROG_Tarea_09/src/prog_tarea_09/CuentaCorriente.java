/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_tarea_09;

import java.util.HashMap;

/**
 *
 * @author Alf
 */
public class CuentaCorriente extends CuentaBancaria {
//El unico atributo que necesitamos y que no hereda es la lista de
//entidades autorizadas a pasar cobros
    HashMap<String, Integer> entidades_auto = new HashMap<>();//Lista en entidades
    //autorizadas, dos datos, nomre de cobrador e importe max.
//Constructor de clase con los datos necesarios---------------------------------
    public CuentaCorriente(Persona titular, double saldo, String ccc, HashMap entidades_auto) {
        super(titular, saldo, ccc);
        this.entidades_auto = entidades_auto;
    }
//Metodo "get" para la lista de entidades asociada la la cuenta, la lista
//no se puede generar aqui en la clase, la generaremos en el "main"
    public HashMap<String, Integer> getEntidades_auto() {
        return entidades_auto;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "entidades_auto=" + entidades_auto + '}';
    }
    
    

}
