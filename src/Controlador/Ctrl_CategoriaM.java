package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Categoria;

public class Ctrl_CategoriaM {

    //metodo para registrar categoria
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into t_Categorias values (?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guradar categoria: " + e);
        }

        return respuesta;

    }

    //metodo para consultar si existe la categoria
    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        String sql = " select descripcion from t_Categorias where descripcion = '" + categoria + "'; ";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar categoria: " + e);
        }

        return respuesta;

    }
    
    //metodo para actualizar una nueva categoria
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update t_Categorias set descripcion=? where idCategoria ='" + idCategoria +"'");
            consulta.setString(1, objeto.getDescripcion());
           

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar  categoria: " + e);
        }

        return respuesta;

    }
    
    //metodo para eliminar una nueva categoria
    public boolean eliminar(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from t_Categorias where idCategoria ='" + idCategoria +"'");
            consulta.executeUpdate();
           

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar  categoria: " + e);
        }

        return respuesta;

    }

}
