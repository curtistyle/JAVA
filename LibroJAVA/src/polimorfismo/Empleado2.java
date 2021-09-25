package polimorfismo;

// La superclases abstracta Empleado2 implementa a PorPagar

public abstract class Empleado2 implements PorPagar {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	
	// constructor con tres argumentos
	public Empleado2( String nombre, String apellido, String nss ) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
	} // fin del constructor Empleado2 con tres argumentos
	
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
	} // Fin del metodo obtenerApellidoPaterno
	
	// establece el numero de seguro social
	public void establecerNumeroSeguroSocial( String nss ) {
		numeroSeguroSocial = nss;           // debe validar
	} // fin del metodo establecerNumeroSeguroSocial
	
	// devuelve el numero de seguro social
	public String obtenerNumeroSeguroSocial() {
		return numeroSeguroSocial;
	} // fin del metodo obtenerNumeroSeguroSocial
	
	// devuelve representacion String de un objeto Empleado
	public String toString() {
		return String.format( "%s %s\nnumero de seguro social: %s", 
				obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial() );
	} // fin del metodo toString
	
	// Nota: Aqui no implementamos el metodo obtenerMontoPago de PorPagar, asi que
	// esta clase debe declararse como abstract para evitar un error de compilacion.
} // fin de la clase abstracta Empleado


