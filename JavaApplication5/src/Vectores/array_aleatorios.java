package Vectores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Alf
 */
public class array_aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner entrada=new Scanner(System.in);
        System.out.println("Cuantas posiciones tiene tu array?");
        int posiciones=entrada.nextInt();
        
        int array[]= new int[posiciones];
        
        for(int i=0;i<array.length;i++){
            int aleatorio= (int)(Math.random()*100);
            array[i]=aleatorio;
        }
        
         for(int i=0;i<array.length;i++){
             System.out.print(array[i]+" ");
        }
        
        
        

    }
    
}