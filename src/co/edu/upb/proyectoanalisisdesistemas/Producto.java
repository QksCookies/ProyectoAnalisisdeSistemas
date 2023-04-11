package co.edu.upb.proyectoanalisisdesistemas;

public class Producto {
	private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadDisponible;

    public Producto(String nombre, String descripcion, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
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
    
    public double calcularPrecioTotalProducto() {
        return precio * cantidadDisponible;
    }

    public String toString() {
        return "Producto: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: " + precio + "\nCantidad disponible: " + cantidadDisponible + "\n";
    }

	public void restarCantidad(int cantidadDisponible2) {
		
	}
}
