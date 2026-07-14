package ordenDeCompra;

public class DetalleDeOrdenDeCompra {

    private Producto producto;
    private int cantidad;;
    private float subtotal = 0;

    public DetalleDeOrdenDeCompra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public float calcularSubtotal() {
        if(subtotal != 0) {
            return subtotal;
        }
        subtotal = producto.getPrecioUnitario() * cantidad;
        return subtotal;
    }

}
