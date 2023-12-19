/* 
	Programa que lee dos valores distintos y los almacena en dos variables de
	nombre "x" e "y" y determina cual es el mayor dejando el resultado en una
	tercera variable de nombre "z".
 */

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Integer x;
		Integer y;
		Integer z;

		Scanner in = new Scanner(System.in);

		System.out.print("Ingrese el valor de x: ");
		x = in.nextInt();

		System.out.print("Ingrese el valor de y: ");
		y = in.nextInt();

		if ( x > y ){
			z = x;
		} else {
			z = y;
		}

		System.out.println("El mayor es: " + z);
	}
}