/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume, Nume;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        nume = input.nextInt();
        System.out.println("Introduce el segundo numero");
        Nume = input.nextInt();
        for (int i = nume; i <= Nume; i++) {
          if((i % 2)!= 0)
              continue;
            System.out.print(i + " - ");
        }
        
    }
    
}
