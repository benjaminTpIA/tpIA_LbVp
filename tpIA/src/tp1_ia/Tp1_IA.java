/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_ia;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import ConnexionDB.ConnexionBDD;

/**
 * classe principale
 * @author b
 */
public class Tp1_IA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try
       {
         ConnexionBDD.getInstance();  
       }catch(Exception e)
       {
           e.printStackTrace();
       }
        
        
       
    }
}
