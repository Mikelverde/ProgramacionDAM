package pkg53_avion;

public class PruebaAvion {

    /*
        Usando una clase ejecutable prueba a crear objetos de la clase Avion.
    */
    public static void main(String[] args) {
        
        Avion a1 = new Avion();
        
        Avion a2 = new Avion("Boing 347", 200, 400);
        
        System.out.println(a1.getModelo());
        
        a1.setModelo("modelo 1");
        a1.setnAsientos(100);
        
        System.out.println(a1.getModelo());
        
        System.out.println(a2);
        
        
    }
    
}
