package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //conexion local 
    public static Connection conectar() {
          
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_Sistema_Ferreteria","root", "123456");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local: " + e);
        }
        return null;
    }
}
