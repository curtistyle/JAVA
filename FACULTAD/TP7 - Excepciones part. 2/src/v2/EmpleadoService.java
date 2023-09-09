package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmpleadoService {

	private static List<Empleado> empleados = new ArrayList<Empleado>();

	public static Boolean agregar(Empleado empleado) {

		if (empleados.isEmpty()) {
			empleado.setLegajo(1);
		} else {
			// Esto sirve para obtener el último empleado agregado. Mayor numero de legajo
			Empleado ultimo = Collections.max(empleados, new Comparator<Empleado>() {

				@Override
				public int compare(Empleado e1, Empleado e2) {
					if (e1.getLegajo() < e2.getLegajo()) {
						return -1;
					}
					if (e1.getLegajo() > e2.getLegajo()) {
						return 1;
					}
					return 0;
				}

			});
			empleado.setLegajo(ultimo.getLegajo() + 1);
		}
		return empleados.add(empleado);
	}

	public static List<Empleado> getEmpleados() {
		return empleados;
	}

	public static List<Empleado> getEmpleadosMezcaldos() {
		Collections.shuffle(empleados);
		return empleados;
	}

	public static Double sueldoPromedio() {
		Double total = 0.0;
		for (Empleado empleado : empleados) {
			total = total + empleado.getSueldo();
		}
		return total / empleados.size();
	}

	public static Empleado mayorSueldo() {
		Iterator<Empleado> iterator = empleados.iterator();
		Empleado mayor = iterator.next();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			if (mayor.getSueldo() <= empleado.getSueldo()) {
				mayor = empleado;
			}
		}
		return mayor;
	}

	public static void eliminar(String nombre) {
		Iterator<Empleado> iterator = empleados.iterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			if (empleado.getNombre().equalsIgnoreCase(nombre)) {
				iterator.remove();
			}
		}
	}
}
