/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_uso_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_7_USO_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean conseguido = false;
        
         while(!conseguido){
     try {
        
         Scanner input = new Scanner(System.in);
        
         System.out.println("Introduce el NUMERO ENTERO");
        
         int num = input.nextInt();
        conseguido = true;
        
         System.out.println("Fin del programma :))");
        
     }catch (Exception e) {
        }
 
         }
    }
}
