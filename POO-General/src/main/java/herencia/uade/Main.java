package herencia.uade;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static  void  main(String [] args){

        List<Persona> personal = new ArrayList<>();
        Alumno alumno = new Alumno(1212,"Juan", "Pepe");
        //alumno.mostrarDatos();;
        personal.add(alumno);

        Persona docente = new Docente(2213,"Pedro", "Aznar");
        //docente.mostrarDatos();;
        personal.add(docente);

        Persona externo = new Externo(3234,"Maria", "Gomez");
        //externo.mostrarDatos();;
        personal.add(externo);

        for(Persona p : personal){
            p.mostrarDatos();
            if(p instanceof Alumno){
                Alumno a = (Alumno) p;
                a.getMaterias();
            }
        }
        //Persona persona = new Persona(0,"Persona", "Persona");
        //persona.mostrarDatos();

    }
}
