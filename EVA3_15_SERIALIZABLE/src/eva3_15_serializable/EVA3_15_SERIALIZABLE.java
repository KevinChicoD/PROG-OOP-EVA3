/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_15_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_15_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            try {
            Persona perso = new Persona("Kevin", 18, "Chico");
            guardarObjeto(perso);
            Persona perso2 = leerObjeto();
            System.out.println(perso2);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_15_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_15_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Persona leerObjeto() throws FileNotFoundException, IOException, ClassNotFoundException{
        Persona perso = null;
        String ruta = "D:\\Hola\\Personas.per";
        FileInputStream abrir = new FileInputStream(ruta);
        ObjectInputStream leerArch = new ObjectInputStream(abrir);
        perso =(Persona)leerArch.readObject();
        return perso;
    }
    
    public static void guardarObjeto(Persona obj) throws FileNotFoundException, IOException{
        String ruta = "D:\\Hola\\Personas.per";
        FileOutputStream abrir = new FileOutputStream(ruta);
        ObjectOutputStream guardarDatos = new ObjectOutputStream(abrir);
        guardarDatos.writeObject(obj);
    }

}

class Persona implements Serializable{
    String Nombre;
    int Edad;
    String Apellido;
    
    public Persona() {
        Nombre = "";
        Edad = 0;
        Apellido = "";
    }

    public Persona(String Nombre, int Edad, String Apellido) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + Nombre + "\n" + "Apellido: " + Apellido + "\n" + "Edad: " + Edad; 
    }
    
}