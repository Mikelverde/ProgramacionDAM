package Vectores;

import java.util.Arrays;

public class arrays_iguales {

    public static void main(String[] args) {

        int a1[] = {1, 2, 3, 4, 5, 6};
        int a2[] = {1, 2, 3, 4, 3, 6};
        
        if(Arrays.equals(a1, a2)){
            System.out.println("son iguales");
        }else{
         System.out.println("son distintos");   
        }
        

    }

}
