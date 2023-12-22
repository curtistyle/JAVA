/*
	Programa que halla los 15 primeros multiplos de 3 mostrándolos en el dispositivo
	estandar de salida (pantalla)
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		System.out.println("Primeros 15 multiplos de 3.");
		for ( int i = 1; i <= 15 ; i++ ) {
			if ( ( i % 3 ) == 0 ){
				System.out.println(" > " + i);
			}
		}
	}
}