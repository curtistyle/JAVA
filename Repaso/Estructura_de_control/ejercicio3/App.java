/* 
	Programa que lee dos valores numericos y los almacena en dos variables
	de nombre "x" e "y", determina si son iguales, y en caso de serlo, 
	indica cual de ellos es el mayor.
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer x;
		Integer y;

		System.out.print("Ingrese el valor de x: ");
		x = in.nextInt();

		System.out.print("Ingrese el valor de y: ");
		y = in.nextInt();

		if ( x > y ){
			System.out.println("El mayor es x = " + x);
		} else if (x < y) {
			System.out.println("El mayor es y = " + y);
		} else {
			System.out.println(" \"x\" e \"y\" son iguales.");
		}

	}
}