/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_9_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            metodoproblematico();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void metodoproblematico() throws Exception{
        System.out.println("holi!!!");
        throw new Exception("ya no jala lol");
        //System.out.println("vistes!!"); Nunca se va a ejecutar
    }
}
