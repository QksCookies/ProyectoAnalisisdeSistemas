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

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}
