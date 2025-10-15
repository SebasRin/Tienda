package App;
import java.time.LocalDate;
import java.util.Arrays;
import Model.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Comercializadora UQ", "Calle 1 #2-3", "900123456");

        Cliente cliente = new ClienteFrecuente("Ana López", "123456789", "Carrera 5 #10-10", 200);
        empresa.registrarCliente(cliente);

        Producto p1 = new ProductoAlimenticio("A01", "Leche", 3000, LocalDate.of(2025, 12, 1));
        Producto p2 = new ProductoElectrodomestico("E01", "Licuadora", 150000, 12);

        empresa.registrarProducto(p1);
        empresa.registrarProducto(p2);

        DetalleFactura d1 = new DetalleFactura(p1, 2);
        DetalleFactura d2 = new DetalleFactura(p2, 1);

        Factura factura = empresa.generarFactura("F001", cliente, Arrays.asList(d1, d2));
        factura.mostrarFactura();
    }
}
