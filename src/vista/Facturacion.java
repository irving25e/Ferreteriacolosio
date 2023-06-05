package vista;

import Conexion.Conexion;
import Controlador.Ctrl_RegistrarVenta;
import Controlador.VentaPDF;
import java.awt.Dimension;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CabeceraVenta;
import modelo.DetalleVenta;

public class Facturacion extends javax.swing.JInternalFrame {

    //Modelo de los catos 
    private DefaultTableModel modeloDatosproductos;
    //Lista para el detalle de venta de los productos
    ArrayList<DetalleVenta> ListaProductos = new ArrayList<>();
    private DetalleVenta producto;

    private int idCliente = 0;//id del cliente seleccionado

    private int idProducto = 0;
    private String Nombre = "";
    private int cantidadProductoBBDD = 0;
    private double precioUnitario = 0.0;
    private int porcentajeIva = 0;

    private int cantidad = 0;//cantidad de prodctos a comprar
    private double subtotal = 0.0;//cantidad por precio
    private double Descuento = 0.0;//
    private double iva = 0.0;
    private double totalpagar = 0.0;

    //variables para calculos globales
    private double subtotalGeneral = 0.0;
    private double descuentoGeneral = 0.0;
    private double ivaGeneral = 0.0;
    private double totalPagarGeneral = 0.0;
    //fin de variables de calculo globales

    private int auxIdDetalle = 1;//id del detalle 

