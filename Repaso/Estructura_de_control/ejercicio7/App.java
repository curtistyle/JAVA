/*
	Programa que comprueba el valor de la variable "x"
	(introducido por teclado) de forma que si "x" es igual a 2, la 
	variable "k" toma valor 4 y, en caso contrario, "k" toma valor 16. 
	Codificar dos versiones del programa utilizando en primer lugar una
	estructura condicional normal, y en segundo lugar una estructura 
	condicional abreviada.
*/
import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Integer x;
		Integer k = 16;

		// Condicional normal
		System.out.print("Ingrese el valor de x: ");
		x = in.nextInt();
		if ( x == 2 ){
			k = 4;
		}

		System.out.println("k = " + k);

		// Condicional abreviada
		k = 16;
		System.out.print("Ingrese el valor de x: ");
		x = in.nextInt();

		System.out.println( x == 2 ? String.format("k = " + (k = 4)) : String.format("k = " + k));
	}
}