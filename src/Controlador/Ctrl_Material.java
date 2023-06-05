package Controlador;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Material;

public class Ctrl_Material {

    //metodo para guardar un nuevo producto
    public boolean guardar(Material objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into t_Material values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIva());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar material: " + e);
        }
        return respuesta;
    }

    //metodo para consultar si el producto ya esta registrado en la BBDD
    public boolean existeProducto(String material) {
        boolean respuesta = false;
        String sql = "select Nombre from t_Material where Nombre '" + material + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar material: " + e);
        }
        return respuesta;
    }

    //metodo para actualizar un producto
    public boolean actualizar(Material objeto, int idMaterial) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update t_Material set Nombre =?, Cantidad =?, precio =?, descripcion =?, porcentajeIva =?, idCategoria =?, estado =? where idMaterial = '" + idMaterial + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentajeIva());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar materiales: " + e);
        }
        return respuesta;
    }

    //metodo para eliminar un producto
    public boolean eliminar(int idMaterial) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from t_Material where idMaterial ='" + idMaterial + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar un material: " + e);
        }
        return respuesta;
    }

    //metodo para actualizar stock de un producto
    public boolean ActualizarStock(Material object, int idMaterial) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update t_Material set Cantidad=? where idMaterial ='" + idMaterial + "'");
            consulta.setInt(1, object.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar stock del material: " + e);
        }
        return respuesta;
    }

}
