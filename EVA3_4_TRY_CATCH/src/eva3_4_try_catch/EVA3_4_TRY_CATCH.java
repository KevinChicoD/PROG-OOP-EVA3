/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_try_catch;

/**
 *
 * @author invitado
 */
public class EVA3_4_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10, y = 0;
        int resu = 0;
        
        
        try {
        resu = x / y;
        } 
        catch (ArithmeticException exeption) {//la solucion
        //que queremos hacer
            exeption.printStackTrace();   
        }
        
        System.out.println("Resultado: " + resu);
        
    }
}
   

