/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_tarea_09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alf
 */
public class PROG_Tarea_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objeto persona para trabajar los las cuentas
        Persona mikel = new Persona("mikel", "Fernandez San Higinio", "30/12/81");
        HashSet<CuentaBancaria> lista = new HashSet<>();//En esta lista guardaremos
        //todas las cuentas 
        int opcion;
        int opcion02;
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        boolean fin = true;

        while (fin) {
            System.out.println("-----------------------------------------------");
            System.out.println("Escoja una de las siguientes opciones");
            System.out.println("1. Nueva Cuenta");
            System.out.println("2. Listar Cuentas existentes");
            System.out.println("3. Buscar Cuenta");
            System.out.println("0. Salir de la aplicacion");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Que tipo de cuenta quiere abrir?");
                    System.out.println("Escoja una de las siguientes opciones");
                    System.out.println("1. Cuenta Bancaria");
                    System.out.println("2. Cuenta de Ahorro");
                    System.out.println("3. Cuenta Corriente");
                    System.out.println("4. Cuenta Corriente Personal");
                    System.out.println("5. Cuenta Corriente Empresa");

                    opcion02 = entrada.nextInt();
                    switch (opcion02) {
                        case 1:
                            Persona titular = pideTitular();
                            CuentaBancaria cuenta = pideCuenta(titular);
                            lista.add(cuenta);
                            break;
                        case 2:
                            Persona titular02 = pideTitular();
                            CuentaBancaria cuenta02 = pideCuenta(titular02);
                            System.out.println("¿Cual va a ser el interes anual?");
                            double int_anual=entrada.nextDouble();
                            CuentaAhorro cuenta_a=new CuentaAhorro(titular02,
                                    cuenta02.getSaldo(),cuenta02.getCcc(),int_anual);
                            lista.add(cuenta_a);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;

                    }

                    break;
                case 2:
                    for (CuentaBancaria cuenta : lista) {
                        System.out.println(cuenta.toString());

                    }
                    break;
                case 3:
                    System.out.println("Intoduzca el numero de cuenta");
                    String ccc=entrada.next();
                    Iterator it=lista.iterator();
                    while(it.hasNext()){
                        CuentaBancaria cuenta=(CuentaBancaria)it.next();
                        if(cuenta.getCcc().equalsIgnoreCase(ccc)){
                            System.out.println(cuenta.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Intoduzca el numero de cuenta");
                    String ccc=entrada.next();
                    break;
                case 0:
                    fin = false;
                    break;
            }

        }

    }

    /**
     * Este metodo solicita por pantalla los atributos de nombre, apellidos y
     * fecha de nacimiento del titular de la cuenta para devolver un objeto
     * persona con dichos atributos
     *
     * @return persona Un objeto de clase Persona
     */
    private static Persona pideTitular() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre del titular");
        String nombre = entrada.next();
        System.out.println("Introduzca los apellidos del titular");
        String apellidos = entrada.next();
        System.out.println("Introduzca la fecha de nacimiento dd/mm/aaaa");
        String f_nacimiento = entrada.next();

        Persona persona = new Persona(nombre, apellidos, f_nacimiento);
        return persona;

    }

    private static CuentaBancaria pideCuenta(Persona titular) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de cuenta");
        String ccc = entrada.next();
        System.out.println("Introduzca el saldo");
        double saldo = entrada.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldo, ccc);
        return cuenta;
    }
}
