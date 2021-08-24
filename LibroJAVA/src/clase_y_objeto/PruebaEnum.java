package clase_y_objeto;

import java.util.EnumSet;

// Prueba del tipo enum Libro

public class PruebaEnum {

	public static void main(String[] args) {
		System.out.println( "Todos los libros:\n" );
		
		// imprime todos los libros en enum Libro
		for (Libro libro : Libro.values() ) {
			System.out.printf( "%-10s%-45s%s\n", libro, libro.obtenerTitulo(), libro.obtenerAnioCopiright() );
		}
		System.out.println( "\nMostrar un rango de constantes enum:\n");
		
		// imprime los primeros cuatros libros
		for (Libro libro : EnumSet.range( Libro.JHTP6, Libro.CPPHTP4 ) ) {
			System.out.printf( "%-10s%-45s%s\n", libro, libro.obtenerTitulo(), libro.obtenerAnioCopiright() );
		}		
	} //fin del main
} // fin de la clase PruebaEnum
