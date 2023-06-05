package vista;

import Controlador.Reportes;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import modelo.proveedores;

public class Gerente extends javax.swing.JFrame {
    
    public static JDesktopPane JDesktopPane_Gerente;
    
    public Gerente() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Reportes - Menu");
        
        this.setLayout(null);
        JDesktopPane_Gerente = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.JDesktopPane_Gerente.setBounds(0, 0, ancho, (alto - 110));
        this.add(JDesktopPane_Gerente);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/spr_report.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1_reporte_venta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2_reporte_productos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3_reporte_material = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4_reporte_cliente = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem4_reporte_categorias = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5_proveedores = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem6_salir1 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem6_salir = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(150, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_report.png"))); // NOI18N
        jMenu1.setText("Reportes venta");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(160, 50));

        jMenuItem1_reporte_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem1_reporte_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Estadisticas.png"))); // NOI18N
        jMenuItem1_reporte_venta.setText("Reporte venta");
        jMenuItem1_reporte_venta.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem1_reporte_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_reporte_ventaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1_reporte_venta);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_report.png"))); // NOI18N
        jMenu2.setText("Reportes Productos");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(180, 50));

        jMenuItem2_reporte_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem2_reporte_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_productos.png"))); // NOI18N
        jMenuItem2_reporte_productos.setText("Reporte producto");
        jMenuItem2_reporte_productos.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem2_reporte_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_reporte_productosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2_reporte_productos);

        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_report.png"))); // NOI18N
        jMenu5.setText("Reportes Material");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(170, 50));

        jMenuItem3_reporte_material.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3_reporte_material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_material.png"))); // NOI18N
        jMenuItem3_reporte_material.setText("Reporte material");
        jMenuItem3_reporte_material.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu5.add(jMenuItem3_reporte_material);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_report.png"))); // NOI18N
        jMenu7.setText("Reportes Clientes");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(170, 50));

        jMenuItem4_reporte_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4_reporte_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Empleados.png"))); // NOI18N
        jMenuItem4_reporte_cliente.setText("Reporte cliente");
        jMenuItem4_reporte_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem4_reporte_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4_reporte_clienteActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4_reporte_cliente);

        jMenuBar1.add(jMenu7);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_report.png"))); // NOI18N
        jMenu10.setText("Reportes Categorias");
        jMenu10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu10.setPreferredSize(new java.awt.Dimension(190, 50));

        jMenuItem4_reporte_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4_reporte_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_report.png"))); // NOI18N
        jMenuItem4_reporte_categorias.setText("Reporte categorias");
        jMenuItem4_reporte_categorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem4_reporte_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4_reporte_categoriasActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem4_reporte_categorias);

        jMenuBar1.add(jMenu10);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Empleados.png"))); // NOI18N
        jMenu8.setText("Proveedores");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(170, 50));

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Anadir.png"))); // NOI18N
        jMenuItem1.setText("Nuevo proveedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuItem5_proveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem5_proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenuItem5_proveedores.setText("Gestionar proveedores");
        jMenuItem5_proveedores.setPreferredSize(new java.awt.Dimension(240, 30));
        jMenuItem5_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5_proveedoresActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5_proveedores);

        jMenuBar1.add(jMenu8);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenu11.setText("Ayuda");
        jMenu11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu11.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem6_salir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem6_salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_config.png"))); // NOI18N
        jMenuItem6_salir1.setText("Ayuda");
        jMenuItem6_salir1.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem6_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6_salir1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem6_salir1);

        jMenuBar1.add(jMenu11);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Salir.png"))); // NOI18N
        jMenu9.setText("Salir");
        jMenu9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem6_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem6_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Salir.png"))); // NOI18N
        jMenuItem6_salir.setText("Salir");
        jMenuItem6_salir.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem6_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6_salirActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem6_salir);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6_salirActionPerformed

    private void jMenuItem4_reporte_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4_reporte_clienteActionPerformed
        Reportes reportes = new Reportes();
        reportes.ReportesClientes();
    }//GEN-LAST:event_jMenuItem4_reporte_clienteActionPerformed

    private void jMenuItem2_reporte_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_reporte_productosActionPerformed
        Reportes reportes = new Reportes();
        reportes.ReportesProductos();
    }//GEN-LAST:event_jMenuItem2_reporte_productosActionPerformed

    private void jMenuItem4_reporte_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4_reporte_categoriasActionPerformed
        Reportes reportes = new Reportes();
        reportes.ReportesCategorias();
    }//GEN-LAST:event_jMenuItem4_reporte_categoriasActionPerformed

    private void jMenuItem1_reporte_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_reporte_ventaActionPerformed
        Reportes reportes = new Reportes();
        reportes.ReportesVentas();
    }//GEN-LAST:event_jMenuItem1_reporte_ventaActionPerformed

    private void jMenuItem5_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5_proveedoresActionPerformed
        InterGestionarProveedores intergestinarproveedores = new InterGestionarProveedores();
        intergestinarproveedores.setVisible(true);
    }//GEN-LAST:event_jMenuItem5_proveedoresActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Proveedores proveedores = new Proveedores();
        JDesktopPane_Gerente.add(proveedores);
        proveedores.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6_salir1ActionPerformed
        Ayuda ayuda = new Ayuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_jMenuItem6_salir1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1_reporte_venta;
    private javax.swing.JMenuItem jMenuItem2_reporte_productos;
    private javax.swing.JMenuItem jMenuItem3_reporte_material;
    private javax.swing.JMenuItem jMenuItem4_reporte_categorias;
    private javax.swing.JMenuItem jMenuItem4_reporte_cliente;
    private javax.swing.JMenuItem jMenuItem5_proveedores;
    private javax.swing.JMenuItem jMenuItem6_salir;
    private javax.swing.JMenuItem jMenuItem6_salir1;
    // End of variables declaration//GEN-END:variables
}
