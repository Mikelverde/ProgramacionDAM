
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alf
 */
public class Pattern_Matcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        entrada.useDelimiter("\n");
        String numero;
        Pattern p=Pattern.compile("^[123456789]{1}$");
        boolean correcto=false;
       
        while(!correcto){
        System.out.println("-----------------------------------------------");
            System.out.println("Escoja una de las siguientes opciones");
            System.out.println("1. Nueva Cuenta");
            System.out.println("2. Listar Cuentas existentes");
            System.out.println("3. Buscar Cuenta");
            System.out.println("4. Realizar un ingreso");
            System.out.println("5. Retirar efectivo");
            System.out.println("6. Mostrar Saldo de una cuenta");
            System.out.println("0. Salir de la aplicacion");
        numero=entrada.next();
        Matcher m=p.matcher(numero);
        if(m.find()){
            correcto=true;
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        }
        
    }
    
}
