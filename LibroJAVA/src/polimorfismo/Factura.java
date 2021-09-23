package polimorfismo;

public class Factura implements PorPagar{
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	// constructor con cuatro argumentos 
	public Factura( String pieza, String descripcion, int cuenta, double precio ) {
		numeroPieza = pieza;
		descripcionPieza = descripcion;
		establecerCantidad( cuenta );              // valida y almecena 
		establecerPrecioPorArticulo( precio );     // valida y almacena el precio por articulo 
	} // fin del constructor de Factura con cuatro argumentos
	
	// establece el numero de pieza
	public void establecerNumeroPieza( String pieza ) {
		numeroPieza = pieza;
	} // fin del metodo establecerNumeroPieza
	
	// devuelve el numero de pieza
	public String obtenerNumeroPieza() {
		return numeroPieza;
	} // fin del metodo obtenerNumeroPieza
	
	// establece la descripcion
	public void establecerDescripcionPieza( String descripcion ) {
		descripcionPieza = descripcion;
	} // fin del metodo establecerDescripcionPieza
	
	// devuelve la descripcion 
	public String obtenerDescripcionPieza() {
		return descripcionPieza;
	} // fin del metodo obtenerDescripcionPieza
	
	// establece la cantidad 
	public void establecerCantidad( int cuenta ) {
		cantidad = ( cuenta < 0 ) ? 0 : cuenta;     // cantidad no puese ser negativa
	} // fin del metodo establecerCantidad
	
	// devuelve cantidad
	public int obtenerCantidad() {
		return cantidad;
	} // fin del metodo obtenerCantidad
	
	// establece el precio por articulo
	public void establecerPrecioPorArticulo( double precio ) {
		precioPorArticulo = ( precio < 0.0 ) ? 0.0 : precio;
	} // fin del metodo establecerPrecioPorArticulo
	
	// devuelve el precio por articulo
	public double obtenerPrecioPorArticulo() {
		return precioPorArticulo;
	} // fin del metodo obtenerPrecioPorArticulo 
	
	// devuelve la representacion String de un objeto Factura
	public String toString() {
		return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				"factura", "numero de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(),
				"cantidad", obtenerCantidad(), "precio por articulo", obtenerPrecioPorArticulo() );
	} // fin del metodo toString
	
	// metodo requerido para realizar el contrato con la interfaz PorPagar
	public double obtenerMontoPago() {
		return obtenerCantidad() * obtenerPrecioPorArticulo();     // calcula el costo total
	} // fin del metodo obtenerMontoPago
} // fin de la clase Factura
