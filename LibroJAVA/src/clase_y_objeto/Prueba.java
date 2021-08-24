package clase_y_objeto;

public class Prueba {

	public static void main(String[] args) {
		
		// muestra que la cuenta es 0 antes de crear Empleados
		System.out.printf( "Empleados antes de instanciar: %d\n",
		Empleado3.obtenerCuenta() );
		// crea dos Empleados; la cuenta debe ser 2
		Empleado3 e1 = new Empleado3( "Susan", "Baker" );
		Empleado3 e2 = new Empleado3( "Bob", "Blue" );
		// muestra que la cuenta es 2 después de crear dos Empleados
		System.out.println( "\nEmpleados despues de instanciar: " );
		System.out.printf( "mediante e1.obtenerCuenta(): %d\n", e1.obtenerCuenta() );
		System.out.printf( "mediante e2.obtenerCuenta(): %d\n", e2.obtenerCuenta() );
		System.out.printf( "mediante Empleado.obtenerCuenta(): %d\n",
		Empleado3.obtenerCuenta() );
		// obtiene los nombres de los Empleados
		System.out.printf( "\nEmpleado 1: %s %s\nEmpleado 2: %s %s\n\n",
		e1.obtenerPrimerNombre(), e1.obtenerApellidoPaterno(),
		e2.obtenerPrimerNombre(), e2.obtenerApellidoPaterno() );
		// en este ejemplo, sólo hay una referencia a cada Empleado,
		// por lo que las siguientes dos instrucciones hacen que la JVM
		// marque a cada objeto Empleado para la recolección de basura
		e1 = null;
		e2 = null;
		System.gc(); // pide que la recolección de basura se realice ahora
		// muestra la cuenta de Empleados después de llamar al recolector de basura;
		// la cuenta a mostrar puede ser 0, 1 o 2 dependiendo de si el recolector de
		// basura se ejecuta de inmediato, y del número de objetos Empleado recolectados
		System.out.printf( "\nEmpleados despues de System.gc(): %d\n",
		Empleado3.obtenerCuenta() );

	}

}

class Empleado3{
	private String primerNombre;
	 private String apellidoPaterno;
	 private static int cuenta = 0; // número de objetos en memoria
	
	 // inicializa empleado, suma 1 a la variable static cuenta e
	 // imprime objeto String que indica que se llamó al constructor
	 public Empleado3( String nombre, String apellido )
	 {
		 primerNombre = nombre;
		 apellidoPaterno = apellido;
	
		 cuenta++; // incrementa la variable static cuenta de empleados
		 System.out.printf( "Constructor de Empleado: %s %s; cuenta = %d\n",
				 primerNombre, apellidoPaterno, cuenta );
	 } // fin de constructor de Empleado
	
	 // resta 1 a la variable static cuenta cuando el recolector
	 // de basura llama a finalize para borrar el objeto;
	 // confirma que se llamó a finalize
	 protected void finalize()
	 {
	 cuenta--; // decrementa la variable static cuenta de empleados
	 System.out.printf( "Finalizador de Empleado: %s %s; cuenta = %d\n",
	 primerNombre, apellidoPaterno, cuenta );
	 } // fin del método finalize
	
	 // obtiene el primer nombre
	 public String obtenerPrimerNombre()
	 {
	 return primerNombre;
	 } // fin del método obtenerPrimerNombre
	
	 // obtiene el apellido paterno
	 public String obtenerApellidoPaterno()
	 {
	 return apellidoPaterno;
	 } // fin del método obtenerApellidoPaterno
	
	 // método static para obtener el valor de la variable static cuenta
	 public static int obtenerCuenta()
	 {
	 return cuenta;
	 } // fin del método obtenerCuenta
}
