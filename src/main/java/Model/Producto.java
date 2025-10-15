package Model;

public class Producto {
    protected String codigo;
    protected String nombre;
    protected double precioUnitario;

    public Producto(String codigo, String nombre, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
