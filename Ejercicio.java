/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.Scanner;


public class Ejercicio {

    
    public static void main(String[] args) {
        
        Scanner leer= new Scanner (System.in);
            int cargo = 0;
        while(cargo!=4){
        
        
        try{
            
            String Ncargo;
            
            double Sueldo;
            
            System.out.println("---Calculadora de sueldo---");
            System.out.println("Digite del 1 al 3");
            System.out.println("Opcion 1: repositor");
            System.out.println("Opcion 2: cajero");
            System.out.println("Opcion 3: supervisor");
            System.out.println("Opcion 4: Salir");
            cargo = leer.nextInt();
      
        
        switch(cargo){
            case 1: Ncargo=" repositor";
            Sueldo=(15890+(15890*0.10))*20;
                System.out.println("El sueldo "+ Ncargo+" al mes es: "+ Sueldo);    
            break;
            case 2: Ncargo=" cajero";
            Sueldo=(25630)*20;
                System.out.println("El sueldo del"+ Ncargo+" es: "+ Sueldo); 
            break;
            case 3: Ncargo=" supervisor";
            Sueldo=(35560-(35560*0.11))*20;
                System.out.println("El sueldo del "+ Ncargo+"  es: "+ Sueldo); 
            break;
            case 4:
                System.out.println("Fin del programa");
                break;
            
            default: Ncargo= "Opcion invalida";
                System.out.println(Ncargo);
            break;
            
        }
            
        
            
            
        }catch(Exception e){
            System.out.println("Error escoga con numeros del 1 al 3");
            leer.nextLine();
        }
        }
    }
    
}
