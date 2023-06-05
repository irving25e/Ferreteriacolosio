package modelo;

public class proveedores {

    //Atributos
    private int idProveedor;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String telefono;
    private int idCategoria;
    private int estado;

    //Constructor
    public proveedores() {
        this.idProveedor = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Direccion = "";
        this.telefono = "";
        this.idCategoria = 0;
        this.estado = 0;
    }

    //Constructor sobrecargado
    public proveedores(int idProveedor, String Nombre, String Apellido, String Direccion, String telefono, int idCategoria, int estado) {
        this.idProveedor = idProveedor;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }

    //set and get
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
