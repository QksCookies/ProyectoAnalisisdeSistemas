package co.edu.upb.proyectoanalisisdesistemas;

class EmpleadoNoEncontradoException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmpleadoNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}

class ClienteNoEncontradoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClienteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

class CodigoIncorrectoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CodigoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}

class ProveedorNoEncontradoException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProveedorNoEncontradoException(String mensaje){
		super(mensaje);
	}
}