package modelo;

public class DetalleVenta {

    //Atributos
    private int idDetalleVenta;
    private int idCabeceraVenta;
    private int idProducto;
    //esta de mas 
    private String Nombre;
    private int Cantidad;
    private double precioUnitario;
    private double subtotal;
    private double Descuento;
    private double iva;
    private double totalpagar;
    private int estado;

    //constructor
    public DetalleVenta() {
        this.idDetalleVenta = 0;
        this.idCabeceraVenta = 0;
        this.idProducto = 0;
        this.Nombre = "";
        this.Cantidad = 0;
        this.precioUnitario = 0.0;
        this.subtotal = 0.0;
        this.Descuento = 0.0;
        this.iva = 0.0;
        this.totalpagar = 0.0;
        this.estado = 0;
    }

    //constructor sobrecargado
    public DetalleVenta(int idDetalleVenta, int idCabeceraVenta, int idProducto, String Nombre, int Cantidad, double precioUnitario, double subtotal, double Descuento, double iva, double totalpagar, int estado) {
        this.idDetalleVenta = idDetalleVenta;
        this.idCabeceraVenta = idCabeceraVenta;
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.Descuento = Descuento;
        this.iva = iva;
        this.totalpagar = totalpagar;
        this.estado = estado;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdCabeceraVenta() {
        return idCabeceraVenta;
    }

    public void setIdCabeceraVenta(int idCabeceraVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalpagar() {
        return totalpagar;
    }

    public void setTotalpagar(double totalpagar) {
        this.totalpagar = totalpagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    //toString

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", idCabeceraVenta=" + idCabeceraVenta + ", idProducto=" + idProducto + ", Nombre=" + Nombre + ", Cantidad=" + Cantidad + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + ", Descuento=" + Descuento + ", iva=" + iva + ", totalpagar=" + totalpagar + ", estado=" + estado + '}';
    }
}
