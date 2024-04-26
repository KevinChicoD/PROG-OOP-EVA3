/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_6_EXEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        try {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el nominador");
        int num = input.nextInt();
        
        System.out.println("Introduce el divisor");
        int divi = input.nextInt();
        
        int resu = 0;
        resu = num / divi;
        
        System.out.println("Resultado: " + resu);
        
        }catch (Exception e) {
            if(e instanceof InputMismatchException)
                System.out.println("InputMismatchException");
            else{
                System.out.println("ArithmeticException");
            }
            e.printStackTrace();
        }
        
        System.out.println("Fin del programa :))");
    }
    
}
