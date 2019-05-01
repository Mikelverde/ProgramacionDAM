package Vectores;

public class Numero_mas_repetido {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 4, 4, 1,1,1};
        int numero;
        int maximo = 0;
        int repeticiones = 0;

        for (int i = 0; i < array.length; i++) {
            numero = array[i];
            int contador = 0;
            for (int j = 0; j < array.length; j++) {
                if (numero == array[j]) {
                    contador++;
                }

            }
            if (contador >= repeticiones) {
                repeticiones = contador;
                maximo = numero;
            }
        }
        
        System.out.println("el numero max es "+maximo+" con "+repeticiones+" repetiones");
    }

}
