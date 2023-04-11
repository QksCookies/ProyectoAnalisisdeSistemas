package co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mehin2 {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				List<Proveedor> proveedores = new ArrayList<>() ;{
				System.out.println("Ingrese cuantos proveedores quiere agregar:");
				int cantprovee = scanner.nextInt();
			   for (int i = 0; i < cantprovee; i++) {
			       System.out.println("Ingrese la información del proveedor " + (i+1));
			       System.out.print("Nombre: ");
			       String nombre1 = scanner.nextLine();

			       System.out.print("Dirección: ");
			       String direccion1 = scanner.nextLine();

			       System.out.print("Teléfono: ");
			       String telefono = scanner.nextLine();

			       System.out.print("Correo electrónico: ");
			       String correo = scanner.nextLine();

			       System.out.print("Código: ");
			       int codigo = scanner.nextInt();

			       scanner.nextLine();

			       List<Producto> productos = new ArrayList<Producto>();
			       boolean seguirAgregando = true;

			       while (seguirAgregando) {
			           System.out.println("Ingrese el nombre del producto: ");
			           String nombreProducto = scanner.nextLine();

			           System.out.println("Ingrese el precio del producto: ");
			           double precio = scanner.nextDouble();

			           scanner.nextLine();

			           productos.add(new Producto(nombreProducto, nombreProducto, precio, codigo));

			           System.out.println("¿Desea agregar otro producto? (s/n): ");
			           String respuesta = scanner.nextLine();

			           seguirAgregando = respuesta.equalsIgnoreCase("s");
			       }

			       proveedores.add(new Proveedor(nombre1, direccion1, telefono, correo, codigo, productos));
			   }

			   System.out.println("Los proveedores ingresados son: ");

			   for (Proveedor proveedor : proveedores) {
			       System.out.println("Nombre: " + proveedor.getNombre1());
			       System.out.println("Dirección: " + proveedor.getDireccion1());
			       System.out.println("Teléfono: " + proveedor.getTelefono());
			       System.out.println("Correo electrónico: " + proveedor.getCorreoElectronico());
			       System.out.println("Código: " + proveedor.getCodigo());

			       System.out.println("Productos: ");
			       for (Producto producto : proveedor.getProductos()) {
			           System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
			       }
			       System.out.println();}
			   }
	}
}
