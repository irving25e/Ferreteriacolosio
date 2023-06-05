package Controlador;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.proveedores;

public class Ctrl_Proveedores {

    //metodo para guardar un nuevo proveedor
    public boolean guardar(proveedores objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into t_Proveedores values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getDireccion());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar proveedores: " + e);
        }
        return respuesta;
    }

    //metodo para consultar si el proveedor ya esta registrado en la BBDD
    public boolean existeproveedor(String proveedores) {
        boolean respuesta = false;
        String sql = "select Nombre from t_Proveedores where Nombre '" + proveedores + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar proveedor: " + e);
        }
        return respuesta;
    }

    //metodo para actualizar un proveedor
    public boolean actualizar(proveedores objeto, int idProveedor) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update t_Proveedores set Nombre =?, Apellido =?, Direccion =?, telefono =?, idCategoria =?, estado =? where idProveedor = '" + idProveedor + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getDireccion());
            consulta.setString(4, objeto.getTelefono());
            consulta.setInt(5, objeto.getIdCategoria());
            consulta.setInt(6, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar proveedores: " + e);
        }
        return respuesta;
    }

    //metodo para eliminar un prooveedor
    public boolean eliminar(int idProveedor) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from t_Proveedores where idProveedor ='" + idProveedor + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar un proveedor: " + e);
        }
        return respuesta;
    }
}
