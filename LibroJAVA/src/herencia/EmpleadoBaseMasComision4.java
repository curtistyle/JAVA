package herencia;

// La clase EmpleadoBaseMasComision4 hereda de EmpleadoMasComision3 y
// accede a los datos privates de EmpleadoPorComision3 a travez de los
// metodos public de EmpleadoPorComision3.

public class EmpleadoBaseMasComision4 extends EmpleadoPorComision3{
	private double salarioBase;  // salario base por semana
	
	// constructor con seis argumentos 
	public EmpleadoBaseMasComision4( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ) {
		super( nombre, apellido, nss, ventas, tarifa );
		establecerSalarioBase( salario );   // valida y almacena el salario base
	} // fin del contructor de empeladoBaseMasComision4 
	
	// establece el salario base
	public void establecerSalarioBase( double salario ) {
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
	} // fin del metodo establecerSalarioBase
	
	// devuelve el salario base
	public double obtenerSalarioBase() {
		return salarioBase;
	} // fin del metodoObtenerSalarioBase
	
	// calcula el salario base
	public double ingreso() {
		return obtenerSalarioBase() + super.ingresos();
	} // fin del metodo ingresos
	
	// devuelve representacion String de EmpleadoBaseMasComision4
	public String toString() {
		return String.format( "%s %s\n%s: %.2f", "con el sueldo base",
				super.toString(), "sueldo base", obtenerSalarioBase() );
	} // fin del metodo toString
} // fin de la clase EmpleadoPorComision4
