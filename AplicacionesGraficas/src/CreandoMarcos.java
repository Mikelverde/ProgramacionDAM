
import javax.swing.*;

public class CreandoMarcos {

    public static void main(String[] args) {

        miMarco marco1 = new miMarco();
        marco1.setTitle("Mi marco");
        

    }

}
//---------------------------------------------------------

class miMarco extends JFrame {

    public miMarco() {

        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,300);
        
    }
}
