/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_tarea_09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        HashMap<String, Integer> lista_entidades = new HashMap<>();//En esta lista
        //guardaremos las dupla de datos entidad y recibo max.
        lista_entidades.put("Recibo Luz", 200);
        lista_entidades.put("Recibo Agua", 100);
        lista_entidades.put("Recibo Seguros", 500);
        lista_entidades.put("Recibo gas", 500);
        lista_entidades.put("Recibo coche", 500);

        int opcion = 0;//la opcion de l primer wich
        int opcion02 = 0;//la opcion del segundo swich
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");//Para que no de problemas la clase scanner
        boolean fin = true;//para indicar el fin del programa
        boolean correcto;//se usa para repetir los bules donde se solicitan datos
        //para el bucle switch hasta que se introduzca una opcion correcta

        String numero = "";//se usa en los metodos Pattern y Matcher
//este bucle se ejecutara hasta que se pulse el 0 en la aplicacion y 
//cambien la variable fin de trua a false
        while (fin) {
            correcto = false;//se carga la variable que controla el primer bucle swich
            while (!correcto) {
                System.out.println("-----------------------------------------------");
                System.out.println("Escoja una de las siguientes opciones");
                System.out.println("1. Nueva Cuenta");
                System.out.println("2. Listar Cuentas existentes");
                System.out.println("3. Buscar Cuenta");
                System.out.println("4. Realizar un ingreso");
                System.out.println("5. Retirar efectivo");
                System.out.println("6. Mostrar Saldo de una cuenta");
                System.out.println("0. Salir de la aplicacion");
                numero = entrada.next();
                Pattern p = Pattern.compile("^[0123456]{1}$");//se comprueba que el
                //valor introducido es uno de las opciones del bucle
                Matcher m = p.matcher(numero);
                if (m.find()) {
                    correcto = true;//como el valor es correcto cambiamos a true
                    //la variable que controla el bucle
                    opcion = Integer.parseInt(numero);
                }
            }
            correcto = false;//cargamops false para comenzar el siguiente bucle

            switch (opcion) {
                case 1:

                    while (!correcto) {//se repitira el bucle hasta que se escoja una
                        //opcion correcta
                        System.out.println("¿Que tipo de cuenta quiere abrir?");
                        System.out.println("Escoja una de las siguientes opciones");
                        System.out.println("1. Cuenta Bancaria");
                        System.out.println("2. Cuenta de Ahorro");
                        System.out.println("3. Cuenta Corriente");
                        System.out.println("4. Cuenta Corriente Personal");
                        System.out.println("5. Cuenta Corriente Empresa");

                        numero = entrada.next();
                        Pattern p = Pattern.compile("^[12345]{1}$");//se comprueva el valor
                        Matcher m = p.matcher(numero);
                        if (m.find()) {
                            correcto = true;//valor correcto  cambiamos a true 
                            opcion02 = Integer.parseInt(numero);
                        }
                    }

                    switch (opcion02) {
                        case 1:
                            try {
                                //pide los datos necesarios para el tipo de cuenta
                                Persona titular = pideTitular();
                                CuentaBancaria cuenta = pideCuenta(titular);
                                lista.add(cuenta);//añade la cuenta a la lista de cuentas
                            } catch (Exception e) {
                                System.out.println("Dato incorrecto");
                            }

                            break;
                        case 2:
                            try {
                                //pide los datos necesarios para el tipo de cuenta
                                Persona titular02 = pideTitular();
                                CuentaBancaria cuenta02 = pideCuenta(titular02);
                                System.out.println("¿Cual va a ser el interes anual?");
                                double int_anual = entrada.nextDouble();
                                CuentaAhorro cuenta_a = new CuentaAhorro(titular02,
                                        cuenta02.getSaldo(), cuenta02.getCcc(), int_anual);
                                lista.add(cuenta_a);//añade la cuenta a la lista de cuentas
                            } catch (Exception e) {
                                System.out.println("Dato incorrecto");
                            }

                            break;
                        case 3:
                            try {
                                //pide los datos necesarios para el tipo de cuenta
                                Persona titular03 = pideTitular();
                                CuentaBancaria cuenta03 = pideCuenta(titular03);
                                CuentaCorriente cuenta_c = new CuentaCorriente(titular03,
                                        cuenta03.getSaldo(), cuenta03.getCcc(), lista_entidades);
                                lista.add(cuenta_c);//añade la cuenta a la lista de cuentas
                            } catch (Exception e) {
                                System.out.println("Dato incorrecto");
                            }

                            break;
                        case 4:
                            try {
                                //pide los datos necesarios para el tipo de cuenta
                                Persona titular04 = pideTitular();
                                CuentaBancaria cuenta04 = pideCuenta(titular04);
                                System.out.println("¿Cual va a ser la comision de mantenimiento?");
                                double mantenimiento = entrada.nextDouble();
                                CuentaCorrientePersonal cuenta_cp = new CuentaCorrientePersonal(titular04,
                                        cuenta04.getSaldo(), cuenta04.getCcc(), lista_entidades, mantenimiento);
                                lista.add(cuenta_cp);//añade la cuenta a la lista de cuentas
                            } catch (Exception e) {
                                System.out.println("Dato incorrecto");
                            }

                            break;
                        case 5:
                            try {
                                //pide los datos necesarios para el tipo de cuenta
                                Persona titular05 = pideTitular();
                                CuentaBancaria cuenta05 = pideCuenta(titular05);
                                System.out.println("¿Cual va a ser el interes por descubierto?");
                                double int_descubierto = entrada.nextDouble();
                                System.out.println("¿Cual va a ser el maximo descubierto permitido?");
                                double max_descubierto = entrada.nextDouble();
                                CuentaCorrienteEmpresa cuenta_ce = new CuentaCorrienteEmpresa(titular05,
                                        cuenta05.getSaldo(), cuenta05.getCcc(), lista_entidades, int_descubierto, max_descubierto);
                                lista.add(cuenta_ce);//añade la cuenta a la lista de cuentas
                            } catch (Exception e) {

                            }

                            break;

                    }

                    break;
                case 2:
                    //con un bucle se imprimen toas las cuentas almacenadas en lista
                    for (CuentaBancaria cuenta : lista) {
                        System.out.println(cuenta.toString());

                    }
                    break;
                case 3:
                    //llamada al metodo que busca una cuenta
                    System.out.println(buscaCuenta(lista).toString());

                    break;
                case 4:
                    try {
                        //se solicita la cantidad a ingresar para sumarla al saldo 
                        System.out.println("Importe del ingreso");
                        double ingreso = entrada.nextDouble();
                        CuentaBancaria cuenta_ingreso = buscaCuenta(lista);
                        cuenta_ingreso.ingresar(ingreso);
                        System.out.println("El nuevo saldo es de " + cuenta_ingreso.getSaldo());
                    } catch (Exception e) {
                        System.out.println("Dato incorrecto");
                    }

                    break;

                case 5:
                    try{
                        ///se solicia la cantidad a retirar para restarla del saldo
                    System.out.println("Importe de la retirada");
                    double retirada = entrada.nextDouble();
                    CuentaBancaria cuenta_retirada = buscaCuenta(lista);
                    cuenta_retirada.retirar(retirada);
                    System.out.println("El nuevo saldo es de " + cuenta_retirada.getSaldo());
                    }catch(Exception e){
                        System.out.println("Dato incorrecto");
                    }
                    
                    break;
                case 6:
                    try{
                        System.out.println("El saldo de su cuenta es de " + buscaCuenta(lista).getSaldo() + "€");
                    }catch(Exception e){
                        System.out.println("Dato incorrecto");
                    }
                    
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

    /**
     * Este metodo solicita por consola los datos basicos de una cuenta bancaria
     * el objeto padre de todas las demas cuentas. Introducimos un objeto
     * persona con todos sus datos, de modo que asociamos la cuenta a un titular
     *
     * @param titular un objeto de la clase persona con los datos necesarios
     * @return un objeto CuentaBancaria
     */
    private static CuentaBancaria pideCuenta(Persona titular) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de cuenta");
        String ccc = entrada.next();
        System.out.println("Introduzca el saldo");
        double saldo = entrada.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldo, ccc);
        return cuenta;
    }

    /**
     * Este metodo necesita el parametro lista, que es un HsahSet con todas las
     * cuentas que se van generando. despues se solicita por consola el numero
     * de cuenta para buscar coincidencias en la lista de cuentas, cuando
     * encuentra una coincidencia devuelve una cuenta
     *
     * @param lista un hashset con los datos de todas las cuentas
     * @return un objeto cuenta bancaria que con el ccc que buscamos
     */
    private static CuentaBancaria buscaCuenta(HashSet<CuentaBancaria> lista) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intoduzca el numero de cuenta");
        String ccc = entrada.next();
        Iterator it = lista.iterator();
        CuentaBancaria cuenta = null;
        while (it.hasNext()) {
            cuenta = (CuentaBancaria) it.next();
            if (cuenta.getCcc().equalsIgnoreCase(ccc)) {
                return cuenta;
            } else {
                System.out.println("La cuenta no existe");
                cuenta = null;

            }
        }
        return cuenta;
    }
}
