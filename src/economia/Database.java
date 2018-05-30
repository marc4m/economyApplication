/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package economia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

    private static Connection con;
    private static  String user = "root";
    private static String password = "progettoing";
    private static String url = "jdbc:mysql://localhost/economia?useSSL=false&serverTimezone=Europe/Rome";

   
    
    public static Connection getConnection()
    {
        if(password.equals("") || user.equals(""))
            System.out.println("Password o user vuoti");
        else
        {
           try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            } catch (ClassNotFoundException ex) {
            System.out.println("Driver Connector non funzionante");
             }
           try {
            
                con = DriverManager.getConnection(url,user,password);
            
             } catch (SQLException ex) {
                 System.out.println("Errore connessione");
             }
        }
       return con;
    }
    public static void closeConnection()
    {
        
             if(con != null)
             {
                 try
                 {
                    con.close();
 
                 }
                 catch(SQLException ex)
                 {
                     System.out.println("Errore nella chiusura");
                 }
             }
       
    }
    
}
