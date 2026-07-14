package herencia.uade;

public class Alumno extends  Persona{



    public Alumno(int legajo, String nombre, String apellido) {
        super(legajo, nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        String mensaje = " Mostrar datos del Alumno: Apellido: "  + this.apellido + " Nombre: " +
                this.nombre + " Legajo " + this.legajo;

        System.out.println(mensaje);
    }

    public String getMaterias(){
        return "Matematica, Lengua, Informatica";
    }


}
