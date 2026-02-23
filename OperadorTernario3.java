/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario3;
import java.util.Scanner;

/**
 *
 * @author lisbe
 */
public class OperadorTernario3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura;
        String msg;
        Scanner leer= new Scanner(System.in);
        
        do{
            System.out.println("hola Bienvenido para ingresar al juego debe superar la altura de 1,20 mtrs");
            System.out.println("ingrese su altura: ");
            altura=leer.nextDouble();
            
            if(altura <1.20||altura>2.30){
            System.out.println("ingrese una altura valida");
        }
            
        }while(altura<1.20||altura>2.30);
        msg=altura>=1.50?"altura apta para el juego ":"lo siento no cumple con la altura minima";
        System.out.println(msg);
                
    }
    
}
