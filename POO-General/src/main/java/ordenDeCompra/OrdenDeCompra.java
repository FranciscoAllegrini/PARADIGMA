package ordenDeCompra;

import java.util.Date;
import java.util.List;

public class OrdenDeCompra {

    private int numeroOrden;
    private Date fechaDeAlta;
    private Proveedor proveedor;
    private List<DetalleDeOrdenDeCompra> detalle;
    private float impportetotal;

    public OrdenDeCompra(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public float calcularImporteTotal() {
        for(int i = 0; i < detalle.size(); i++) {
            impportetotal += detalle.get(i).calcularSubtotal();
        }
        return impportetotal;
    }

     public void agregarDetalle(DetalleDeOrdenDeCompra detalle) {
    }

     public void eliminarDetalle(DetalleDeOrdenDeCompra detalle) {
    }

     public void modificarDetalle(DetalleDeOrdenDeCompra detalle) {
    }
}
