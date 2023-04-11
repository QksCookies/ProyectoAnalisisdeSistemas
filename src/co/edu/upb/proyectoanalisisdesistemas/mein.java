package co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class mein {

	public static void main(String[] args) {

		// Empleados existentes
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        //listaEmpleados.add(new Empleado("Juan", "Calle 10 # 20-30", 1234567, "juan@gmail.com", "Gerente", new Date()));
        //listaEmpleados.add(new Empleado("Maria", "Calle 30 # 40-50", 2345678, "maria@gmail.com", "Asistente", new Date()));

        try (// Entrada del usuario para agregar empleados
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("¿Cuántos empleados deseas agregar?: ");
			int numEmpleados = scanner.nextInt();
			scanner.nextLine(); // Consume la línea vacía después de la entrada de números

			// Agregar empleados a la lista
			for (int i = 0; i < numEmpleados; i++) {
			    System.out.println("Empleado #" + (i + 1) + ":");
			    System.out.print("Nombre: ");
			    String nombre = scanner.nextLine();
			    System.out.print("Dirección: ");
			    String direccion = scanner.nextLine();
			    System.out.print("Teléfono: ");
			    int telefono = scanner.nextInt();
			    System.out.print("Correo electrónico: ");
			    String correoElectronico = scanner.nextLine();
			    System.out.print("Cargo: ");
			    String cargo = scanner.nextLine();
			    System.out.print("Fecha de contratación (en formato dd/mm/yyyy): ");
			    String fechaContratacionStr = scanner.nextLine();
			    @SuppressWarnings("deprecation")
				Date fechaContratacion = new Date(fechaContratacionStr);
			 //   listaEmpleados.add(new Empleado(nombre, direccion, telefono, correoElectronico, cargo, fechaContratacion));
			}
		}
        // Mostrar los empleados existentes y los nuevos agregados
        System.out.println("\nLista de empleados:");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.getNombre() + " - " + empleado.getCargo() + " - " + empleado.getFechaContratacion());
        }
    }
}
