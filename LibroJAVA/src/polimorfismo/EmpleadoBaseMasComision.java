package polimorfismo;

// La clase EmpleadoBaseMasComision extiende EmpleadoPorComision

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	private double salarioBase;    // salario base por semana
	
	// constructor con seis argumentos
	public EmpleadoBaseMasComision( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ) {
		super( nombre, apellido, nss, ventas, tarifa );
		establecerSalarioBase( salario );     // valida y almacena el salario base
	}  // fin del constructor de EmpleadoBaseMasComision con seis argumentos
	
	// establece el salario base
	public void establecerSalarioBase( double salario ) {
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;   // positivo
	} // fin del metodo establecerSalarioBase
	
	// devuelve el salario base
	public double obtenerSalarioBase() {
		return salarioBase;
	} // fin del metodo obtenerSalarioBase

	// calcula los ingresos; sobrescribe el metodo ingresos en EmpleadoPorComision
	public double ingresos() {
		return obtenerSalarioBase() + super.ingresos();
	} // fin del metodo ingresos
	
	// devuelve representacion String de un objeto EmpleadoBaseMasComision
	public String toString() {
		return String.format( "%s %s; %s: $%,.2f", 
				"con salario base", super.toString(),
				"salario base", obtenerSalarioBase() );
	} // fin del metodo toString
} // fin de la clase EmpleadoBaseMasComision
