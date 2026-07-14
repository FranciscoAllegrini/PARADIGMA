package mvc.model;

public class Cliente {

    private String nombre;
    private String apellido;
    private  String telfono;
    private int dni;
    private  Domicilio domicilio;


    public Cliente(String nombre, String apellido, String telfono, int dni, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telfono = telfono;
        this.dni = dni;
        this.domicilio = domicilio;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telfono='" + telfono + '\'' +
                ", dni=" + dni +
                ", domicilio=" + domicilio.toString() +
                '}';
    }
}
