/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_año_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_AÑO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year, residuo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introdice el annio");
        year = input.nextInt();
        residuo = year % 4;
        
        if(residuo == 0){ 
          residuo = year % 100;
             if(residuo > 0)
                 System.out.println("Es año bisiesto");
             else{
            residuo = year % 400;
            if(residuo == 0)
                     System.out.println("Año bisisesto");
            else
                     System.out.println("No es annio bisiesto");}    
      
    }else 
            System.out.println("No es annio bisiesto");
    
}
