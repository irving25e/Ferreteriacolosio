package vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

public class Responsable extends javax.swing.JFrame {

    public static JDesktopPane JDesktopPane_Responsable;

    public Responsable() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Ferreteria Colosio - Menu");

        this.setLayout(null);
        JDesktopPane_Responsable = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.JDesktopPane_Responsable.setBounds(0, 0, ancho, (alto - 110));
        this.add(JDesktopPane_Responsable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3_Producto = new javax.swing.JMenuItem();
        jMenuItem4_Gestionar_productos = new javax.swing.JMenuItem();
        jMenuItem5_Actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8_Material = new javax.swing.JMenuItem();
        jMenuItem9_Gestionar_material = new javax.swing.JMenuItem();
        jMenuItem18_Actualizar_stock = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6_cliente = new javax.swing.JMenuItem();
        jMenuItem7_Gestionar_cliente = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem15_Gestionar_categoria = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem14_ayuda = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem14_salir3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_productos.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 30));

        jMenuItem3_Producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Anadir.png"))); // NOI18N
        jMenuItem3_Producto.setText("Nuevo Producto");
        jMenuItem3_Producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem3_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_ProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3_Producto);

        jMenuItem4_Gestionar_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4_Gestionar_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenuItem4_Gestionar_productos.setText("Gestionar Producto");
        jMenuItem4_Gestionar_productos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem4_Gestionar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4_Gestionar_productosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4_Gestionar_productos);

        jMenuItem5_Actualizar_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem5_Actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Actualizar.png"))); // NOI18N
        jMenuItem5_Actualizar_stock.setText("Actualizar stock");
        jMenuItem5_Actualizar_stock.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem5_Actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5_Actualizar_stockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5_Actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_material.png"))); // NOI18N
        jMenu3.setText("Materiales");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(170, 50));

        jMenuItem8_Material.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem8_Material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Anadir.png"))); // NOI18N
        jMenuItem8_Material.setText("Nuevo Material");
        jMenuItem8_Material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8_MaterialActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8_Material);

        jMenuItem9_Gestionar_material.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem9_Gestionar_material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_material.png"))); // NOI18N
        jMenuItem9_Gestionar_material.setText("Gestionar Material");
        jMenuItem9_Gestionar_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9_Gestionar_materialActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9_Gestionar_material);

        jMenuItem18_Actualizar_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem18_Actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Actualizar.png"))); // NOI18N
        jMenuItem18_Actualizar_stock.setText("Actualizar stock");
        jMenuItem18_Actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18_Actualizar_stockActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18_Actualizar_stock);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_clientes.png"))); // NOI18N
        jMenu4.setText("Clientes ");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(170, 30));

        jMenuItem6_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem6_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Anadir.png"))); // NOI18N
        jMenuItem6_cliente.setText("Nuevo Cliente ");
        jMenuItem6_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem6_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6_clienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6_cliente);

        jMenuItem7_Gestionar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem7_Gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Buscar.png"))); // NOI18N
        jMenuItem7_Gestionar_cliente.setText("Gestionar cliente");
        jMenuItem7_Gestionar_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem7_Gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7_Gestionar_clienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7_Gestionar_cliente);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Inventario.png"))); // NOI18N
        jMenu6.setText("Categoria");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem14_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem14_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Vender.png"))); // NOI18N
        jMenuItem14_nueva_categoria.setText("Nueva categoria");
        jMenuItem14_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14_nueva_categoria);

        jMenuItem15_Gestionar_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem15_Gestionar_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenuItem15_Gestionar_categoria.setText("Gestionar categoria");
        jMenuItem15_Gestionar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15_Gestionar_categoriaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15_Gestionar_categoria);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Estadisticas.png"))); // NOI18N
        jMenu7.setText("Facturar");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(170, 50));

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Anadir.png"))); // NOI18N
        jMenuItem1.setText("Nueva venta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenuItem2.setText("Gestionar venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Anadir.png"))); // NOI18N
        jMenuItem3.setText("Nueva venta Material");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenuItem4.setText("Gestionar venta Material");
        jMenu7.add(jMenuItem4);

        jMenuBar1.add(jMenu7);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenu11.setText("Ayuda");
        jMenu11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu11.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem14_ayuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem14_ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenuItem14_ayuda.setText("Ayuda");
        jMenuItem14_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14_ayudaActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem14_ayuda);

        jMenuBar1.add(jMenu11);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Salir.png"))); // NOI18N
        jMenu10.setText("Salir");
        jMenu10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu10.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem14_salir3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem14_salir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Salir.png"))); // NOI18N
        jMenuItem14_salir3.setText("Salir");
        jMenuItem14_salir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14_salir3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem14_salir3);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem15_Gestionar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15_Gestionar_categoriaActionPerformed
        InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
        JDesktopPane_Responsable.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem15_Gestionar_categoriaActionPerformed

    private void jMenuItem14_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14_nueva_categoriaActionPerformed
        InterCategoria intercategoria = new InterCategoria();
        JDesktopPane_Responsable.add(intercategoria);
        intercategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem14_nueva_categoriaActionPerformed

    private void jMenuItem7_Gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7_Gestionar_clienteActionPerformed
        InterGestionarCliente intergestionarcliente = new InterGestionarCliente();
        JDesktopPane_Responsable.add(intergestionarcliente);
        intergestionarcliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem7_Gestionar_clienteActionPerformed

    private void jMenuItem6_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6_clienteActionPerformed
        Clientes clientes = new Clientes();
        JDesktopPane_Responsable.add(clientes);
        clientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem6_clienteActionPerformed

    private void jMenuItem5_Actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5_Actualizar_stockActionPerformed
        ActualizarStock actualizarstock = new ActualizarStock();
        JDesktopPane_Responsable.add(actualizarstock);
        actualizarstock.setVisible(true);
    }//GEN-LAST:event_jMenuItem5_Actualizar_stockActionPerformed

    private void jMenuItem4_Gestionar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4_Gestionar_productosActionPerformed
        InterGestionarProducto intergestionarproducto = new InterGestionarProducto();
        JDesktopPane_Responsable.add(intergestionarproducto);
        intergestionarproducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem4_Gestionar_productosActionPerformed

    private void jMenuItem3_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_ProductoActionPerformed
        Productos productos = new Productos();
        JDesktopPane_Responsable.add(productos);
        productos.setVisible(true);
    }//GEN-LAST:event_jMenuItem3_ProductoActionPerformed

    private void jMenuItem14_salir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14_salir3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem14_salir3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Facturacion facturacion = new Facturacion();
        JDesktopPane_Responsable.add(facturacion);
        facturacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        InterGestionarventas intergestionarventas = new InterGestionarventas();
        JDesktopPane_Responsable.add(intergestionarventas);
        intergestionarventas.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8_MaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8_MaterialActionPerformed
        Materiales materiales = new Materiales();
        JDesktopPane_Responsable.add(materiales);
        materiales.setVisible(true);
    }//GEN-LAST:event_jMenuItem8_MaterialActionPerformed

    private void jMenuItem9_Gestionar_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9_Gestionar_materialActionPerformed
        InterGestionarMaterial intergestionarmaterial = new InterGestionarMaterial();
        JDesktopPane_Responsable.add(intergestionarmaterial);
        intergestionarmaterial.setVisible(true);
    }//GEN-LAST:event_jMenuItem9_Gestionar_materialActionPerformed

    private void jMenuItem18_Actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18_Actualizar_stockActionPerformed
        ActualizarStockM actualizarstockm = new ActualizarStockM();
        JDesktopPane_Responsable.add(actualizarstockm);
        actualizarstockm.setVisible(true);
    }//GEN-LAST:event_jMenuItem18_Actualizar_stockActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FacturacionM facturacion = new FacturacionM();
        JDesktopPane_Responsable.add(facturacion);
        facturacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem14_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14_ayudaActionPerformed
        Ayuda ayuda = new Ayuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_jMenuItem14_ayudaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Responsable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14_ayuda;
    private javax.swing.JMenuItem jMenuItem14_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem14_salir3;
    private javax.swing.JMenuItem jMenuItem15_Gestionar_categoria;
    private javax.swing.JMenuItem jMenuItem18_Actualizar_stock;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem3_Producto;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem4_Gestionar_productos;
    private javax.swing.JMenuItem jMenuItem5_Actualizar_stock;
    private javax.swing.JMenuItem jMenuItem6_cliente;
    private javax.swing.JMenuItem jMenuItem7_Gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem8_Material;
    private javax.swing.JMenuItem jMenuItem9_Gestionar_material;
    // End of variables declaration//GEN-END:variables
}
