/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg55_direccion;

public class DireccionPrueba {

    public static void main(String[] args) {

        Aeropuerto a = new Aeropuerto("Adolfo Suarez",
                "España", "calle", 1, "Madrid", 1970, 250000);

        System.out.println(a);

        System.out.println(a.aniosAbierto());

        Direccion d = new Direccion("España", "mentiras", 1, "Ciudad real");

        Aeropuerto a2 = new Aeropuerto("Quijote airport", d, 2000, 1000);

        System.out.println(a2);

        System.out.println(a2.aniosAbierto());

    }

}
