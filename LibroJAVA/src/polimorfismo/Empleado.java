package polimorfismo;

// La superclase abstracta Empleado

public abstract class Empleado {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	
	// constructor con tres argumentos
	public Empleado( String nombre, String apellido, String nss ) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
	} // fin del constructor de Empleado con tres argumentos
	
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
	
	// establecer numero de seguro social
	public void establecerNumeroSeguroSocial( String nss ) {
		numeroSeguroSocial = nss;
	} // fin del metodo establecerNumeroSeguroSocial
	
	// devuelve el numero de seguro social
	public String obtenerNumeroSeguroSocial() {
		return numeroSeguroSocial;
	} // fin del metodo obtenerNumeroSeguroSocial
	
	// devuelve representacion String de un objeto Empleado
	public String toString() {
		return String.format( "%s %s\nnumero de seguro social: %s", 
				obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial() );
	} // find el metodo toString
	
	// metodo abstracto sobrescrito por las subclases
	public abstract double ingresos(); // aqui no hay implementacion 
} // fin de la clase abstracta Empleado
