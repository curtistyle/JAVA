package clase_y_objeto;

// Variable static que se utiliza para mantener una cuenta del
// numero de objetos Empleado en la memoria

public class Empleado2 {
	private String primerNombre;
	private String apellidoPaterno;
	private static int cuenta = 0; // números de objetos en memoria
	
	// inicializa empleado, suma 1 a la variable static cuenta e imprime
	// objeto String que indica que se llamo al constructor
	public Empleado2( String nombre, String apellido ) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		
		cuenta++; //incrementa la variable static cuenta de empleados
		System.out.printf( "Constructor de Empleado: %s %s; cuenta = %d\n", primerNombre, apellidoPaterno, cuenta );
	} // fin de constructor de Empleado
	
	// resta 1 a la variable static cuenta cuando el recolector 
	// de basura llama a finalize para borrar el objeto;
	// confirma que se llamo a finalize	
	protected void finalize() {
		cuenta--;
		System.out.printf( "Finalizador de Empleado: %s %s; cuenta = %d\n", primerNombre, apellidoPaterno, cuenta );
	} // fin del metodo finalize

	// obtiene el primer nombre
	public String obtenerPrimerNombre() {
		return primerNombre;
	}
	
	// obtiene el apellido paterno
	public String obtenerApellidoPaterno() {
		return apellidoPaterno;
	}
	
	// metodo static para obtener el valor de la variable static cuenta
	public static int obtenerCuenta() {
		return cuenta;
	} // fin del metodo obtenerCuenta
} // fin la clase Empleado2
