package clase_y_objeto;

// La declaracion de la clase Tiempo1 mantiene la hora en formato de 24 horas.
public class Tiempo1 {
	private int hora;     // 0 - 23
	private int minuto;   // 0 - 59
	private int segundo;  // 9 - 59
	
	/* establece un nuevo valor de tiempo, usando la hora universal; asegura que los datos sean consistentes,
	 * al establecer los valores inv�lidos a cero */
	
	public void establcerTiempo( int h, int m, int s ) {
		hora = ( ( h >= 0  && h < 24 ) ? h : 0 );
		minuto = ( ( m >= 0 && m < 60 ) ? m : 0 );
		segundo = ( ( s >= 0 && s < 60 ) ? s : 0 );
	} // fin del metodo establecerTiempo
	
	// convierte a objeto String en formato de hora universal (HH:MM:SS)
	public String aStringUniversal() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo );
	} // fin del m�todo aStringUniversal
	
	// convierte a objeto String en formato hora estandar (H:MM:SS AM o PM)
	public String toString() {
		return String.format( "%d:%02d:%02d %s",( ( hora == 0 || hora == 12 ) ? 12 : hora % 12 ), minuto, segundo, ( hora < 12 ? "AM" : "PM" ) );
	} //fin del m�todo toString
	
} // fin de la clase Tiempo1
