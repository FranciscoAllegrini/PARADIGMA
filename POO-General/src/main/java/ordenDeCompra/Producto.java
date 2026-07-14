package ordenDeCompra;

public class Producto {

    private int codigo;
    private String descripcion;
    private float precioUnitario;

    public Producto(int codigo,  String descripcion, float precioUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCodigo() {
        return codigo;
    }
}
