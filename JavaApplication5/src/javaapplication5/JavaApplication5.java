/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

//import java.io.FileReader;
import java.io.*; 
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nati Gonzalez
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    public static void main(String[] args) throws Exception {
          String line;
             
          BufferedReader archivo=new BufferedReader(new FileReader("C:\\Users\\Nati Gonzalez\\Desktop\\Datos I\\Tarea EC 1\\Notas.csv"));
          System.out.println(archivo);
          List a=new ArrayList();
          while ((line=archivo.readLine()) != null) {
                String[] dato = line.split(",", -1);
                //System.out.println(dato);
 
                //Record record = new Record(fields[0], fields[1], fields[2],
                  //      fields[3], fields[4], fields[5]);
                //a.add(dato);
 
            }
          
          //System.out.println(a);
          
          
          archivo.close();    
       
    }
    
}
