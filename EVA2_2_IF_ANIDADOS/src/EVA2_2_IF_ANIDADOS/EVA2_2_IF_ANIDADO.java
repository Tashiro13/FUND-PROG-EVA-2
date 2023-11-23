/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int val1, val2;
      Scanner input = new Scanner(System.in);
      
        System.out.println("Valor 1 :");
        val1 = input.nextInt();
        System.out.println("Valor 2 :");
        val2 = input.nextInt();
        
        if(val1 > val2)  // concatenar // > operadores
            System.out.println("El valor mas grande es el " + val1);
        else{ 
            if(val1 == val2)
                System.out.println("Ambos valores son iguales");
            else 
                System.out.println("El valor mas pequeño es " + val1);
        }

      
    }
    
}
