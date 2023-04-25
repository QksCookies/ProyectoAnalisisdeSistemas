package co.edu.upb.proyectoanalisisdesistemas;

public class Producto {
	private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadDisponible;
    private double descuento;

    public Producto(String nombre, String descripcion, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
	this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public double getDescuento() {
        return descuento;
    }
	
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
	
    public double aplicarDescuento() {
        double descuentoAplicado = precio * descuento;
        double precioConDescuento = precio - descuentoAplicado;
        return precioConDescuento;
    }	
	
    public double calcularPrecioTotalProducto() {
        return precio * cantidadDisponible;
    }

	public void restarCantidad(int cantidadDisponible2) {
		
	}
}
