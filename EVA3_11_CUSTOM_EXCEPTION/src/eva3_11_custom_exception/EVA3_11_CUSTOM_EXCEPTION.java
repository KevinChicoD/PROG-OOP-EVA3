/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_11_custom_exception;

/**
 *
 * @author invitado
 */
public class EVA3_11_CUSTOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            mensaje();
        } catch (MiExcepcion e) {
            e.printStackTrace();
        }
    }
    
    public static void mensaje() throws MiExcepcion{
        System.out.println("mensaje");
        throw new MiExcepcion("Falla del sistema!!!!");
    }
}

class MiExcepcion extends Exception{

    public MiExcepcion() {
    }

    public MiExcepcion(String Mensaje) {
        super(Mensaje);
    }
    
}