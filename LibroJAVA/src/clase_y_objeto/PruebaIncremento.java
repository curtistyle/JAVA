package clase_y_objeto;

import java.util.Iterator;

// variable final inicializada con el argumento de un constructor
public class PruebaIncremento {

	public static void main(String[] args) {
		Incremento valor = new Incremento( 5 );
		
		System.out.printf( "Antes de incrementar: %s \n\n", valor );
		
		for ( int i = 1; i <= 3; i++ ) {
			valor.sumarIncrementoAlTotal();
			System.out.printf( "Desoues de incrementar %d: %s\n", i, valor );
		} // fin de for
	} // fin de main
} // fin de clase pruebaIncremento
