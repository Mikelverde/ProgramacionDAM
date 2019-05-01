
import java.util.HashSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alf
 */
public class ejemplo_HashSet {

    public static void main(String[] args) {

        HashSet<Integer> conjunto = new HashSet<Integer>();
        int contador = 0;
        String srt;
        Integer numero;

        while (contador != 5) {
            srt = JOptionPane.showInputDialog("Introduce un numero, no puede estar repetido");
            numero = Integer.parseInt(srt);
            if (conjunto.add(numero)) {
                contador++;
            } else {
                JOptionPane.showMessageDialog(null, "El numero esta repetido");
            }

        }
        Integer suma=0;
        for(Integer e:conjunto){
            suma=suma+e;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los elementos del conjunto es "+suma);

    }
}
