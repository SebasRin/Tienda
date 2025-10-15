package Model;

public class ProductoElectrodomestico extends Producto {
    private int garantiaMeses;

    public ProductoElectrodomestico(String codigo, String nombre, double precioUnitario, int garantiaMeses) {
        super(codigo, nombre, precioUnitario);
        this.garantiaMeses = garantiaMeses;
    }
}
