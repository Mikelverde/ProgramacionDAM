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
public class CuentaBancaria {
//Como CuentaBancaria va a ser la clase Super de todas las cuentas los atributos
//de esta tienen que estar incluidos en todas las demas cuentas. por lo que los
//atributos comunes a todos son titular, saldo y ccc    
    private Persona titular;
    private double saldo;
    private String ccc;
//Constructor de clase con los datos necesarios---------------------------------
    public CuentaBancaria(Persona titular, double saldo, String ccc) {
        this.titular = titular;
        this.saldo = saldo;
        this.ccc = ccc;
    }
//Metodos "get" y "set"---------------------------------------------------------
    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public Persona getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCcc() {
        return ccc;
    }
//Metodos para gestionar la retirada o el ingreso de fondos---------------------   
    public double retirar(double retirar){
        //i se intenta retirar una cantidad negativa o mayor que el saldo
        //disponible, la operacion no se realiza
        if (retirar<=0 || retirar>this.getSaldo()){
            System.out.println("no se puede realizar la operacion con ese valor");
        }
        else{
            saldo=saldo-retirar;
        }
        
        return saldo;
    }
    public double ingresar(double ingresar){
        if(ingresar<0){
            System.out.println("no se puede realizar la operacion con ese valor");
        }else{
           saldo=saldo+ingresar; 
        }
        
        return saldo;
    }
//Metodo "toString" para imprimir toda la informacion de Persona----------------
//Incluimos el metodo "Persona.toString" para mostrar toda la informacion 
//asociada a esa cuenta    
    @Override
    public String toString() {
        return "CuentaBancaria{"+titular.toString() + ",\n saldo=" + saldo + ", ccc=" + ccc + '}';
    }
    
    
    
    
    
    
}
