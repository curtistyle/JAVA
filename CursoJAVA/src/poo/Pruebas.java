package poo;
// CONSTANTES, USO FINAL Y STATIC, METODO STATIC
public class Pruebas {

	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Carlos");
		Empleados trabajador2 = new Empleados("Marta");
		Empleados trabajador3 = new Empleados("Arturo");
		Empleados trabajador4 = new Empleados("Maria");
		trabajador1.cambiar_seccion("RRHH");
		System.out.println(trabajador1.devuelve_dato());
		//Empleados.Id++;
		System.out.println(trabajador2.devuelve_dato());
		//Empleados.Id++;
		System.out.println(trabajador3.devuelve_dato());
		
		System.out.println(trabajador4.devuelve_dato() + "\n" + Empleados.dameIdSiguiente());
		
	}

}

class Empleados{
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
	
	public Empleados(String nom) {
		nombre=nom;	
		seccion="Administracion";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambiar_seccion(String seccion) { //setter
		this.seccion=seccion;
	}
	
	public String devuelve_dato() {
		return "El nombre es: " + this.nombre + " y la seccion es " + this.seccion + " ID: " + this.Id;
	}
	
	public static String dameIdSiguiente() {
		return "El Id siguiente es: " + IdSiguiente;
	}
	

}