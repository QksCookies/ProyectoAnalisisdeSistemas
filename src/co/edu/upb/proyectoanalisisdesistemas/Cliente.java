package co.edu.upb.proyectoanalisisdesistemas;

public class Cliente {
	private String codigo;
    private String cedula;
    private String nombre;
    private String contrasena;
    private String telefono;
    private String correoElectronico;
	//bmirnjsdnvjsdfnbjdfnjbndfjbndfj
    //hbthrthrtjnrtjyrjyj
    public Cliente(String codigo, String cedula, String nombre, String contrasena, String telefono, String correoElectronico){
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.telefono= telefono;
        this.correoElectronico= correoElectronico;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public String getTelefono(){
    	return telefono;
    }
    
    public String getCorreoElectronico(){
    	return correoElectronico;
    }
}
