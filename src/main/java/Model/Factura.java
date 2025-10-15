package Model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String codigo;
    private LocalDate fecha;
    private Cliente cliente;
    private List<DetalleFactura> listaDetalles = new ArrayList<>();

    public Factura(String codigo, LocalDate fecha, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        listaDetalles.add(detalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleFactura d : listaDetalles) {
            total += d.getSubTotal();
        }
        return cliente.calcularDescuento(total);
    }


    public void mostrarFactura() {
        System.out.println("Factura N°: " + codigo);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Detalles:");
        for (DetalleFactura d : listaDetalles) {
            System.out.println("- " + d.getProducto().getNombre() + " x" + d.getCantidadComprada() +
                    " = " + d.getSubTotal());
        }
        System.out.println("Total con descuento: " + calcularTotal());
    }
}


