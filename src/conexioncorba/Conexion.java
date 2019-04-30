
package conexioncorba;


import java.sql.*;
/**
 *
 * @author Tamayo
 */
public class Conexion {
    public Connection conex;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/conexion_corba" , "root" , "");
            System.out.println("La conexion se realizo con exito");
        } catch (Exception e) {
            System.out.println("No fue posible la conexion." + e.getMessage());
        }
        return conex;
        
    }
    
    
}
