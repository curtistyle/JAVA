package clase_y_objeto;

// demostracion de miembros static
public class PruebaEmpleado2 {

	public static void main(String[] args) {
		// muestra que la cuenta es 0 antes de crear Empleado2
		System.out.printf( "Empleados antes de instanciar: %d\n", Empleado2.obtenerCuenta() );
		
		// crea dos Empleado2; la cuenta debe ser 2
		Empleado2 e1 = new Empleado2( "Susan", "Baker" );
		Empleado2 e2 = new Empleado2( "Bob", "Blue" );
		
		// muestra que la cuenta es 2 despues de crear dos Empleados 
		System.out.println( "\nEmpleados despues de instanciar: " );
		System.out.printf( "mediante e1.obtenerCuenta(): %d\n", e1.obtenerCuenta() );
		System.out.printf( "mediante e2.obtenerCuenta(): %d\n", e2.obtenerCuenta() );
		System.out.printf( "mediante Empleado2.obtenerCuenta(): %d\n", Empleado2.obtenerCuenta() );
		
		// obtiene los nombres de los Empleados
		System.out.printf( "\nEmpleado2 1: %s %s\nEmpleado2 2: %s %s\n\n", e1.obtenerPrimerNombre(), e1.obtenerApellidoPaterno(), e2.obtenerPrimerNombre(), e2.obtenerApellidoPaterno() );
		
		// en este ejemplo, solo hoy una referencia a cada Empleado,
		// por lo que las siguientes dos instrucciones hacen que la JVM
		// marque a cada objeto Empleado2 para la recoleccion de basura
		e1 = null;
		e2 = null;
		
		System.gc(); // pide que la recoleccion de basura se realice ahora
		
		// muestra la cuenta de Empledo2 despues de llamar al recolector de basura;
		// la cuenta a mostrar puede ser 0, 1, o 2 dependiendo de si el recolector de 
		// basura se ejecuta de inmediato, y del numero de objetos Empleado2 recolectados
		System.out.printf( "\nEmpleados despues de System.gc(): %d\n", Empleado2.obtenerCuenta() );
	} // fin de main
} // fin de la clase pruebaEmpleado
