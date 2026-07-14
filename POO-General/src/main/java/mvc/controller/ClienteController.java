package mvc.controller;

import mvc.dto.ClienteDTO;
import mvc.model.Cliente;
import mvc.model.Domicilio;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    private List<Cliente> clientes = null;

    private static ClienteController controller = null;

    private ClienteController() {
        this.clientes = new ArrayList<Cliente>();
    }

    public synchronized static ClienteController getInstance(){

        if(controller == null){
            controller = new ClienteController();
        }
        return controller;
    }



    public void altaCliente(ClienteDTO dto) {
        Cliente cliente = null;
        int dni = Integer.valueOf(dto.getDni());
        cliente = buscarCliente(dni);
        if(cliente != null) {
            throw new IllegalArgumentException("El cliente ya existe");
        }
        cliente = toModel(dto);
        System.out.println("Modelo - Mostrar dotos clientes: " + cliente.toString());
        clientes.add(cliente);
    }

    public List<ClienteDTO> retornarTodosLosCliente() {
        List<ClienteDTO>   dtos = new ArrayList<>();
        for(int i =0;i<clientes.size();i++){
            ClienteDTO dto = toDto(clientes.get(i)) ;
            dtos.add(dto);
        }
        return dtos;
    }

    public Cliente buscarCliente(int dni) {
        return null;
    }


        private static Cliente toModel(ClienteDTO dto){
        int dni = Integer.valueOf(dto.getDni());
        int numero = Integer.valueOf(dto.getNumero());
        Domicilio domicilio = new Domicilio(dto.getCalle(),numero,dto.getCodigoPostal());
        Cliente cliente = new Cliente(dto.getNombre(), dto.getApellido(),
                dto.getTelfono(), dni, domicilio);
        return cliente;
    }


    private static ClienteDTO toDto(Cliente model){
        String dni = String.valueOf(model.getDni());
        String numero = String.valueOf(model.getDomicilio().getNumero());
        ClienteDTO dto = new ClienteDTO(model.getNombre(), model.getApellido(),
                model.getTelfono(), dni, model.getDomicilio().getCalle(), numero, model.getDomicilio().getCodigoPostal());
        return dto;
    }
}
