/* 
	Programa que recoge un carácter introducido por teclado y determina
	si dicho caracter es una letra mayuscula, minuscula o ninguna 
	de las dos

*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char character;

		System.out.print("Ingrese un caracter: ");
		character = in.next().charAt(0);

		if ((character > 'a') & (character < 'z')) {
			System.out.println("La letra ingresada es \"minuscula\". ");
		} else if ((character > 'A') & (character < 'Z')) {
			System.out.println("La letra ingresada es \"MAYUSCULA\". ");
		} else {
			System.out.println("No es un caracter.");
		}
	}
}