package herencia;

//La clase EmpleadoPorComision representa a un empleado por comision

public class EmpleadoPorComision extends Object {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private double ventasBrutas;     // ventas semanales totales
	private double tarifaComision;   // porcentaje de comison
	
	// constructor con cinco argumentos
	public EmpleadoPorComision( String nombre, String apellido, String nss, double ventas, double tarifa ) {
		// la llamada implicita al constructor ocurre aqui
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
		establecerVentasBrutas( ventas );   // valida y almacena las ventas brutas
		establecerTarifaComision( tarifa );  // valida y almacena la tarifa de comision
	} // fin del contructor de EmpleadoPorComision con cinco argumentos.
	
	// establecer el primer nombre
	public void establecerPrimerNombre( String nombre ) {
		primerNombre = nombre;
	} // fin del metodo establecerPrimerNombre
	
	// devuelve el primer nombre
	public String obtenerPrimerNombre() {
		return primerNombre;
	} // fin del metodo obtenerPrimerNombre
	
	// establece el apellido paterno
	public void establecerApellidoPaterno( String apellido ) {
		apellidoPaterno = apellido;
	} // fin del metodo establecerApellidoPaterno
	
	// devuelve el apellido paterno
	public String obtenerApellidoPaterno() {
		return apellidoPaterno;
	} // fin del metodo obtenerApellidPaterno
	
	// esteblece el numero de seguro social
	public void establecerNumeroSeguroSocial( String nss ) {
		numeroSeguroSocial = nss;
	} // fin del metodo establecerNumeroSeguroSocial
	
	// devuelve el numero de seguro social
	public String obtenerNumeroSeguroSocial() {
		return numeroSeguroSocial;
	} // fin del metodo obtenerNumeroSeguroSocial
	
	// establece el monto de ventas totales del empleado por comision
	public void establecerVentasBrutas( double ventas) {
		ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
	} // fin del metodo establecerVentasBrutas
	
	// devuelve el monto de ventas totales del empleado por comision
	public double obtenerVentasBrutas() {
		return ventasBrutas;
	} // fin del metodo obtenerVentasBrutas
	
	// establece la tarifa del empelado por comision
	public void establecerTarifaComision( double tarifa) {
		tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0; 
	} // fin del metodo establicerTarifaComision
	
	// devuelve la tarifa del empelado por comision
	public double obtenerTarifaComision() {
		return tarifaComision;
	} // fin del metodo obtenerTarifaComision
	
	// calculo el salario del empleado por comision
	public double ingresos() {
		return tarifaComision * ventasBrutas;
	} // fin del metodo ingresos
	
	// devuelve representacion String del objeto EmpleadoPorComision
	public String toString() {
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "empleado por comision", primerNombre, apellidoPaterno, 
				"numero de seguro social", numeroSeguroSocial, "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision );
	} // fin del metodo toString
}	
