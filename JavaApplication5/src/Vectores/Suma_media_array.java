package Vectores;


public class Suma_media_array {

    public static void main(String[] args) {

        int array[] = {1, 5, 2, 3, 6, 5, 10};
        System.out.println(suma(array));
        System.out.println(media(array,suma(array)));

    }

    public static int suma(int[] array) {
        int suma = 0;
        for (int numero : array) {
            suma = suma + numero;
        }
        return suma;
    }
    
    public static int media(int array[],int suma){
        int media=suma/array.length;
        return media;
    }

}
