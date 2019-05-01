package DDR;

import java.awt.Color;
import javax.swing.*;

public class AplicacionGrafica extends JFrame {//Creamos una ventana

    private JPanel contentPane;
    /*Creamos un atributo JPanel, donde instertaremos los componentes, a nuestra
    ventana*/

    public AplicacionGrafica() {
        setTitle("Titulo de la ventana");
        /*
         * Coordenadas x y de la aplicacion y su altura y longitud,
         * si no lo indicamos aparecera una ventana muy pequeña
         */
        setBounds(400, 200, 250, 300);
        /*
         * Indica que cuando se cierre la ventana se acaba la aplicacion,
         * si no lo indicamos cuando cerremos la ventana la aplicacion seguira funcionando
         */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Hace visible la ventana, si no lo hacemos no veremos la aplicacion
        setVisible(true);
        //Creamos el panel
        contentPane=new JPanel();
        //Indicamos su diseño
        contentPane.setLocale(null);
        //asigno el pannel a la ventana
        setContentPane(contentPane);
        //Creo el componente
        JLabel etiqueta=new JLabel("Hola mundo");
        //Colocamos el componente
        etiqueta.setBounds(60, 20, 100, 20);
        //Añadimos el elemento al panel, sino no se vera
        this.contentPane.add(etiqueta);
    }
    //---------------------------------------------metodo Main-----------------
    public static void main(String[] args) {
        AplicacionGrafica ventana=new AplicacionGrafica();
 
    }
 
}

