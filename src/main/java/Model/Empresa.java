package Model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String nit;
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Producto> listaProductos = new ArrayList<>();
    private List<Factura> listaFacturas = new ArrayList<>();

    public Empresa(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
    }

    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void registrarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public Factura generarFactura(String codigo, Cliente cliente, List<DetalleFactura> detalles) {
        Factura factura = new Factura(codigo, java.time.LocalDate.now(), cliente);
        for (DetalleFactura d : detalles) {
            factura.agregarDetalle(d);
        }
        listaFacturas.add(factura);
        return factura;
    }
}
