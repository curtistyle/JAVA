package poo;
// Sobrecarga de constructores
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Uso_Empleado {
	
	public static void main(String[] args) {
//		Empleado empleado1 = new Empleado("Carlos",85000,2021,12,25);
//		Empleado empleado2 = new Empleado("Ana",25000,2021,5,12);
//		Empleado empleado3 = new Empleado("Romi",12000,2021,10,2);
//	
//		empleado1.subeSueldo(5);
//		empleado2.subeSueldo(5);
//		empleado3.subeSueldo(5);
//		
//		System.out.println("Nombre: " + empleado1.dameNombre() + ", Sueldo: " + empleado1.dameSueldo() + " , Fecha de Alta: " + empleado1.dameFechaContrato());
//		System.out.println("Nombre: " + empleado2.dameNombre() + ", Sueldo: " + empleado2.dameSueldo() + " , Fecha de Alta: " + empleado2.dameFechaContrato());
//		System.out.println("Nombre: " + empleado3.dameNombre() + ", Sueldo: " + empleado3.dameSueldo() + " , Fecha de Alta: " + empleado3.dameFechaContrato());
	
		Empleado[] misEmpleados = new Empleado[5];
		misEmpleados[0]=new Empleado("Carlos",85000,2021,12,25);
		misEmpleados[1]=new Empleado("Ana",25000,2021,5,12);
		misEmpleados[2]=new Empleado("Romi",12000,2021,10,2);
		misEmpleados[3]=new Empleado("Alberto");
		misEmpleados[4]=new Empleado("Andres");
		
//		for (int i = 0; i < misEmpleados.length; i++) {
//			misEmpleados[i].subeSueldo(5);
//			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + ", Sueldo: " + misEmpleados[i].dameSueldo() + " , Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
//		}
		
		for (Empleado e : misEmpleados) {
			e.subeSueldo(5);
			System.out.println("Nombre: " + e.dameNombre() + ", Sueldo: " + e.dameSueldo() + " , Fecha de Alta: " + e.dameFechaContrato());
		}
	}
	
	

}

class Empleado {
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
	
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
		altaContrato=calendario.getTime();
	}
	
	public Empleado(String nom) {
		this(nom,3000,200,01,01); //llama al primer constructor
	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
}

class Jefatura extends Empleado {
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	
	public void estable_incentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double dameSueldo() {             //sobreescribe el metodo dameSueldo() de la clase Empleado.
		double sueldoJefe = super.dameSueldo();    //almacena el sueldo de la clase padre Empleado().
		return sueldoJefe + this.incentivo;
	}
	
}
