package pkg54_aeropuerto;

public class AeropuertoPrueba {

    /* 
        Usando una clase ejecutable prueba a crear objetos de la clase 
        aeropuerto.
    */
    public static void main(String[] args) {

        Aeropuerto a = new Aeropuerto("Adolfo Suarez", 
                        "España", "calle", 1, "Madrid", 1970, 250000);
        
        System.out.println(a);
        
        System.out.println(a.aniosAbierto());
        
    }

}
