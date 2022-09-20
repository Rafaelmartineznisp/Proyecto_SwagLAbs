package co.com.choucair.swaglabs.model;

public class Credencial {
    private String usuario;
    private String contrasenna;
    private String logueado;
    private String nombre;
    private String apellido;
    private String codigopostal;
    private  String verificarcompra;

    public String getVerificarcompra() {
        return verificarcompra;
    }

    public void setVerificarcompra(String verificarcompra) {
        this.verificarcompra = verificarcompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getLogueado() {
        return logueado;
    }

    public void setLogueado(String logueado) {
        this.logueado = logueado;
    }

}
