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
    public void eliminarCliente(String cedula) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente c = listaClientes.get(i);
            if (c.getCedula().equals(cedula)) {
                listaClientes.remove(i);
                break; // salir después de eliminar
            }
        }
    }
    public void actualizarCliente(Cliente clienteActualizado) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente c = listaClientes.get(i);
            if (c.getCedula().equals(clienteActualizado.getCedula())) {
                listaClientes.set(i, clienteActualizado);
                break;
            }
        }
    }
    public void registrarProducto(Producto producto) {
        listaProductos.add(producto);
    }
    public void eliminarProducto(String codigo) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getCodigo().equals(codigo)) {
                listaProductos.remove(i);
                break;
            }
        }
    }
    public Producto buscarProducto(String codigo) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
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
