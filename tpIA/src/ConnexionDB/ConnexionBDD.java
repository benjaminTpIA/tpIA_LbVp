/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnexionDB;

/**
 *
 * @author b
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.ResourceBundle;
/**
 *
 * @author b
 */
public class ConnexionBDD{

	
	private  String url = "";
	
	private  String user = "";
	
	private  String passwd = "";
	
	private static Connection connect;
	
        
        
        private ConnexionBDD(){
		try {
                    
                        ResourceBundle rb = ResourceBundle.getBundle("tp1_ia.mybundle");
                        Enumeration <String> keys = rb.getKeys();
                        String key = keys.nextElement();
                        String passwd = rb.getString(key);
                        System.out.println(key + ": " + passwd);
                        key = keys.nextElement();
                        String user=rb.getString(key);
                        System.out.println(key + ": " + user);
                        key = keys.nextElement();
                        String url=rb.getString(key);
                        System.out.println(key + ": " + url);
                  
                        
                      
			connect = DriverManager.getConnection(url, user, passwd);
		} 
                catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getInstance(){
		if(connect == null){
			new ConnexionBDD();
		}
		return connect;	
	}	
}
	
  


/*protected static final String paramDeConnexion = "laConnexionBD.properties";

    static {
	Properties properties = new Properties ();
	try {
	    properties.load (Class.forName ("DbConnection2").getResourceAsStream (paramDeConnexion));
        } catch (Exception e) {
            System.out.println ("Erreur chargement properties DbConnection2 : " + e.toString ());
        }

	try {
            Class.forName (properties.getProperty ("Driver")).newInstance ();
	    // com.mysql.jdbc.Driver
        } catch (Exception e) {
            System.out.println ("Erreur chargement driver DbConnection2 : " + e.toString ());
        }

	try {
	    laConnexion = DriverManager.getConnection (properties.getProperty("URL"), 
						  properties.getProperty("User"), 
						  properties.getProperty("Pass"));
        } catch (Exception e) {
            System.out.println ("Erreur chargement laConnexion DbConnection2 : " + e.toString ());
        }
    }*/