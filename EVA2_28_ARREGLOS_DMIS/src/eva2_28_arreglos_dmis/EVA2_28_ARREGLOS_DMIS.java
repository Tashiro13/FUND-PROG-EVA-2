/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_28_arreglos_dmis;

/**
 *
 * @author invitado
 */
public class EVA2_28_ARREGLOS_DMIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[5][10];
        
        matriz[1][3] = 100;
        System.out.println("Valor en [1][3] = " + matriz[1][3]);
        System.out.println("matriz.length = " + matriz.length);
        
        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//coumnas
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }//leer nuestro arreglo
        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//coumnas
                System.out.print("[" + matriz[i][j] + "]");
        }
            System.out.println("");
    }
    
}
