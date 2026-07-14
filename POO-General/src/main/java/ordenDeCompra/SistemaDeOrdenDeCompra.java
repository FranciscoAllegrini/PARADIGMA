package ordenDeCompra;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeOrdenDeCompra {

    private List<OrdenDeCompra> ordenesDeCompra;
    private List<Proveedor> proveedores;
    private List<Producto> productos;
    private List<Empleado> empleados;

    SistemaDeOrdenDeCompra(){
        this.empleados = new ArrayList<>();
        this.productos= new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.ordenesDeCompra = new ArrayList<>();
    }


    public void altaDeProducto(int codigoiProducto, String descripcion, float precioUnitario) {
        Producto producto = null;
        producto = buscarProducto(codigoiProducto);
        if(producto != null) {
            throw new IllegalArgumentException("El producto ya existe");
        }
        producto = new Producto(codigoiProducto, descripcion, precioUnitario);
        productos.add(producto);

    }

    public Producto buscarProducto(int codigoProducto) {
        for(int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getCodigo() == codigoProducto) {
                return productos.get(i);
            }
        }
        return null;
    }
}
