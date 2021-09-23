package polimorfismo;

// La clase EmpleadoPorHoras extiende a Empleado

public class EmpleadoPorHoras extends Empleado {
	private double sueldo;       // sueldo por hora
	private double horas;        // horas trabajadas por semana
	
	// constructor con cinco argumentos 
	public EmpleadoPorHoras( String nombre, String apellido, String nss, double sueldoPorHoras, double horasTrabajadas ) {
		super( nombre, apellido, nss );
		establecerSueldo( sueldoPorHoras );
		establecerHoras( horasTrabajadas );
	} // fin del contructor de EmpleadoPorHoras con cinco argumentos
	
	// establecer sueldo
	public void establecerSueldo( double sueldoPorHoras ) {
		sueldo = ( sueldoPorHoras < 0.0 ) ? 0.0 : sueldoPorHoras;
	} // fin del metodo establecerSueldo
	
	// devuelve el sueldo
	public double obtenerSueldo() {
		return sueldo;
	} // fin del metodo obtenerSueldo
	
	// establecer las horas trabajadas
	public void establecerHoras( double horasTrabajadas ) {
		horas = ( ( horasTrabajadas >= 0.0 ) && ( horasTrabajadas <= 168.0 ) ) ? horasTrabajadas : 0.0;
	} // fin del metodo establecerHoras
	
	// devuelve las horas trabajadas
	public double obtenerHoras() {
		return horas;
	} // fin del metodo obtenerHoras
	
	// calculo los ingresos; sobrescribe el metodo abstracto ingresos en Empleado
	public double ingresos() {
		if( obtenerHoras() <= 40 ) { // no hay tiempo extra
			return obtenerSueldo() * obtenerHoras();
		}else {
			return 40 * obtenerSueldo() + ( obtenerHoras() - 40 ) * obtenerSueldo() * 1.5;
		} 
	} // fin del metodo ingresos
	
	// devuelve representacion String de un objeto EmpleadoPorHoras
	public String toString() {
		return String.format( "empleado por horas: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), 
				"sueldo por hora", obtenerSueldo(), 
				"horas trabajadas", obtenerHoras() );
	} // fin del metodo toString
} // fin de la clase EmpleadoPorHoras
