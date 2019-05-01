
import java.util.Scanner;

public class Programacion_tarea_06_01 {

    public static void main(String[] args) {
        int opcion=1;
        Scanner entrada = new Scanner(System.in);
        Ficheros documento = new Ficheros();
        
        do{
            System.out.println("Escoje una de las siguientes opciones:");
            System.out.println("---------------------------------------");
            System.out.println("1. Escribir en el fichero");
            System.out.println("2. Leer el fichero");
            opcion=entrada.nextInt();
            entrada.nextLine();// sin este next line la clase scanner no puede procesar correctamente la siguiente entrada nextline
            switch(opcion){
                case 1:
                    System.out.println("Que quieres escribir en el fichero");
                    String frase= entrada.nextLine();
                    documento.escribir_string(frase);
                    break;
                case 2:
                    documento.leer("C:\\Users\\Alf\\Desktop\\Tarea06.txt");
                    break;
                        
            
        }
        }while(opcion!=0);
        
        
        
        
        

    }

}
