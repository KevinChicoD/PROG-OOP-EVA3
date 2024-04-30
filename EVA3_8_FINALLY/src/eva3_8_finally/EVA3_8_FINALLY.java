/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
           
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int nume = input.nextInt();
        System.out.println("El valor capturado fue: " + nume);
        
        }catch(InputMismatchException e){
            
            //lo que queremos hacer con la exepcion
            e.printStackTrace();
            System.out.println("El valor introducido no es un numero entero"); 
            
        }finally{
            
            //usar para ejecutar codifgo critico para el programa
            ////terminar procesos, cerrar archivos o conexiones
            //liberar recursos etc
            //Nada evita que se pueda producir una exepcion
            /* int x = 100, y = 0;
            int divi = x / y; */
            System.out.println("ESTA INSTRUCCION SIEMPRE SE VA A EJECUTAR");
            
        }
    }
    
}
