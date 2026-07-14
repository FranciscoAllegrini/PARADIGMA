package herencia.uade;

public class Externo extends Persona{

    public Externo(int legajo, String nombre, String apellido) {
        super(legajo, nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        String mensaje = " Mostrar datos del Externo: Apellido: "  + this.apellido + " Nombre: " +
                this.nombre;
        System.out.println(mensaje);
    }

}
