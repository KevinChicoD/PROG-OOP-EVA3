/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_13_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author invitado
 */
public class EVA3_13_ESCRIBIR_ARCHIVOS {
    final static String miRuta = "E:\\Hola\\Archivo.txt ";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        escribirFiles(miRuta + "Files.txt",
                "Hola mundo!!\n" +
                        "Prueba con la clase files");
            escribirFilesWriter(miRuta + "FileWriter.txt",
                    "Segunda prueba\n +"
                            + "Pueba con el filewriter");
            escribirBufferedWriter(miRuta + "BufeferedWriter.txt",
                    "Tercer metodo\n" +
                            "Prueba con BufeferedWriter");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    //clase Files
    public static void escribirFiles(String ruta, String datos) throws IOException
    {
     Path path = Paths.get(ruta);//abrir el archivo
     Files.write(path, datos.getBytes());//guardar los datos
    }
    
     public static void escribirFilesWriter(String ruta, String datos) throws IOException{
         File file = new File(ruta);
         FileWriter filewriter = new FileWriter(file);
         filewriter.write(datos);
         filewriter.close();
    }
     
     public static void escribirBufferedWriter(String ruta, String datos) throws IOException{
          File file = new File(ruta);
         FileWriter filewriter = new FileWriter(file);
         BufferedWriter bw = new BufferedWriter(filewriter);
         bw.write(datos);
         bw.close();
     }
    
}
