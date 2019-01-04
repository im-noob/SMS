/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DebugFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author kumar
 */
public class SqlFile {
    
    public void exportFile(){
            FileWriter fw = null;                   

            String path="C:\\Users\\kumar\\Desktop\\test\\back.sql";
            String dumpCommand ="mysqldump -u root --password=''  > "+path;
            // Runtime.getRuntime().exec("mysqldump -u root --password= gestiondestock > "+path);
            File data = new File(path);

            try{
                fw = new FileWriter(data);
                fw.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }

            Runtime rt = Runtime.getRuntime();

            try {
                Process proc = rt.exec(dumpCommand);
                InputStream in = proc.getInputStream();
                InputStreamReader read = new InputStreamReader(in,"latin1");
                BufferedReader br = new BufferedReader(read);
                BufferedWriter bw = new BufferedWriter(new FileWriter(data,true));
                String line=null;
                StringBuffer buffer = new StringBuffer();

                while ((line=br.readLine())!=null){
                    buffer.append(line+"\n");
                }
                String toWrite = buffer.toString();
                bw.write(toWrite);
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
}
