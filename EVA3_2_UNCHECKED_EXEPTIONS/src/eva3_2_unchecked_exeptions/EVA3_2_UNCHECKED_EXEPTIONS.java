/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_unchecked_exeptions;

/**
 *
 * @author KEVIN
 */
public class EVA3_2_UNCHECKED_EXEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NULLPOINTEREXEPTION
        //CUANDO QUEREMOS USAR UN OBJETO QUE NO EXISTE
        Persona persona = null;
        System.out.println(persona.toString());
        
        //INDEXOUTOFBOUNDSEXEPTION: Error de arreglos
        //leer una posicion que no existe
        int arreglo[] = new int[10]; //N = 0
        //es la primera posicion, N - 1es la ultima (9)
        arreglo[15] = 100;
        
        //ARITMETICEXEPTION: Division entre cero
        int x = 10, y = 0;
        int resu = x / y;
        System.out.println(resu);
    }
    
}

class Persona{
    
}