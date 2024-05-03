/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_throw_uncheked;

import javax.management.RuntimeErrorException;

/**
 *
 * @author invitado
 */
public class EVA3_10_THROW_UNCHEKED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      try{
      Persona perso = new Persona("Chico", "Kevin", -98);
      }catch(RuntimeException e){
          e.printStackTrace();
      }
}

static class Persona{
    private String apellido;
    private String nombre;
    private int edad;
    
    public Persona(){
       apellido = "";
       nombre = "";
       edad = 0;
    }

    public Persona(String apellido, String nombre, int edad) throws Exception {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        if((edad < 0) || (edad > 150))
        throw new RuntimeException("Valor no valido");
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        this.edad = edad;
        if((edad < 0) || (edad > 150))
        throw new RuntimeException("Valor capturado no es valido!!!");
        
    }
    
 
}
}