    public Facturacion() {
        initComponents();
        this.setSize(new Dimension(800, 600));
        this.setTitle("Facturacion");

        //cargar los clientes en la vista - cargar productos
        this.CargarComboClientes();
        this.CargarComboProductos();

        this.inicializarTablaProductos();

        txt_efectivo.setEnabled(false);
        jButton_calcular_cambio.setEnabled(false);

        txt_subtotal.setText("0.0");
        txt_iva.setText("0.0");
        txt_descuento.setText("0.0");
        txt_total_pagar.setText("0.0");

        //insertar imagen en nuestro jlabel
        ImageIcon wallpaper = new ImageIcon("src/Imagenes/fondo1.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(800, 600, WIDTH));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();
    }

    //metodo para incialiar la tabla de los prductos
    private void inicializarTablaProductos() {
        modeloDatosproductos = new DefaultTableModel();
        //añadir columnas 
        modeloDatosproductos.addColumn("N");
        modeloDatosproductos.addColumn("Nombre");
        modeloDatosproductos.addColumn("cantidad");
        modeloDatosproductos.addColumn("P. unitaro");
        modeloDatosproductos.addColumn("subtotal");
        modeloDatosproductos.addColumn("Descuento");
        modeloDatosproductos.addColumn("Iva");
        modeloDatosproductos.addColumn("Total pagar");
        modeloDatosproductos.addColumn("Accion");
        //entegar los datos del modelo a la tabla
        this.jTable_productos.setModel(modeloDatosproductos);
    }

    //metodo para presentar la informacion de la tabla Detalleventa
    private void listaTablaProductos() {
        this.modeloDatosproductos.setRowCount(ListaProductos.size());
        for (int i = 0; i < ListaProductos.size(); i++) {
            this.modeloDatosproductos.setValueAt(i + 1, i, 0);
            this.modeloDatosproductos.setValueAt(ListaProductos.get(i).getNombre(), i, 1);
            this.modeloDatosproductos.setValueAt(ListaProductos.get(i).getCantidad(), i, 2);
            this.modeloDatosproductos.setValueAt(ListaProductos.get(i).getPrecioUnitario(), i, 3);
            this.modeloDatosproductos.setValueAt(ListaProductos.get(i).getSubtotal(), i, 4);
            this.modeloDatosproductos.setValueAt(ListaProductos.get(i).getDescuento(), i, 5);
            this.modeloDatosproductos.setValueAt(ListaProductos.get(i).getIva(), i, 6);
            this.modeloDatosproductos.setValueAt(ListaProductos.get(i).getTotalpagar(), i, 7);
            this.modeloDatosproductos.setValueAt("Eliminar", i, 8);//aqui luego poner el boton de eliminar 
        }
        //añadir el jtable
        jTable_productos.setModel(modeloDatosproductos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_cliente = new javax.swing.JComboBox<>();
        jComboBox_producto = new javax.swing.JComboBox<>();
        txt_cliente_buscar = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jButton_busca_cliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_descuento = new javax.swing.JTextField();
        txt_iva = new javax.swing.JTextField();
        txt_total_pagar = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        txt_cambio = new javax.swing.JTextField();
        jButton_calcular_cambio = new javax.swing.JButton();
        jButton_Registrarventa = new javax.swing.JButton();
        jButton_añadir_producto = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Facturación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 80, -1));

        jComboBox_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, -1));

        jComboBox_producto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));

        txt_cliente_buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_cliente_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 150, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 60, -1));

        jButton_busca_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_busca_cliente.setText("Buscar");
        jButton_busca_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_busca_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_busca_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 760, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("subtotal:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Descuento:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Iva:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total a pagar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Efectivo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cambio:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txt_subtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_subtotal.setEnabled(false);
        jPanel2.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, -1));

        txt_descuento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_descuento.setEnabled(false);
        jPanel2.add(txt_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, -1));

        txt_iva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_iva.setEnabled(false);
        jPanel2.add(txt_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        txt_total_pagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_total_pagar.setEnabled(false);
        jPanel2.add(txt_total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        txt_efectivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));

        txt_cambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cambio.setEnabled(false);
        jPanel2.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, -1));

        jButton_calcular_cambio.setBackground(new java.awt.Color(51, 255, 255));
        jButton_calcular_cambio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_calcular_cambio.setText("Calcular Cambio");
        jButton_calcular_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcular_cambioActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_calcular_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 380, 210));

        jButton_Registrarventa.setBackground(new java.awt.Color(51, 255, 255));
        jButton_Registrarventa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Registrarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spr_Guardar.png"))); // NOI18N
        jButton_Registrarventa.setText("Registrar venta");
        jButton_Registrarventa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Registrarventa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_Registrarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarventaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Registrarventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 100));

        jButton_añadir_producto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_añadir_producto.setText("Añadir producto");
        jButton_añadir_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_añadir_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_añadir_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 150, -1));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_busca_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_busca_clienteActionPerformed
        String clienteBuscar = txt_cliente_buscar.getText().trim();
        Connection cn = Conexion.conectar();
        String sql = "select Nombre, apellido from t_clientes where cedula = '" + clienteBuscar + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                jComboBox_cliente.setSelectedItem(rs.getString("Nombre") + " " + rs.getString("Apellido"));
                txt_cliente_buscar.setText("");
            } else {
                jComboBox_cliente.setSelectedItem("Seleccione cliente:");
                JOptionPane.showMessageDialog(null, "¡cedula del cliente incorrecta o no encontrada!");
            }
            txt_cliente_buscar.setText("");
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al buscar cliente , !" + e);
        }
    }//GEN-LAST:event_jButton_busca_clienteActionPerformed

    private void jButton_añadir_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_añadir_productoActionPerformed
        String combo = this.jComboBox_producto.getSelectedItem().toString();
        //validar que seleccione un prodcuto
        if (combo.equalsIgnoreCase("Seleccione producto:")) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            //validar que ingrese una cantidad
            if (!txt_cantidad.getText().isEmpty()) {
                //validar que el usuario no ingrese caracteres no numericos
                boolean validacion = validar(txt_cantidad.getText());
                if (validacion == true) {
                    //validar que la cantidad sea mayor a cero
                    if (Integer.parseInt(txt_cantidad.getText()) > 0) {
                        cantidad = Integer.parseInt(txt_cantidad.getText());
                        //ejecutar metodo para obtener datos del producto
                        this.DatosDelProducto();
                        //validar que la cantidad de producos seleccionado no sea mayor al stock de la base de datos
                        if (cantidad <= cantidadProductoBBDD) {

                            subtotal = precioUnitario * cantidad;
                            totalpagar = subtotal + iva + Descuento;

                            //redondear decimal
                            subtotal = (double) Math.round(subtotal * 100) / 100;
                            iva = (double) Math.round(iva * 100) / 100;
                            Descuento = (double) Math.round(Descuento * 100) / 100;
                            totalpagar = (double) Math.round(totalpagar * 100) / 100;

                            //se crea nuevo producto
                            producto = new DetalleVenta(auxIdDetalle,
                                    1,//idCabecera
                                    idProducto,
                                    Nombre,
                                    Integer.parseInt(txt_cantidad.getText()),
                                    precioUnitario,
                                    subtotal,
                                    Descuento,
                                    iva,
                                    totalpagar,
                                    1//estado        
                            );
                            //añadir lista
                            ListaProductos.add(producto);
                            JOptionPane.showMessageDialog(null, "Producto Agregado");
                            auxIdDetalle++;
                            txt_cantidad.setText("");//Limpiar campo
                            //volver a cargar combo producto
                            this.CargarComboProductos();
                            this.CalcularTotalPagar();
                            txt_efectivo.setEnabled(true);
                            jButton_calcular_cambio.setEnabled(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "La cantidad supera el stock");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero (0), ni negativa");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa la cantidad de productos");
            }
        }
        //llamar al metodo
        this.listaTablaProductos();
    }//GEN-LAST:event_jButton_añadir_productoActionPerformed

    private void jButton_RegistrarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarventaActionPerformed

        CabeceraVenta cabeceraventa = new CabeceraVenta();
        DetalleVenta detalleventa = new DetalleVenta();
        Ctrl_RegistrarVenta controlventa = new Ctrl_RegistrarVenta();

        String fechaActual = "";
        Date date = new Date();
        fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);

        if (!jComboBox_cliente.getSelectedItem().equals("Seleccione cliente:")) {
            if (ListaProductos.size() > 0) {

                //metodo para obtener el id del cliente
                this.ObtenerIdCliente();
                //registrar cabecera
                cabeceraventa.setIdCabeceraVenta(0);
                cabeceraventa.setIdCliente(idCliente);
                cabeceraventa.setValorPagar(Double.parseDouble(txt_total_pagar.getText()));
                cabeceraventa.setFechaVenta(fechaActual);
                cabeceraventa.setEstado(1);

                if (controlventa.guardar(cabeceraventa)) {
                    JOptionPane.showMessageDialog(null, "!Venta Registrada¡");
                    
                    //Generar la factura de la venta
                    VentaPDF pdf = new VentaPDF();
                    pdf.DatosCliente(idCliente);
                    pdf.generarFacturaPDF();
                    
                    //guardar detalle
                    for (DetalleVenta elemento : ListaProductos) {
                        detalleventa.setIdDetalleVenta(0);
                        detalleventa.setIdCabeceraVenta(0);
                        detalleventa.setIdProducto(elemento.getIdProducto());
                        detalleventa.setCantidad(elemento.getCantidad());
                        detalleventa.setPrecioUnitario(elemento.getPrecioUnitario());
                        detalleventa.setSubtotal(elemento.getSubtotal());
                        detalleventa.setDescuento(elemento.getDescuento());
                        detalleventa.setIva(elemento.getIva());
                        detalleventa.setTotalpagar(elemento.getTotalpagar());
                        detalleventa.setEstado(1);

                        if (controlventa.guardarDetalle(detalleventa)) {
                            // System.out.println("Detalle de Venta Registrado");

                            txt_subtotal.setText("0.0");
                            txt_iva.setText("0.0");
                            txt_descuento.setText("0.0");
                            txt_total_pagar.setText("0.0");
                            txt_efectivo.setText("0.0");
                            txt_cambio.setText("0.0");
                            auxIdDetalle = 1;

                            this.CargarComboClientes();
                            this.RestarStockProductos(elemento.getIdProducto(), elemento.getCantidad());
                        } else {
                            JOptionPane.showMessageDialog(null, "!Error al guardar detalle de venta¡");
                        }
                    }
                    //vaciamos la lista
                    ListaProductos.clear();
                    listaTablaProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "!Error al guardar cabecera de venta¡");
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Seleccione un producto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Seleccione un cliente!");
        }

    }//GEN-LAST:event_jButton_RegistrarventaActionPerformed

    private void jButton_calcular_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcular_cambioActionPerformed

        if (!txt_efectivo.getText().isEmpty()) {
            //validamos que el usuario no ingrese otros caracteres no numericos 
            boolean validacion = validarDouble(txt_efectivo.getText());
            if (validacion == true) {
                // validar que el efectivo sea mayor cero
                double efc = Double.parseDouble(txt_efectivo.getText().trim());
                double top = Double.parseDouble(txt_total_pagar.getText().trim());

                if (efc < top) {
                    JOptionPane.showMessageDialog(null, "El dinero en efectivo no es suficiente");
                } else {
                    double cambio = (efc - top);
                    double cambi = (double) Math.round(cambio * 100d) / 100;
                    String camb = String.valueOf(cambi);
                    txt_cambio.setText(camb);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se adminten caracteres no numericos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese dinero en efectivo para calcular cambio");
        }

    }//GEN-LAST:event_jButton_calcular_cambioActionPerformed
    int idArratList = 0;
    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
        int fila_point = jTable_productos.rowAtPoint(evt.getPoint());
        int columna_point = 0;

        if (fila_point > -1) {
            idArratList = (int) modeloDatosproductos.getValueAt(fila_point, columna_point);
        }

        int opcion = JOptionPane.showConfirmDialog(null, "¿Eliminar producto?");
        //opciones de confir dialog  - (si = 0; no = 1; cancel = 2; close =-1)

        switch (opcion) {
            case 0://presione si 
                ListaProductos.remove(idArratList - 1);
                this.CalcularTotalPagar();
                this.listaTablaProductos();
                break;
            case 1://presione no 
                break;
            default://sea que presione cancel (2) o close (-1)
                break;
        }
    }//GEN-LAST:event_jTable_productosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Registrarventa;
    private javax.swing.JButton jButton_añadir_producto;
    private javax.swing.JButton jButton_busca_cliente;
    private javax.swing.JButton jButton_calcular_cambio;
    private javax.swing.JComboBox<String> jComboBox_cliente;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cliente_buscar;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_iva;
    private javax.swing.JTextField txt_subtotal;
    public static javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables

    //metodo para cargar los clientes en el JComboBox
    private void CargarComboClientes() {
        Connection cn = Conexion.conectar();
        String sql = "select * from t_clientes";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_cliente.removeAllItems();
            jComboBox_cliente.addItem("seleccione cliente:");
            while (rs.next()) {
                jComboBox_cliente.addItem(rs.getString("Nombre") + " " + rs.getString("Apellido"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar cliente , !" + e);
        }
    }

    //metodo para cargar los productos en el JComboBox
    private void CargarComboProductos() {
        Connection cn = Conexion.conectar();
        String sql = "select * from t_Productos";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_producto.removeAllItems();
            jComboBox_producto.addItem("seleccione producto:");
            while (rs.next()) {
                jComboBox_producto.addItem(rs.getString("Nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar productos , !" + e);
        }
    }

    //metodo para validar que el usuario no ingrese caracteres no numericos
    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //metodo para validar que el usuario no ingrese caracteres no numericos
    private boolean validarDouble(String valor) {
        try {
            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //metodo para mostrar los datos del producto seleccionado
    private void DatosDelProducto() {
        try {
            String sql = "select * from t_Productos where Nombre = '" + this.jComboBox_producto.getSelectedItem() + "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idProducto = rs.getInt("idProducto");
                Nombre = rs.getString("Nombre");
                cantidadProductoBBDD = rs.getInt("Cantidad");
                precioUnitario = rs.getDouble("precio");
                porcentajeIva = rs.getInt("porcentajeIva");
                this.CalcularIva(precioUnitario, porcentajeIva);//calcula y retorna el iva
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del producto, " + e);
        }
    }

    //metodo para calcular iva
    private double CalcularIva(double precio, int porcentajeIva) {
        int p_iva = porcentajeIva;

        switch (p_iva) {
            case 0:
                iva = 0.0;
                break;
            case 01:
                iva = 0.0;
                break;
            case 16:
                iva = (precio * cantidad);
                break;
            default:
                break;
        }
        return iva;
    }

    //metodo para calcular el total a pagar de todos los productos agregados 
    private void CalcularTotalPagar() {
        subtotalGeneral = 0;
        descuentoGeneral = 0;
        ivaGeneral = 0;
        totalPagarGeneral = 0;

        for (DetalleVenta elemento : ListaProductos) {
            subtotalGeneral += elemento.getSubtotal();
            descuentoGeneral += elemento.getDescuento();
            ivaGeneral += elemento.getIva();
            totalPagarGeneral += elemento.getTotalpagar();
        }
        //redondear decimales
        subtotalGeneral = (double) Math.round(subtotalGeneral * 100) / 100;
        ivaGeneral = (double) Math.round(ivaGeneral * 100) / 100;
        descuentoGeneral = (double) Math.round(descuentoGeneral * 100) / 100;
        totalPagarGeneral = (double) Math.round(totalPagarGeneral * 100) / 100;

        //enviar datos a la vista 
        txt_subtotal.setText(String.valueOf(subtotalGeneral));
        txt_iva.setText(String.valueOf(ivaGeneral));
        txt_descuento.setText(String.valueOf(descuentoGeneral));
        txt_total_pagar.setText(String.valueOf(totalPagarGeneral));

    }

    //metodo para obtener el id del cliente
    private void ObtenerIdCliente() {
        try {
            String sql = "select * from t_clientes where concat(Nombre,' ',Apellido) = '" + this.jComboBox_cliente.getSelectedItem() + "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idCliente = rs.getInt("idCliente");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener id del cliente, " + e);
        }
    }

    //metodo para restar la cantidad (stock) de los productos
    private void RestarStockProductos(int idProducto, int Cantidad) {
        int cantidadProdctosBaseDeDatos = 0;
        try {
            Connection cn = Conexion.conectar();
            String sql = "select idProducto, Cantidad from t_Productos where idProducto = '" + idProducto + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cantidadProdctosBaseDeDatos = rs.getInt("Cantidad");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al restar cantidad, " + e);
        }
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("update t_Productos set Cantidad=? where idProducto = '" + idProducto + "'");
            int cantidadNueva = cantidadProdctosBaseDeDatos - Cantidad;
            consulta.setInt(1, cantidadNueva);
            if(consulta.executeUpdate() > 0){
                System.out.println("Todo bien");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al restar cantidad 2, " + e);
        }
    }
}
