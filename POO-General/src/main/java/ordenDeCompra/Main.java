package ordenDeCompra;

public class Main {

    public static void main(String [] args) {


        SistemaDeOrdenDeCompra sistema = new SistemaDeOrdenDeCompra();
        sistema.altaDeProducto(1, "Laptop", 1500.00f);
        System.out.println("Producto agregado: " + sistema.buscarProducto(1).getDescripcion());
        sistema.altaDeProducto(1, "Laptop", 1500.00f);
    }
}
