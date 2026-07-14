package mvc.dto;

public class ClienteDTO {

    private String nombre;
    private String apellido;
    private  String telfono;
    private String dni;
    private String calle;
    private String numero;
    private String codigoPostal;

    public ClienteDTO(String nombre, String apellido, String telfono, String dno, String calle, String numero, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telfono = telfono;
        this.dni = dno;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
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

    public String getTelfono() {
        return telfono;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telfono='" + telfono + '\'' +
                ", dni='" + dni + '\'' +
                ", calle='" + calle + '\'' +
                ", numero='" + numero + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
