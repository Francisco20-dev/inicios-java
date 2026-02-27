/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner; // ¡No olvides el import!

public class HolaMundo {

    // ¡Solo dejamos un main!
    public static void main(String[] args) {
        int edad = 0;
        int membresia = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su edad:");
        edad = leer.nextInt();
        
        if (edad >= 18) {
            System.out.println("eres mayor de edad");
            System.out.println("tienes membresia?");
            System.out.println("1) si");
            System.out.println("2) no");
            membresia = leer.nextInt();
            
            if (membresia == 1) {
                System.out.println("Eres Adulto VIP: Tienes acceso a la sala 3D y barra libre de snacks.");
            } else {
                System.out.println("Eres Adulto Estándar: Tienes acceso a la sala normal.");
            }
            
        } else {
            System.out.println("eres menor de edad");
            System.out.println("tienes membresia?");
            System.out.println("1) si");
            System.out.println("2) no");
            membresia = leer.nextInt();
            
            if (membresia == 1) {
                System.out.println("Eres Joven VIP: Tienes acceso a la sala de videojuegos antes de la película.");
            } else {
                System.out.println("Eres Joven Estándar: Tienes acceso a la sala normal.");
            }
        }
    }      
}
