package polimorfismo;
// Prueba la interfaz PorPagar

public class PruebaInterfazPorPagar {
	public static void main(String[] args) {
		// crea arreglos PorPagar con cuatro elementos
		PorPagar objetosPorPagar[] = new PorPagar[ 4 ];
		
		// llena el arreglo con objetos que implementan la interfaz PorPagar
		objetosPorPagar[ 0 ] = new Factura( "01234", "asiento", 2, 375.00 );
		objetosPorPagar[ 1 ] = new Factura( "56789", "llanta", 4, 79.95 );
		objetosPorPagar[ 2 ] = new EmpleadoAsalariado2( "John", "Smith", "111-11-1111", 800.00 );
		objetosPorPagar[ 3 ] = new EmpleadoAsalariado2( "Lisa", "barnes", "888-88-8888", 1200.00 );
		
		System.out.println( "Facturas y Empleados procesados en forma poliforma:\n" );
		
		// procesa en forma generica cada elemento en el arreglo objetosPorPagar
		for ( PorPagar porPagarActual : objetosPorPagar ) {
			// imprime porPagarActual y su monto de pago apropiado
			System.out.printf( "%s \n%s: $%,.2f\n\n",
					porPagarActual.toString(),
					"pago vencido", porPagarActual.obtenerMontoPago() );
		} // fin del for
	} // fin del main
} // fin de la clase PruebaInterfazPorPagar
