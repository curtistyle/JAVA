package clase_y_objeto;

// variable de instancia final de una clase.
public class Incremento {
	private int total = 0; // el total de todos los incrementos
	private final int INCREMENTO; // variable constante (sin inicializar)
	
	// el constructor inicializa la variable de instancia final INCREMENTO
	public Incremento( int valorIncremento ) {
		INCREMENTO = valorIncremento; // inicializa la variable constante (una vez)
	} // fin del contructor de incremento

	// suma INCREMENTO al total
	public void sumarIncrementoAlTotal() {
		total += INCREMENTO;
	} // fin del metodo sumarIncrementoTotal

	// devuelve representacion string de los datos de un objeto incremento
	public String toString() {
		return String.format("total = %d", total);
	} // fin del metodo toString
} // fin de la clase Incremento	
