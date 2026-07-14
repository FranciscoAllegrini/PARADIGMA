package herencia.uade;

public class Docente extends Persona{


    public Docente(int legajo, String nombre, String apellido) {
        super(legajo, nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        String mensaje = " Mostrar datos del Docente: Apellido: "  + this.apellido + " Nombre: " +
                this.nombre + " Legajo " + this.legajo;

        System.out.println(mensaje);
    }


}
