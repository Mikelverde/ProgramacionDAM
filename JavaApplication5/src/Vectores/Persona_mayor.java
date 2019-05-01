package Vectores;

public class Persona_mayor {

    public static void main(String[] args) {

        String nombre[] = {"Juan", "Mikel", "Pedro", "Lucas"};
        int edad[] = {65, 37, 40, 4};
        int max=edad[0];
        int posicion=0;

        for (int i = 1; i < edad.length; i++) {
            if(edad[i]>max){
                max=edad[i];
                posicion=i;
                
            } 
        }
        System.out.println(nombre[posicion]+" es el mayor de todos con "+max+" años.");

    }

}
