package co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Factura {
	private Cliente cliente;
    private ArrayList<Producto> productos;
    private LocalDateTime fecha;
    private double subtotal;
    private double impuestos;
    private double total;

    public Factura(Cliente cliente, ArrayList<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = LocalDateTime.now();
        this.subtotal = 0;
        for (Producto producto : productos) {
            this.subtotal += producto.getPrecio();
        }
        this.impuestos = this.subtotal * 0.12; // impuesto del 12%
        this.total = this.subtotal + this.impuestos;
    }

    public void imprimirFactura() {
        System.out.println("Supermercado AGUAPOCHA");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Cédula: " + cliente.getCedula());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Fecha: " + fecha);
        System.out.println("------------------------------------");
        System.out.println("Productos comprados:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio());
        }
        System.out.println("------------------------------------");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Total: " + total);
    }
}
