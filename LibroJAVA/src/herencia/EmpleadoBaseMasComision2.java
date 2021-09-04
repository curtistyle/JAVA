package herencia;

// EmpleadoBaseMasComision2 hereda de clase EmpleadoPorComision

public class EmpleadoBaseMasComision2 extends EmpleadoPorComision {
	private double salarioBase;   // salario base por semana

	// constructor con seis argumentos
	public EmpleadoBaseMasComision2( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ) {
		// llamada explicita al constructor de la superclase EmpleadoPorComision
		super( nombre, apellido, nss, ventas, tarifa );
		
		establecerSalarioBase( salario ); // valida y almacena el salario base
	} // fin del constructor de EmpleadoBaseMasComision2 con seis argumentos 

	// establecer salario base
	public void establecerSalarioBase( double salario ) {
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
	} // fin del metodo establecerSalarioBase
	
	// devuelve el salario base
	public double obtenerSalarioBase() {
		return salarioBase;
	} // fin del metodo obtenerSalarioBase
	
	// calcula el ingreso
	public double ingreso() {
		// no esta permitido: tarifaComision y ventasBrutas son private en la superClase
		return salarioBase + ( tarifaComision * ventasBrutas );
	} // fin del metodos ingresos
	
	public toString() {
		// no esta permitido: intentos por acceder a los miembros private de la superclase
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"empleado por comision con sueldo base", primerNombre, apellidoPaterno,
				"numero de seguro social", numeroSeguroSocial,
				"ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision,
				"salario base", salarioBase );
	} // fin del metodo toString	
}  // fin de la clase EmpleadoPorComision2

