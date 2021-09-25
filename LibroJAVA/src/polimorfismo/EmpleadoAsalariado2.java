package polimorfismo;

// La clase EmpleadoAsalariado2 extiende a Empleado2, que implementa PorPagar

public class EmpleadoAsalariado2 extends Empleado2 {
	private double salarioSemanal;
	
	// constructor con cuatro argumentos 
	public EmpleadoAsalariado2( String nombre, String apellido, String nss, double salario ) {
		super( nombre, apellido, nss);
		establecerSalarioSemanal( salario );
	} // fin del constructor de EmpleadoAsalariado2 con cuatro argumentos
	
	// establece el salario
	public void establecerSalarioSemanal( double salario ) {
		salarioSemanal = ( salario < 0.0 ) ? 0.0 : salario;
	} // fin del metodo establecerSalarioSemanal
	
	// devuelve el salario
	public double obtenerSalarioSemanal() {
		return salarioSemanal;
	} // fin del metodo obtenerSalarioSemanal
	
	// calcula los ingresos; implementa el metodo de la interfaz PorPagar
	// que era abstracto en la superclase Empleado2
	public double obtenerMontoPago() {
		return obtenerSalarioSemanal();
	} // fin del metodo obtenerMontoPago
	
	// devuelve representacion String de un objeto EmpleadoAsalariado2
	public String toString() {
		return String.format( "empleado asalariado: %s\n%s: $%,.2f",
				super.toString(), "salario semanal", obtenerSalarioSemanal() );
	} // fin del metodo toString
} // fin de la clase EmpleadoAsalariado2


