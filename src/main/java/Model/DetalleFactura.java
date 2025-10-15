package Model;

public class DetalleFactura {
    private Producto producto;
    private int cantidadComprada;

    public DetalleFactura(Producto producto, int cantidadComprada) {
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
    }

    public double getSubTotal() {
        return producto.getPrecioUnitario() * cantidadComprada;
    }

    public Producto getProducto() { return producto; }
    public int getCantidadComprada() { return cantidadComprada; }
}

