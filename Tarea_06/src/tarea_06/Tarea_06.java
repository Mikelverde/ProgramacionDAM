package tarea_06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarea_06 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        entrada.useLocale(Locale.US);
        boolean salir = false;
        //Creamos un array de 1000 posiciones donde iremos cargando nuestro 
        //objeto clientes y todos sus datos
        Cliente clientes[] = new Cliente[1000];
        Cliente n1;
        int contador = 0;
        int contador2 = 0;
        //Creamos el fichero donde se guardaram el array con los datos
        File f = new File("cliente.dat");
        ObjectInputStream oos = null;
        boolean existe;
//Al arrancar la aplicacion se comprueba si existe ya un fichero con informacion
//guardada. Si existe se cargan los datos de este.
        if (f.exists()) {

            try {

                oos = new ObjectInputStream(new FileInputStream("cliente.dat"));
                clientes = (Cliente[]) oos.readObject();

                for (int i = 0; i < clientes.length; i++) {
                    if (clientes[i] != null) {
                        contador2++;
                    }
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Tarea_06.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Tarea_06.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tarea_06.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//Iniciamos el menu de la aplicacion, que se repetira hasta que se escoja la opcion 0
        while (salir != true) {
            System.out.println("--------------------------------");
            System.out.println("1. AÑADIR UN CLIENTE NUEVO");
            System.out.println("2. MOSTRAR LISTA DE CLIENTES");
            System.out.println("3. BUSCAR CLIENTE");
            System.out.println("4. ELIMINAR CLIENTE");
            System.out.println("5. ELIMINAR LA LISTA DE CLIENTES");
            System.out.println("0. SALIR DE LA APLICACION");
            System.out.println("--------------------------------");

            System.out.println("ESCOJA UNA OPCION");
            int opcion = entrada.nextInt();

            switch (opcion) {
//Se introducen los datos de un nuevo cliente
                case 1:
                    contador++;
                    System.out.println("INTRODUZCA EL NIF");
                    String nif = entrada.next();
                    System.out.println("INTRODUZCA EL NOMBRE");
                    String nombre = entrada.next();
                    System.out.println("INTRODUZCA EL NUMERO DE TELEFONO");
                    int telefono = entrada.nextInt();
                    System.out.println("INTRODUZCA LA DIRECCION");
                    String direccion = entrada.next();
                    System.out.println("INTRODUZCA LA DEUDA");
                    double deuda = entrada.nextDouble();
//El objeto se carga en el array clientes, La posicon se determina con dos contadores
//de modo que si existe un array previo de clientes los nuevos datos se cargan en la
//primera posion libre del array.
                    n1 = new Cliente(nif, nombre, telefono, direccion, deuda);
                    clientes[contador + contador2 - 1] = n1;
//Se imprimen todos los objetos cliente que existan dentro del array
                    break;
                case 2:
                    try {// sin el try... el programa da un error por al tratar de imprimir 
                        for (int i = 0; i < clientes.length; i++) {
                            System.out.println(clientes[i].toString());
                        }
                    } catch (Exception e) {
                        System.out.println("");
                    }
                    break;
//Se pide un dni por consola y se compara con todos los dni de los clientes, si 
//encuentra una coincidencia imprime el cliente
                case 3:
                    existe = false;
                    try {// sin el try... el programa da un error por al tratar de imprimir 
                        System.out.println("INTRODUZCA EL NIF");
                        String nifBuscado = entrada.next();
                        for (int i = 0; i < clientes.length; i++) {
                            if ((clientes[i].getNif().equalsIgnoreCase(nifBuscado) == true)) {
                                System.out.println(clientes[i].toString());
                                existe = true;

                            }
                        }

                    } catch (Exception e) {
                        System.out.println("");
                    }
                    if (existe == false) {
                        System.out.println("NO EXISTE UN CLIENTE ASOCIADO A ESE NIF\n");
                    }

                    break;
//Practicamente igual que el caso anterior, pero ademas elimina el cliente
                case 4:
                    existe = false;
                    int posicion = 0;
                    try {// sin el try... el programa da un error por al tratar de imprimir 
                        System.out.println("INTRODUZCA EL NIF");
                        String nifBuscado = entrada.next();
                        for (int i = 0; i < clientes.length; i++) {
                            if ((clientes[i].getNif().equalsIgnoreCase(nifBuscado) == true)) {
                                System.out.println("HA ELIMINADO AL CLIENTE:");
                                System.out.println(clientes[i].toString());
                                existe = true;
                                posicion = i;

                            }
                        }

                    } catch (Exception e) {
                        System.out.println("");
                    }//Reordenamos el array de clientes para eliminar posibles huecos
                    for (int i = posicion; i < clientes.length - 1; i++) {
                        clientes[i] = clientes[i + 1];
                    }
                    if (existe == false) {
                        System.out.println("NO EXISTE UN CLIENTE ASOCIADO A ESE NIF\n");
                    }
                    break;

                case 5:
                    for (int i = 0; i < clientes.length; i++) {
                        clientes[i] = null;
                    }
                    f.delete();

                    break;

                case 0:
                    salir = true;

                    break;

            }
//Al salir de la aplicacion se guarda en el archivo cliente.dat la informacion
        }
        try {
            FileOutputStream foo = new FileOutputStream("cliente.dat");
            ObjectOutputStream escribir = new ObjectOutputStream(foo);
            escribir.writeObject(clientes);
            escribir.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tarea_06.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tarea_06.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
