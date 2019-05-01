
import java.io.FileReader;
import java.io.IOException;



public class Acceso_fichero {

    public static void main(String[] args) {
        
        Leer_fichero fichero= new Leer_fichero();
        fichero.lee();

    }
}
    //------------------------------------------------------------------------------------

    class Leer_fichero {

        public void lee() {
            try {
                /*El direcctorio tiene que estar con doble barra \\ o con bara invertida / y escrito en ingles*/
                FileReader entrada = new FileReader("C:\\Users\\Alf\\Desktop\\fichero.txt");
                int c = 0;//el metodo read devuelve un numero real//
                
                
                while(c!=-1){// el metodo read devuelve un -1 al llegar al final de la informacion//
                    c=entrada.read();
                    char letra=(char)c;//convertimos el numero que devuelve el metodo char en una letra//
                    System.out.print(letra);
                }
                entrada.close();
            } catch (IOException e) {
                System.out.println("No se ha encontrado el fichero");
            }
        }
    }
