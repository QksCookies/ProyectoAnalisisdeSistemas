package co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;

public class GestionEmpleados {
	private ArrayList<Empleado> empleados;
	
	public GestionEmpleados() {
		this.empleados=new ArrayList<>();
	}
	
	public void agregarEmpleado(Empleado empleado) {
        empleados.addAll(empleados);
    }

    public boolean eliminarEmpleado(int codigo) {
        for (Empleado empleado : empleados) {
            if (empleado.getCodigo() == codigo) {
                empleados.remove(empleado);
                return true;
            }
        }
        return false;
    }

    public Empleado buscarEmpleado(int codigo) {
        for (Empleado empleado : empleados){
           if (empleado.getCodigo() == codigo) {
                return empleado;
            }
        }
        return null;
    }
    
    @SuppressWarnings("null")
	public Empleado iniciarSesion(String nombre, int codigo) throws EmpleadoNoEncontradoException, CodigoIncorrectoException{
        Empleado empleado = buscarEmpleado(codigo);
        if (empleado != null) {
        	throw new EmpleadoNoEncontradoException("El empleado con el código " + codigo + " no está registrado en el sistema.");
        } else if(empleado.getCodigo()!= codigo){
        	throw new CodigoIncorrectoException("El código ingresado no coincide con el del empleado con código " + codigo);
        }else {
        	return empleado;
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}
