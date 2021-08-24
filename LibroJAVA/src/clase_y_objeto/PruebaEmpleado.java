package clase_y_objeto;

public class PruebaEmpleado {
	public static void main(String[] args) {
		Fecha nacimiento = new Fecha( 7, 24, 1949 );
		Fecha contratacion = new Fecha( 3, 12, 1988 );
		Empleado empleado = new Empleado( "Bob", "Blue", nacimiento, contratacion );
		
		System.out.println( empleado );
	} // fin main
} // fin de la clase PruebaEmpleado
