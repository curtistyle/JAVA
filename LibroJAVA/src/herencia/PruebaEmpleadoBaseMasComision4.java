package herencia;

// Prueba de la clase EmpleadoMasComision4

public class PruebaEmpleadoBaseMasComision4 {
	public static void main(String[] args) {
		// crea instancia de un objeto EmpleadoBaseMasComision4
		EmpleadoBaseMasComision4 empleado = new EmpleadoBaseMasComision4( "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
		
		// obtiene datos del empleado por comision con sueldo base
		System.out.println( "Información del empelado botenida por los metodos establecer: \n" );
		System.out.printf( "%s %s\n", "El primer nombre es", empleado.obtenerPrimerNombre() );
		System.out.printf( "%s %s\n", "El apellido es", empleado.obtenerApellidoPaterno() );
		System.out.printf( "%s %s\n", "El numero de seguro social es", empleado.obtenerNumeroSeguroSocial() );
		System.out.printf( "%s %.2f\n", "Las ventas brutas son", empleado.obtenerVentasBrutas() );
		System.out.printf( "%s %.2f\n", "La tarifa de comision", empleado.obtenerTarifaComision() );
		System.out.printf( "%s %.2f\n", "El salario base es", empleado.obtenerSalarioBase() );
		
		empleado.establecerSalarioBase( 1000 );  // establece el salario base
		
		System.out.printf( "\n%s:\n\n%s\n", "Informacion actualizada del empelado, obtenida por toString", empleado.toString() );
	}
}
