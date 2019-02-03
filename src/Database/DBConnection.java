/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kumar
 */
public class DBConnection {
    
    private Connection conn;
    private ResultSet resultSet;
    private Statement smt;

    

    public Connection connectDB(){
        
        String dbURL = "jdbc:mysql://localhost:3306/hemalayan?zeroDateTimeBehavior=convertToNull";//"jdbc:oracle:thin:@localhost:1521:xe";
        String username = "root";
        String password = "";
        boolean flag =false;
        
        
        BufferedReader reader;
       String str[] = new String[3];
        try {
                int i = 0;
                reader = new BufferedReader(new FileReader(".env"));
                String line = reader.readLine();
                while (line != null) {
//                        System.out.println(line);
                        // read next line
                        str[i++] = line;
                        line = reader.readLine();
                }
                reader.close();
                System.out.println("URL:"+str[0]);
                System.out.println("USERNAME:"+str[1]);
                System.out.println("PASSWORD:"+str[2]);
//                System.out.print("string:"+str[0]+" username:"+str[1]+" password:"+str[2]);
                
                String passArr[] = str[2].split("=");
                dbURL = str[0].split("=")[1];
                username = str[1].split("=")[1];
                System.out.println("Array len:"+passArr.length);
                if(passArr.length > 1){
                    password = passArr[1];
                }else{
                    password = "";
                }
                
                
        } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error in DB connection");
                return(null);
        }
        
        try {
            System.out.println("URL:"+dbURL);
            System.out.println("USERNAME:"+username);
            System.out.println("PASSWORD:"+password);
           conn = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return conn;
    }
   
    
    
    
}
