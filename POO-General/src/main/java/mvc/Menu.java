package mvc;

import mvc.view.AltaClienteGUI;

public class Menu {

    public  static void main(String [] args){

        AltaClienteGUI altaClienteGUI = new AltaClienteGUI();
        //Datos personal
        altaClienteGUI.setApellidoTxt("Pepe");
        altaClienteGUI.setNombreTxt("Franco");
        altaClienteGUI.setDniTxt("34324333");
        //domicilio
        altaClienteGUI.setCalleTxt("Rivadavia");
        altaClienteGUI.setTelfonoTxt("121212");
        altaClienteGUI.setNumeroTxt("1212");
        altaClienteGUI.setCodigoPostalTxt("1234");

        System.out.println("Vista - Datos de entrada al formulaio: " + altaClienteGUI.toString());
        altaClienteGUI.registrarCliente();
    }
}
