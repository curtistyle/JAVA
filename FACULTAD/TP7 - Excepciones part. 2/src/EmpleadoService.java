package ej5;

public class EmpleadoService {

	// private static int cantidad;
	// private static Empleado[] empleados = new Empleado[cantidad];
	private static final int MAXIMO = 10;
	private static Empleado[] empleados = new Empleado[MAXIMO];
	private static int cantidad = 0;
	/*
	 * public static void setCantidad(int cant) { cantidad = cant; }
	 */

	public static Empleado[] getEmpleados() {
		return empleados;
	}

	public static Empleado agregar(Empleado empleado) throws EmpleadoException {

		if(empleado.getSueldo() <= 0) {
			throw new EmpleadoException("Sueldo invalido", empleado);
		}
		if(empleado.getNombre() == null) {
			throw new EmpleadoException("Nombre no puede ser nulo", empleado);
		}

		empleados[cantidad++] = empleado;
		return empleado;
	}

	// Devuelve el empleado de mayor sueldo
	public static Empleado mayorSueldo() {
		Empleado mayor = new Empleado();
		for (int i = 0; i < cantidad; i++) {
			if (mayor.getSueldo() <= empleados[i].getSueldo()) {
				mayor = empleados[i];
			}
		}
		return mayor;
	}

	// Devuelve el sueldo promedio
	public static Double sueldoPromedio() {
		Double total = 0.0;
		for (int i = 0; i < cantidad; i++) {
			total += empleados[i].getSueldo();
		}
		return total / cantidad;
	}

}
