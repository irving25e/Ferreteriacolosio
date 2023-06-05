package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.UsuarioGerente;

public class Ctrl_Usuario_Gerente {

    public boolean LoginUser(UsuarioGerente objeto) {

        boolean respuesta = false;

        Connection cn = Conexion.conectar();
        String sql = " select usuario, password from t_Usuariosg where usuario = '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error en el inicio de sesion");
            JOptionPane.showMessageDialog(null, "Error en el inicio de sesion");
        }

        return respuesta;
    }
}
