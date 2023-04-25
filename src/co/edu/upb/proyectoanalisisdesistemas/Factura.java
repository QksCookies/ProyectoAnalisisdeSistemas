package co.edu.upb.proyectoanalisisydiseño;


	import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	    public boolean guardarDatosClienteEnArchivoTxt(Cliente cliente, LocalDateTime fecha,Producto producto, double subtotal, double impuestos, double total) {
			File archivo;
			FileWriter write;
			BufferedWriter bw;
			PrintWriter wr;
			archivo= new File ("C:\\Users\\USUARIO\\Music\\archivos txt\\factura.txt");
			
			
			if( !archivo.exists()) {
				try {
					archivo.createNewFile();
					write = new FileWriter(archivo,true);
					bw =new BufferedWriter(write);
					wr = new PrintWriter(bw);
					
					wr.println("---------------------------------------------------\n");
					wr.write("\n"+cliente.getNombre());
					wr.write("\n"+cliente.getCedula());
					wr.write("\n"+fecha);
					wr.write("\n"+productos);
					wr.write("\n"+subtotal);
					wr.write("\n"+impuestos);
					wr.write("\n"+total);
					wr.write("\n-----------------------------------------------------\n");
					wr.close();
					bw.close();
				}
				catch(IOException e) {
					System.out.println("Error");
				}
			}
			else {
				try {
					archivo.createNewFile();
					write = new FileWriter(archivo,true);
					bw =new BufferedWriter(write);
					wr = new PrintWriter(bw);
					
					wr.println("---------------------------------------------------\n");
					wr.write("\n"+cliente.getNombre());
					wr.write("\n"+cliente.getCedula());
					wr.write("\n"+fecha);
					wr.write("\n"+productos);
					wr.write("\n"+subtotal);
					wr.write("\n"+impuestos);
					wr.write("\n"+total);
					wr.write("\n-----------------------------------------------------\n");
					wr.close();
					bw.close();
				}
				catch(IOException e) {
					System.out.println("Error");
				}
			}
			
			return true;
			
		}
	}



