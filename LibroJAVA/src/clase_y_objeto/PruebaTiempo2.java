package clase_y_objeto;

// Uso de constructores sobrecargados para inicializar objetos Tiempo2

public class PruebaTiempo2 {
	public static void main(String[] args) {
		Tiempo2 t1 = new Tiempo2();			     // 00:00:00
		Tiempo2 t2 = new Tiempo2( 2 );           // 02:00:00
		Tiempo2 t3 = new Tiempo2( 21, 34 );		 // 21:34:00
		Tiempo2 t4 = new Tiempo2( 12, 25, 42 );  // 12:25:42
		Tiempo2 t5 = new Tiempo2( 27, 74, 99 );  // 00:00:00
		Tiempo2 t6 = new Tiempo2( t4 );          // 12:25:42
		
		System.out.println( "Se construyo con: " );
		
		System.out.println( "t1: todos los argumentos predeterminados" );
		System.out.printf( "   %s\n", t1.aStringUniversal() );
		System.out.printf( "   %s\n", t1.toString() );
		
		System.out.println( "t2: se especifico hora; <minuto y segundo predeterminados>" );
		System.out.printf( "   %s\n", t2.aStringUniversal() );
		System.out.printf( "   %s\n", t2.toString() );
		
		System.out.println("t3: se especifico hora y minuto; <segundo predeterminado>" );
		System.out.printf( "   %s\n", t3.aStringUniversal() );
		System.out.printf( "   %s\n", t3.toString() );
		
		System.out.println( "t4: se especificaron hora, minuto y segundo" );
		System.out.printf( "   %s\n", t4.aStringUniversal() );
		System.out.printf( "   %s\n", t4.toString() );
		
		System.out.println( "t5: se especificaron todos los valores invalidos" );
		System.out.printf( "   %s\n", t5.aStringUniversal() );
		System.out.printf( "   %s\n", t5.toString() );
		
		System.out.println( "t6: se especifico el objeto 4 de Tiempo2" );
		System.out.printf( "   %s\n", t6.aStringUniversal() );
		System.out.printf( "   %s\n", t6.toString() );
		
		
		
	}

}
