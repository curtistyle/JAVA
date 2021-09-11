package herencia;

// La clase EmpleadoPorComision2 representa a un empleado por comision.

public class EmpleadoPorComision2 {
	protected String primerNombre;
	protected String apellidoPaterno;
	protected String numeroSeguroSocial;
	protected double ventasBrutas;       // ventas totales por semana
	protected double tarifaComision;     // porcentaje por comision
	
	// constructor con cinco argumentos
	public EmpleadoPorComision2( String nombre, String apellido, String nss, double ventas, double tarifa ) {
		// la llamada implicita al constructor del objeto ocurre aqui
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
		establecerVentasBrutas( ventas );     // valida y almacena las ventas brutas
		establecerTarifaComision( tarifa );   // valida y almacena la tarifa de comision
	}  // fin del constructor de EmpleadoPorComision2 con cinco argumentos
	
	// establece el primer nombre
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
	} // fin del metodo obtenerApellidoPaterno
	
	// establece el numero de seguro social
	public void establecerNumeroSeguroSocial( String nss ) {
		numeroSeguroSocial = nss;    // debe validar
	} // fin del metodo establecerNumeroSeguroSocial
	
	// devuelve el numero de seguro social
	public String obtenerNumeroSeguroSocial() {
		return numeroSeguroSocial;
	} // fin del metodo obtenerNumeroSeguroSocial
	
	// establece el monto de ventas brutas
	public void establecerVentasBrutas( double ventas ) {
		ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
	} // fin del metodo establecerVentasBrutas
	
	// devuelve el mento de ventas brutas
	public double obtenerVentasBrutas() {
		return ventasBrutas;
	} // fin del metodo obtenerVentasBrutas
	
	// establece la tarifa de comision
	public void establecerTarifaComision( double tarifa ) {
		tarifaComision = ( tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0;
	} // fin del metodo establecerTarifaComision
	
	// devuelve la tarifa de comision
	public double obtenerTarifaComision() {
		return tarifaComision;
	} // fin del metodo obtenerTarifaComision
	
	// calcula los ingresos
	public double ingresos() {
		return tarifaComision * ventasBrutas;
	} // fin del metodo ingresos
	
	// devuelve representacion String del objeto EmpleadoPorComision2
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
				"empleado por comision", primerNombre, apellidoPaterno,
				"numero de seguro social", numeroSeguroSocial,
				"ventas brutas", ventasBrutas,
				"tarifa de comision", tarifaComision );
	} // fin del metodo toString	
} // fin de la clase EmpleadoPorComision


