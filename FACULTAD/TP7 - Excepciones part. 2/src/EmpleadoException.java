package ej5;

public class EmpleadoException extends Exception{
	
	private Empleado empleado;

	public EmpleadoException(String message, Empleado empleado) {
		super(message);
		this.empleado = empleado;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	
}
