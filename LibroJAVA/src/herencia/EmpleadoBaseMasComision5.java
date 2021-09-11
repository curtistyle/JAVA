package herencia;

// Declaración de la clase EmpleadoBaseMasComision5

public class EmpleadoBaseMasComision5 extends EmpleadoPorComision4 {
	private double salarioBase; // salario base por semana
	
	// constructor con seis argumentos
	public EmpleadoBaseMasComision5( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ) {
		super( nombre, apellido, nss, ventas, tarifa );
		establecerSalarioBase( salario ); // valida y almacena salario base
		
		System.out.printf( "\nConstructor de EmpleadoBaseMasComision5:\n%s\n", this );
	} // fin del contructor de EmpleadoBaseMasComision5 con seis argumentos 
	
	// establece el salario base
	public void establecerSalarioBase( double salario ) {
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
	} // fin del metodo establecerSalarioBase
	
	// devuelve el salario base
	public double obtenerSalarioBase() {
		return salarioBase;
	} // fin del metodo obtenerSalarioBase
	
	// calcula los ingresos
	public double ingresos() {
		return obtenerSalarioBase() + super.ingresos();
	} // fin del metodo ingresos
	
	// devuelve representación String de EmpeladoBaseMasComision5
	public String toString() {
		return String.format( "%s %s\n%s: %.2f", "con sueldo base", 
				super.toString(), "sueldo base", obtenerSalarioBase() );
	} // fin del metodo toString
} // fin de la clase EmpleadoBaseMasComision5
