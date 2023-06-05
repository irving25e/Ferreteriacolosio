package modelo;

public class Cliente {

    //Atributos
    private int idCliente;
    private String Nombre;
    private String Apellido;
    private String cedula;
    private String telefono;
    private String direccion;
    private int estado;

    //Constructor
    public Cliente() {
        this.idCliente = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.cedula = "";
        this.telefono = "";
        this.direccion = "";
        this.estado = 0;
    }

    //constructor sobrecargado
    public Cliente(int idCliente, String Nombre, String Apellido, String cedula, String telefono, String direccion, int estado) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }
    
     //metodos set and get 

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
