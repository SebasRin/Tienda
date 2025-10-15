package Model;

public class ClienteFrecuente extends Cliente {
    private int puntosFidelidad;
    private static final double PORCENTAJE_DESCUENTO = 0.05;

    public ClienteFrecuente(String nombre, String cedula, String direccion, int puntosFidelidad) {
        super(nombre, cedula, direccion);
        this.puntosFidelidad = puntosFidelidad;
    }

    @Override
    public double calcularDescuento(double total) {
        return total * (1 - PORCENTAJE_DESCUENTO);
    }
}
