package mvc.view;

import mvc.controller.ClienteController;
import mvc.dto.ClienteDTO;

public class AltaClienteGUI {

    private String nombreTxt;
    private String apellidoTxt;
    private  String telfonoTxt;
    private String dniTxt;
    private String calleTxt;
    private String numeroTxt;
    private String codigoPostalTxt;

    private String nombreLbl = " Nombre: ";
    private String apellidoLbl=" Apellido: ";
    private  String telfonoLbl = " Telefono : ";
    private String dniLbl = " D.N.I : ";
    private String calleLbl = " Calle : ";
    private String numeroLbl = " Numero de unidad : ";
    private String codigoPostaLbl = " C.P : " ;

    ClienteController controller = ClienteController.getInstance();


    public void registrarCliente(){

        ClienteDTO clienteDTO = new ClienteDTO(this.getNombreTxt(),this.getApellidoTxt(),
                this.getTelfonoTxt(), this.getDniTxt(),this.getCalleTxt(),this.getNumeroTxt(),this.getCodigoPostalTxt());
        System.out.println("Controlador - Mostrar datos de dto: " + clienteDTO.toString());
        this.controller.altaCliente(clienteDTO);

    }

    public void setNombreTxt(String nombreTxt) {
        this.nombreTxt = nombreTxt;
    }

    public void setApellidoTxt(String apellidoTxt) {
        this.apellidoTxt = apellidoTxt;
    }

    public void setTelfonoTxt(String telfonoTxt) {
        this.telfonoTxt = telfonoTxt;
    }

    public void setDniTxt(String dniTxt) {
        this.dniTxt = dniTxt;
    }

    public void setCalleTxt(String calleTxt) {
        this.calleTxt = calleTxt;
    }

    public void setNumeroTxt(String numeroTxt) {
        this.numeroTxt = numeroTxt;
    }

    public void setCodigoPostalTxt(String codigoPostalTxt) {
        this.codigoPostalTxt = codigoPostalTxt;
    }

    public void setNombreLbl(String nombreLbl) {
        this.nombreLbl = nombreLbl;
    }

    public void setApellidoLbl(String apellidoLbl) {
        this.apellidoLbl = apellidoLbl;
    }

    public void setTelfonoLbl(String telfonoLbl) {
        this.telfonoLbl = telfonoLbl;
    }

    public void setDniLbl(String dniLbl) {
        this.dniLbl = dniLbl;
    }

    public void setCalleLbl(String calleLbl) {
        this.calleLbl = calleLbl;
    }

    public void setNumeroLbl(String numeroLbl) {
        this.numeroLbl = numeroLbl;
    }

    public void setCodigoPostaLbl(String codigoPostaLbl) {
        this.codigoPostaLbl = codigoPostaLbl;
    }

    public void setController(ClienteController controller) {
        this.controller = controller;
    }

    public String getNombreTxt() {
        return nombreTxt;
    }

    public String getApellidoTxt() {
        return apellidoTxt;
    }

    public String getTelfonoTxt() {
        return telfonoTxt;
    }

    public String getDniTxt() {
        return dniTxt;
    }

    public String getCalleTxt() {
        return calleTxt;
    }

    public String getNumeroTxt() {
        return numeroTxt;
    }

    public String getCodigoPostalTxt() {
        return codigoPostalTxt;
    }

    public String getNombreLbl() {
        return nombreLbl;
    }

    public String getApellidoLbl() {
        return apellidoLbl;
    }

    public String getTelfonoLbl() {
        return telfonoLbl;
    }

    public String getDniLbl() {
        return dniLbl;
    }

    public String getCalleLbl() {
        return calleLbl;
    }

    public String getNumeroLbl() {
        return numeroLbl;
    }

    public String getCodigoPostaLbl() {
        return codigoPostaLbl;
    }

    public ClienteController getController() {
        return controller;
    }

    @Override
    public String toString() {
        return "AltaClienteGUI{" +
                "nombreTxt='" + nombreTxt + '\'' +
                ", apellidoTxt='" + apellidoTxt + '\'' +
                ", telfonoTxt='" + telfonoTxt + '\'' +
                ", dniTxt='" + dniTxt + '\'' +
                ", calleTxt='" + calleTxt + '\'' +
                ", numeroTxt='" + numeroTxt + '\'' +
                ", codigoPostalTxt='" + codigoPostalTxt + '\'' +
                ", nombreLbl='" + nombreLbl + '\'' +
                ", apellidoLbl='" + apellidoLbl + '\'' +
                ", telfonoLbl='" + telfonoLbl + '\'' +
                ", dniLbl='" + dniLbl + '\'' +
                ", calleLbl='" + calleLbl + '\'' +
                ", numeroLbl='" + numeroLbl + '\'' +
                ", codigoPostaLbl='" + codigoPostaLbl + '\'' +
                ", controller=" + controller +
                '}';
    }
}
