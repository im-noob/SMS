/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DebugFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kumar
 */
public class DebugClassDaoImpl  {

 
    public static void fileWriterG(Object obj,Object stre) {
            

         
        FileWriter fr = null;
        try {
            File file  = new File("C:/TestFile/testFile1.txt");
            fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            PrintWriter pr = new PrintWriter(br);
              DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
              LocalDateTime now = LocalDateTime.now();  
              
              pr.println(obj);
              pr.print(dtf.format(now));
              pr.print("    ::  ");
              pr.println(stre);
           
            pr.close();
            br.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(DebugClassDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DebugClassDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                   
    }
    
      
   
}
