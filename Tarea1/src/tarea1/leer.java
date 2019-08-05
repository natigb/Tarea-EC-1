/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.io.FileReader;

/**
 *
 * @author Nati Gonzalez
 */
public class leer {


    public void leercsv() throws Exception{
 
       int i; 
        try (FileReader doc = new FileReader("C:\\Users\\Nati Gonzalez\\Desktop\\Datos I\\Tarea EC 1\\Notas.csv")) {
            System.out.println(doc.read());
            while((i=doc.read())!=-1)
                System.out.print((char)i);
        }
    
    }
    
}
