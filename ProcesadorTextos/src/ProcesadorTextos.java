
import java.awt.*;
import javax.swing.*;

public class ProcesadorTextos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MenuProcesador_II mimarco = new MenuProcesador_II();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

//-----------------------------------------------------------------------
class MenuProcesador_II extends JFrame {

    public MenuProcesador_II() {

        setBounds(500, 300, 600, 600);
        LaminaProcesador_II milamina = new LaminaProcesador_II();
        add(milamina);
        setVisible(true);

    }

}

class LaminaProcesador_II extends JPanel {

    public LaminaProcesador_II() {

        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();
        //-----------------------------------------------------Agregamos el menu
        JMenuBar mibarra = new JMenuBar();
        //---------------------------creamos las opciones y las agrgamos al menu              
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamano = new JMenu("Tamaño");
        //-----------------------creamos los items y los añadimos al menu fuente
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem courier = new JMenuItem("Courier");
        JMenuItem verdana = new JMenuItem("Verdana");
        fuente.add(arial);
        fuente.add(courier);
        fuente.add(verdana);
        //-----------------------creamos los items y los añadimos al menu estilo
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        estilo.add(negrita);
        estilo.add(cursiva);

        //-----------------------creamos los items y los añadimos al menu tamano
        JMenuItem tamano_12= new JMenuItem("12");
        JMenuItem tamano_16 = new JMenuItem("16");
        JMenuItem tamano_20 = new JMenuItem("20");
        tamano.add(tamano_12);
        tamano.add(tamano_16);
        tamano.add(tamano_20);
        //----------------------------------------------------------------------
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamano);
        //----------------------------------------agregamos este menu a el panel
        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);
        //--------------------------------------------agregamos un area de texto
        JTextPane miarea=new JTextPane();
        add(miarea,BorderLayout.CENTER);
                

    }

}
