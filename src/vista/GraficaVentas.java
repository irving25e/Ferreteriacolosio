package vista;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GraficaVentas extends javax.swing.JInternalFrame {

    ArrayList<Integer> ListaCantidad = new ArrayList<>();
    ArrayList<String> listaFechas = new ArrayList<>();
    int cantidadResultados = 0;
    String[] vector_fechaVenta;
    int[] vector_estatus_cantidad;

    public GraficaVentas() {
        initComponents();
        this.setSize(new Dimension(550, 650));
        this.setTitle("Historial de Ventas");
        this.MetodoContador();
        vector_fechaVenta = new String[cantidadResultados];
        vector_estatus_cantidad = new int[cantidadResultados];
        this.MetodoALmacenaDatos();
    }

    //metodo para determinar la cantidad de resultados a graficar
    private int MetodoContador() {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select  fechaVenta, count(fechaVenta) as Ventas from t_cabecera_venta"
                    + "where fechaVenta BETWEEN '" + Graficas.fecha_inicio + "' and '" + Graficas.fecha_fin + "' group by fechaVenta;");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cantidadResultados++;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error en: " + e);
        }
        return cantidadResultados;
    }

    //Metodo para almacenar en la lisa los datos a graficar
    private void MetodoALmacenaDatos() {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select  fechaVenta, count(fechaVenta) as Ventas from t_cabecera_venta"
                    + "where fechaVenta BETWEEN '" + Graficas.fecha_inicio + "' and '" + Graficas.fecha_fin + "' group by fechaVenta;");
            ResultSet rs = pst.executeQuery();
            int contador = 0;
            while (rs.next()) {
                vector_fechaVenta[contador] = rs.getString("fechaVenta");
                listaFechas.add(vector_fechaVenta[contador]);
                vector_estatus_cantidad[contador] = rs.getInt("Ventas");
                ListaCantidad.add(vector_estatus_cantidad[contador]);
                contador++;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error en: " + e);
        }
    }

    //Metodo para determinar cua es el dia de mayor cantidad de ventas 
    public int MetodoMayorVenta(ArrayList<Integer> ListaCantidad) {
        int mayor = 0;
        for (int i = 0; i < ListaCantidad.size(); i++) {
            if (ListaCantidad.get(i) > mayor) {
                mayor = ListaCantidad.get(i);
            }
        }
        return mayor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione fechas para Graficas ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    //Metodo que dibuja graficas
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int mayorVenta = MetodoMayorVenta(ListaCantidad);
        int largo_NuevoIngreso = 0;
        int parametro1 = 133;
        int parametroFecha = 118;
        int parametro3 = 100;

        for (int i = 0; i < ListaCantidad.size(); i++) {
            largo_NuevoIngreso = ListaCantidad.get(i) * 400 / mayorVenta;

            if (i == 0) {
                g.setColor(new Color(140, 0, 75));//morado
            } else if (i == 1) {
                g.setColor(new Color(255, 0, 0));//rojo
            } else if (i == 2) {
                g.setColor(new Color(0, 0, 0));//negro
            } else if (i == 3) {
                g.setColor(new Color(255, 255, 255));//blanco
            } else if (i == 4) {
                g.setColor(new Color(0, 85, 0));//verde
            } else if (i == 5) {
                g.setColor(new Color(0, 0, 255));//azul
            } else if (i == 6) {
                g.setColor(new Color(255, 127, 0));//naranja
            } else {
                g.setColor(new Color(17, 251, 216));//celeste
            }
            g.fillRect(100, parametro3, largo_NuevoIngreso, 40);
            g.drawString(listaFechas.get(i), 10, parametroFecha);
            g.drawString("Cantidad: " + ListaCantidad.get(i), 10, parametro1);
            parametro1 += 50;
            parametroFecha += 50;
            parametro3 += 50;
        }
    }
}
