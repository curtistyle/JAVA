/*
	Dado un número por teclado, indicar si es positivo y par, positivo
	e impar, o negativo.
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Integer num;		

		Scanner in = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		num = in.nextInt();

		if ( num > 0) {
			System.out.print("El numero es positivo y...");
			if ( ( num % 2 ) == 0 ){
				System.out.println(" par.");
			} else {
				System.out.println(" impar.");
			}
		} else {
			System.out.println("El numero es negativo.");
		}
	}
}