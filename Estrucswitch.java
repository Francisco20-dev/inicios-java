/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrucswitch;
import java.util.Scanner;

public class Estrucswitch {

    
    public static void main(String[] args) {
        
       
        try{
            Scanner leer =new Scanner (System.in);
            
        int dia  ;
        String nDia;
            System.out.println("ingrese el numero del dia");
            dia=leer.nextInt();
        
        switch (dia) {
            case 1: nDia="Lunes";
            break;
            case 2: nDia="Martes";
            break;
            case 3: nDia="Miercoles";
            break;
            case 4: nDia="jueves";
            break;
            case 5: nDia="Viernes";
            break;
            case 6: nDia="Sabado";
            break;
            case 7: nDia="Domigo";
            break;
            default: nDia= "Numero de dia invalido";
            break;
           
            
        }
        
        System.out.println("el dia seleccionado es:" + nDia);
      
        
        }catch(Exception e){
            System.out.println("ERRor");
        
    }
        
    
        
       
    }
    
}
