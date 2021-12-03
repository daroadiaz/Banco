
package BD;
/**
 *
 * @author Daniel Roa
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Daniel Roa
 */
public class Conexion {
    public Connection obtenerConexion(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cliente","root","");
        System.out.println("Conexión exitosa"); 
        }
        catch (SQLException e) {
            System.out.println("Error de conexión"+e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}

