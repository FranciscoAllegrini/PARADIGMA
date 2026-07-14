package herencia.uade;

public abstract class Persona {

    protected int legajo;

    protected String nombre;

    protected String apellido;


    public Persona(int legajo, String nombre, String apellido){
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public abstract void mostrarDatos() ;
}
