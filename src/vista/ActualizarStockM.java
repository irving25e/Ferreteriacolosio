package vista;

import Conexion.Conexion;
import Controlador.Ctrl_Material;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Material;

public class ActualizarStockM extends javax.swing.JInternalFrame {

    //variables
    int idProducto = 0;
    int Cantidad = 0;

    public ActualizarStockM() {
        initComponents();
        setTitle("Actualizar stock de los Materiales");
        setSize(new Dimension(400, 300));

        this.CargarComboProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cantidad_actual = new javax.swing.JTextField();
        txt_cantidad_nueva = new javax.swing.JTextField();
        jComboBox_material = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Stock de Materiales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Stock Actual:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Stock Nuevo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        txt_cantidad_actual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cantidad_actual.setEnabled(false);
        getContentPane().add(txt_cantidad_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, -1));

        txt_cantidad_nueva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_cantidad_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        jComboBox_material.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione material: ", "Item 2", "Item 3", "Item 4" }));
        jComboBox_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_materialActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_materialActionPerformed
        this.mostrarStock();
    }//GEN-LAST:event_jComboBox_materialActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //validamos seleccion de producto
        if (!jComboBox_material.getSelectedItem().equals("Seleccione material:")) {
            //validamos campos vacios
            if (!txt_cantidad_nueva.getText().isEmpty()) {
                //validamos que el usuario no ingrese otro caracteres numericos
                boolean validacion = validar(txt_cantidad_nueva.getText().trim());
                if (validacion == true) {
                    //validar que la cantidad sea mayor que cero (0)
                    if (Integer.parseInt(txt_cantidad_nueva.getText()) > 0) {

                        Material material = new Material();
                        Ctrl_Material controlmaterial = new Ctrl_Material();
                        int stockActual = Integer.parseInt(txt_cantidad_actual.getText().trim());
                        int stockNuevo = Integer.parseInt(txt_cantidad_nueva.getText().trim());
                        stockNuevo = stockActual + stockNuevo;
                        material.setCantidad(stockNuevo);
                        if (controlmaterial.ActualizarStock(material, idProducto)) {
                            JOptionPane.showMessageDialog(null, "¡Stock Actualizado!");
                            jComboBox_material.setSelectedItem("Seleccione material:");
                            txt_cantidad_actual.setText("");
                            txt_cantidad_nueva.setText("");
                            this.CargarComboProductos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar Stock");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero ni negativa");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ingrese una nueva cantidad para sumar el stock del material");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un material");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_material;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_cantidad_actual;
    private javax.swing.JTextField txt_cantidad_nueva;
    // End of variables declaration//GEN-END:variables

    //metodo para cargar los productos en el JComboBox
    private void CargarComboProductos() {

        Connection cn = Conexion.conectar();
        String sql = "select * from t_Material";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_material.removeAllItems();
            jComboBox_material.addItem("Seleccione material:");
            while (rs.next()) {
                jComboBox_material.addItem(rs.getString("Nombre"));
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar los materiales en: " + e);
        }
    }

    //metodo para mostrar stock del producto seleccionado
    private void mostrarStock() {
        try {
            Connection cn = Conexion.conectar();
            String sql = "select * from t_Material where Nombre = '" + this.jComboBox_material.getSelectedItem() + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idProducto = rs.getInt("idMaterial");
                Cantidad = rs.getInt("Cantidad");
                txt_cantidad_actual.setText(String.valueOf(Cantidad));
            } else {
                txt_cantidad_actual.setText("");

            }

        } catch (SQLException e) {
            System.out.println("Error al obtener stock del material en: " + e);
        }
    }

    //metodo de validacion de caracteres numericos
    private boolean validar(String valor) {
        int num;
        try {
            num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
