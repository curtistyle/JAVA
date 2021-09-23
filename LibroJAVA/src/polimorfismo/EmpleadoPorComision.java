package polimorfismo;



public class EmpleadoPorComision extends Empleado {
	private double ventasBrutas;    // ventas totales por semana
	private double tarifaComision;  // porcentaje de comision
	
	// constructor con cinco argumentos 
	public EmpleadoPorComision( String nombre, String apellido, String nss, double ventas, double tarifa ) {
		super( nombre, apellido, nss );
		establecerVentasBrutas( ventas );
		establecerTarifaComision( tarifa );
	} // fin del contructor EmpleadoPorComision con cinco argumentos
	
	// establece la tarifa de comision
	public void establecerTarifaComision( double tarifa ) {
		tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
	} // fin del metodo establecerTarifaComision
	
	// devuelve la tarifa de comision
	public double obtenerTarifaComision() {
		return tarifaComision;
	} // fin del metodo obtenerTarifaComision
	
	// establece el monto de ventas brutas
	public void establecerVentasBrutas( double ventas ) {
		ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
	} // fin del metodo establecerVentasBrutas
	
	// devuelve el monto de ventas brutas
	public double obtenerVentasBrutas() {
		return ventasBrutas;
	} // fin del metodo obtenerVentasBrutas
	
	// calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
	public double ingresos() {
		return obtenerTarifaComision() * obtenerVentasBrutas();
	} // fin del metodo ingresos 
	
	// devuelve representacion String de un objeto EmpleadoPorComision
	public String toString() {
		return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", 
				"empleado por comision", super.toString(), 
				"ventas brutas", obtenerVentasBrutas(), 
				"tarifa de comision", obtenerTarifaComision() );
	} // fin del metodo toString
} // fin de la clase EmpleadoPorComision
