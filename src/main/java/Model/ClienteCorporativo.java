package Model;

public class ClienteCorporativo extends Cliente {
    private String nit;
    private double porcentajeDescuento;

    public ClienteCorporativo(String nombre, String cedula, String direccion, String nit, double porcentajeDescuento) {
        super(nombre, cedula, direccion);
        this.nit = nit;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(double total) {
        return total * (1 - porcentajeDescuento);
    }
}
