package relojes;


public class RelojSM {

    public String marca;
    public String modelo;
    public String nroSerie;
    public int bateria;
    public boolean resistenteAgua;

    public void mostrarHora() {
        System.out.println("mostrar hora ");
    }

    public void llamar(){

    }

    public boolean conectadoBluetooth(){

        return false;
    }
}
