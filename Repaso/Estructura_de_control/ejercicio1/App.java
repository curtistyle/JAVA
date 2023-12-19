/*
	Programa que lee dos valores numericos enteros
	y los almacena en dos variables de nombre "x" y "z",
	mostrando en aquellos casos en los que "x" es mayor
	que "z" un mensaje que diga "verdadero"

*/
import java.util.Scanner;
public class App{
	
	public static void main(String[] args) {
		Integer x;
		Integer z;
	
		Scanner in = new Scanner(System.in);

		System.out.print("Ingrese el valor de x: ");
		x = in.nextInt();

		System.out.print("Ingrese el valor de z: ");
		z = in.nextInt();

		if ( x > z ){
			System.out.println("Verdadero!");
		}
	}
}