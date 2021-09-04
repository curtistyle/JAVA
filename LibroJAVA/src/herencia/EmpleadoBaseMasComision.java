package herencia;

// La clase EmpleadoBaseMasComision representa a un empleado que recibe
// un salario base, además de la comision

public class EmpleadoBaseMasComision {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private double ventasBrutas;    // ventas totales por semana
	private double tarifaComision;  // porcentaje por comision
	private double salarioBase;     // salario base por semana
	
	// constructor con seis argumentos
	public EmpleadoBaseMasComision( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
		establecerVentasBrutas( ventas );   // valida y almacena las ventas brutas
		establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comision
		establecerSalarioBase( salario );   // valida y almacena el salario base
	} // fin del constructor de EmpleadoBaseMasComision con seis argumentos
	
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
	} // fin del metodo establcerApellidoPaterno
	
	// devuelve el apellido paterno
	public String obtenerApellidoPaterno() {
		return apellidoPaterno;
	} // fin del metodo obtenerApellidoPaterno
	
	// establece el numero de seguro social
	public void establecerNumeroSeguroSocial( String nss ) {
		numeroSeguroSocial = nss;
	} // fin del metodo establerNumeroSeguroSocial
	
	// devuelve el numero de seguro social
	public String obtenerNumeroSeguroSocial() {
		return numeroSeguroSocial;
	} // fin del metodo obtenerNumeroSeguroSocial
	
	// establece el monto de ventas brutas
	public void establecerVentasBrutas( double ventas ) {
		ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
	} // fin del metodo establecerVentasBrutas
	
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
	
	// establece el salario base
	public void establecerSalarioBase( double salario ) {
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
	} // fin del metodo establecerSalarioBase
	
	// devuelve el salario base
	public double obtenerSalarioBase() {
		return salarioBase;
	} // fin del metodo obtenerSalarioBase
	
	// calcula los ingresos 
	public double ingresos() {
		return salarioBase + ( tarifaComision * ventasBrutas );
	} // fin del metodo ingresos

	// devuelve la representacion String de EmpleadoBaseMasComision
	public String toString() {
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"empleado por comision con sueldo base", primerNombre, apellidoPaterno, 
				"numero de seguro social", numeroSeguroSocial, 
				"ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision,
				"salario base", salarioBase );
	} // fin del metodo toString
} // fin de la clase EmpleadoBaseMasComision
