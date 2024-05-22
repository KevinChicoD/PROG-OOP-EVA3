/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_leer_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class EVA3_12_LEER_ARCHIVOS {
    final static String miRuta = "D:\\Hola\\archivo_texto.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
           
           leerArchivoFiles(miRuta);
           leerArchivoBuffered(miRuta);
           leerArchivoFileReader(miRuta);
           leerArchivoScanner(miRuta);
       } catch (IOException ex) {
            ex.printStackTrace();

       }
       
        
        
        
    }
    
     public static void leerArchivoFiles(String ruta) throws IOException{     
     /*  Lectura con la clase files
         Se lee todo el archivo y se carga en memoria 
         por tanto, es util solo para archivos pequeños         
         */
         System.out.println("Lectura de archivo de texto con clases files______________");
         Path path = Paths.get(ruta);//crea la ruta de tipo path
         byte[] datos = Files.readAllBytes(path);//Genera un IOException
            //new String convierte el arrelo byte en cadena de texto
         System.out.println(new String(datos));
     }
     /*
     Es adecuado para leer archivos grandes.
     Nos permite procesar archivos linea por linea
     Es adecuado para la multitarea (hilos de ejecucion)
     */
     public static void leerArchivoBuffered(String ruta) throws FileNotFoundException, IOException{
         System.out.println("Lectura de archivo de texto con la clase Buffered_________________");
         //abrir el archivo
         //leer el archivo con informacion binaria
         //convertir la informacion binaria a texto
        
        File file = new File(ruta);
        FileInputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
     
        String cade;
               //asignamos la linea a la variable cade
               //si cade es diferente de null, estamos leyendo texto, si llegamos
               //al final del archivo
        while((cade = br.readLine()) != null){
            System.out.println(cade);                       
        }
        br.close();
     
     
     
     }
     /*
     
     
     */
     public static void leerArchivoFileReader(String ruta) throws FileNotFoundException, IOException{
         System.out.println("Lectura de archivo de texto con la clase FileReader_________________");
         File file = new File(ruta);
         FileReader reader = new FileReader(file);
         BufferedReader br = new BufferedReader(reader);

           String cade;
                  //asignamos la linea a la variable cade
                  //si cade es diferente de null, estamos leyendo texto, si llegamos
                  //al final del archivo
           while((cade = br.readLine()) != null){
               System.out.println(cade);                       
           }
           br.close();
     
     
     }
     
     public static void leerArchivoScanner(String ruta) throws IOException{
     System.out.println("Lectura de archivo de texto con la clase Scanner_________________");
     Path path = Paths.get(ruta);
     Scanner sc = new Scanner(path);
     
     while(sc.hasNextLine()){
     
         String  cade = sc.nextLine();
         System.out.println(cade);
     
     
     }
     sc.close();
     
     
     
     }
    
}
