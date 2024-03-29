package clase_y_objeto;

public class PruebaThis {
	public static void main(String[] args) {
		TiempoSimple tiempo = new TiempoSimple( 15, 30, 19);
		System.out.println(	tiempo.crearString() );
	} // fin de main
} // fin de la clase PruebaThis

// la clase TiempoSimple demuestra la referencia this
class TiempoSimple{
	private int hora;     // 0 - 23
	private int minuto;   // 0 - 59
	private int segundo;  // 0 - 59
	
	/* si el constructor utiliza nombres de p�rametros id�nticos a los nombres de las 
	 * variables de instancia, se requiere la referencia 'this' para diferencia unos nombres de otros */
	public TiempoSimple( int hora, int minuto, int segundo ) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	} // fin del constructor de TiempoSimple
	
	// usa la referencia 'this' explicita e implicita para llamar aStringUniversal
	public String crearString() {
		return String.format( "%24s: %s\n%24s: %s", 
			"this.aStringUniversal()", this.aStringUniversal(),  // llama al metodo de forma expl�cita
					"aStringUniversal()",aStringUniversal() );   // llama al metodo de forma impl�cita
	} //fin del metodo CrearString
	
	// convierte a String en formato hora universal (HH:MM:SS)
	public String aStringUniversal() {
		/* "this" no se requiere aqu� para acceder a las variables 
		 * de instancia, ya que el m�todo no tiene variables locales 
		 * con los mismos nombres que las variables de instancia */
		return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
	} // fin del m�todo aStringUniversal
} // fin de la clase TiempoSimple
