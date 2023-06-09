package co.edu.upb.proyectoanalisisdesistemas;

import java.util.List;

public class Proveedor {
	private String codigo;
	private String nombre1;
	private String contraseña;
    private String direccion1;
    private String telefono;
    private String correoElectronico;
    private List<Producto> productos;
    private GestionProductos gestionProductos;

    public Proveedor(String codigo, String nombre1, String contraseña, String direccion1, String telefono, String correoElectronico, List<Producto> productos) {
    	this.codigo= codigo;
    	this.nombre1 = nombre1;
    	this.contraseña= contraseña;
        this.direccion1 = direccion1;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.productos = productos;
        this.gestionProductos = new GestionProductos();
    }
    
    public Proveedor(String codigo1, String nombre11, String contraseña2, String direccion12, String telefono2,
			String correoElectronico2) {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto producto) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getNombre().equals(producto.getNombre())) {
                encontrado = true;
                p.setCantidadDisponible(p.getCantidadDisponible() + producto.getCantidadDisponible());
                System.out.println("Se ha agregado " + producto.getCantidadDisponible() + " unidades de " + producto.getNombre() + " al inventario.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el producto " + producto.getNombre() + ". Por favor, primero agregue el producto antes de aumentar el inventario.");
        }
    }
    
    public GestionProductos getGestionProductos() {
        return gestionProductos;
    }
}
