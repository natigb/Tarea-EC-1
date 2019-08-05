/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

//import java.io.FileReader;
import java.io.*; 
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
          int i;
          
          FileReader fr=new FileReader("C:\\Users\\Nati Gonzalez\\Desktop\\Datos I\\Tarea EC 1\\Notas.csv");    
          BufferedReader br=new BufferedReader(fr);
          System.out.println(br.readLine());
          //while (row=br.readLine() != null) {
            //data = row.split(",");
    // do something with the data
            //}
          
          //while((i=br.read())!=-1){
          
          //System.out.print((char)i);  
          //}  
          br.close();    
          fr.close();
        //try ( // TODO code application logic here
          //  FileReader doc = new FileReader("C:\\Users\\Nati Gonzalez\\Desktop\\Datos I\\Tarea EC 1\\Notas.csv")) {
          //  int i;
          //  while((i=doc.read())!=-1)
          //      System.out.print((char)i);
        //} 
       
    }
    
}
