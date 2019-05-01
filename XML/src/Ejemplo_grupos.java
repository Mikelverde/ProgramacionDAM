
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
public class Ejemplo_grupos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pattern p = Pattern.compile("([XY]?)([0-9]{1,9})([A-Za-z])");
        Matcher m = p.matcher("X123456789Z Y00110011M 999999T");
        while (m.find()) {
            System.out.println("Letra inicial (opcional):" + m.group(1));
            System.out.println("Número:" + m.group(2));
            System.out.println("Letra NIF:" + m.group(3));

        }
    }
}
