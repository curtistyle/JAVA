package herencia;

// La clase EmpleadoPorComision4 representa a un empleado por comision

public class EmpleadoPorComision4 {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private double ventasBrutas;     // ventas totales por semana
	private double tarifaComision;   // porcentaje de comision
	
	// constructor con cinco argumentos 
	public EmpleadoPorComision4( String nombre, String apellido, String nss, double ventas, double tarifa ) {
		// la llamada implicita al constructor de Object ocurre aqui
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
		establecerVentasBrutas( ventas );
		establecerTarifaComision( tarifa );
	
		System.out.printf( "\nConstructor de EmpleadoPorComision4:\n%s\n", this );
	} // fin del constructor de EmpleadoPorComision4 con cinco argumentos
	
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
	
	// estable el numero de seguro social
	public void estableceNumeroSeguroSocial( String nss ) {
		numeroSeguroSocial = nss;  // debe validar
	} // fin del metodo establecerNumeroSeguroSocial
	
	// devuelve el numero de seguro social
	public String obtenerNumeroSeguroSocial() {
		return numeroSeguroSocial;
	} // fin del metodo obtenerNumeroSeguroSocial
	
	// establece el monto de ventas brutas
	public void establecerVentasBrutas( double ventas ) {
		ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
	}  // fin del metodo establecerVentasBrutas
	
	// devuelve el monto de ventas brutas
	public double obtenerVentasBrutas() {
		return ventasBrutas;
	} // fin del metodo obtenerVentasBrutas
	
	// establece la tarifa de comision
	public void establecerTarifaComision( double tarifa ) {
		tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
	} // fin del metodo establecerTarifaComision
	
	// devuelve la tarifa de comision
	public double obtenerTarifaComision() {
		return tarifaComision;
	} // fin del metodo obtenerTarifaComision
	
	// calculo los ingresos 
	public double ingresos() {
		return obtenerTarifaComision() * obtenerVentasBrutas();
	} // fin del metodo ingresos

	// devuelve representación String del objeto EmpleadoPorComision4
	public String toString() {
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"empleado por comision", obtenerPrimerNombre(), obtenerApellidoPaterno(), 
				"numero de seguro social", obtenerNumeroSeguroSocial(), 
				"ventas brutas", obtenerVentasBrutas(), 
				"tarifa de comision", obtenerTarifaComision() );
	} // fin del metodo toString
} // fin de la clase EmpeladoPorComision4
