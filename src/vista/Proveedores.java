package vista;

import Conexion.Conexion;
import Controlador.Ctrl_Proveedores;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.proveedores;

public class Proveedores extends javax.swing.JInternalFrame {

    int obtenerIdCategoriaCombo = 0;

    public Proveedores() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Proveedor");
        
        this.CargarComboCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        txt_direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("   Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Direccion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, -1));

        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, -1));

        jButton_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 30));

        txt_direccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText(" Categoria:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoria:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed

        proveedores Proveedores = new proveedores();
        Ctrl_Proveedores controlproveedores = new Ctrl_Proveedores();
        String categoria = "";
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        //validar campos
        if (txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_direccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            txt_nombre.setBackground(Color.red);
            txt_apellido.setBackground(Color.red);
            txt_direccion.setBackground(Color.red);
        } else {
            //consulta para ver si el proveedore ya existe
            if (!controlproveedores.existeproveedor(txt_nombre.getText().trim())) {
                if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione categoria");
                } else {
                    try {
                        Proveedores.setNombre(txt_nombre.getText().trim());
                        Proveedores.setApellido(txt_apellido.getText().trim());

                        //idcategoria - cargar metodo para obtener el id de la categoria
                        this.IdCategoria();
                        Proveedores.setIdCategoria(obtenerIdCategoriaCombo);
                        Proveedores.setEstado(1);

                        if (controlproveedores.guardar(Proveedores)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            txt_nombre.setBackground(Color.green);
                            txt_apellido.setBackground(Color.green);
                            txt_direccion.setBackground(Color.green);
                            txt_telefono.setBackground(Color.green);

                            this.CargarComboCategorias();
                        }
                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en: " + e);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El proveedor ya existe en la base de datos");
            }
        }

        if (!txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_direccion.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(null , "Correcto!");
            if (!controlproveedores.existeproveedor(txt_direccion.getText().trim())) {

                Proveedores.setNombre(txt_nombre.getText().trim());
                Proveedores.setApellido(txt_apellido.getText().trim());
                Proveedores.setDireccion(txt_direccion.getText().trim());
                Proveedores.setTelefono(txt_telefono.getText().trim());
                Proveedores.setEstado(1);

                if (controlproveedores.guardar(Proveedores)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    txt_nombre.setBackground(Color.green);
                    txt_apellido.setBackground(Color.green);
                    txt_direccion.setBackground(Color.green);
                    txt_telefono.setBackground(Color.green);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "el proveedor ya esta registrado en la base de datos");
                txt_nombre.setBackground(Color.white);
                txt_apellido.setBackground(Color.white);
                txt_direccion.setBackground(Color.white);
                txt_telefono.setBackground(Color.white);
            }
        } else {
            JOptionPane.showMessageDialog(null, "completa todos los campos");
            txt_nombre.setBackground(Color.red);
            txt_apellido.setBackground(Color.red);
            txt_direccion.setBackground(Color.red);
            txt_telefono.setBackground(Color.red);
        }
        //metodo limpiar 
        this.limpiar();
    }//GEN-LAST:event_jButton_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    //Metodo limpiar campos 
    private void limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");
    }

    //metodo para cargar las categorias 
    private int IdCategoria() {
        String sql = "select * from t_Categorias where descripcion = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener id acategoria");
        }
        return obtenerIdCategoriaCombo;
    }

    //metodo para cargar las categorias
    private void CargarComboCategorias() {
        Connection cn = Conexion.conectar();
        String sql = "select * from t_Categorias";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar categorias");
        }
    }
}
