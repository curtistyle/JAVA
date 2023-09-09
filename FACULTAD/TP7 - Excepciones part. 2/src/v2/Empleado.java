package ejercicio5;

public class Empleado {
	
	private Integer legajo;
	private String nombre;
	private Integer sueldo;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, Integer sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	public String getSueldoString() {
		return "$" + sueldo;
	}

	@Override
	public String toString() {
		return this.getLegajo() + " - " + this.getNombre() + " - " + this.getSueldoString();
	}
}