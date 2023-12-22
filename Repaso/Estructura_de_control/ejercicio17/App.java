/*
	Programa que halla la suma de los 10 primeros números pares mostrando
	el resultado en pantalla. El 0 puede ser considerado como par o impar 
	indistintamente.
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer suma = 0;

		for ( int i = 0 ; i <= 20 ; i++ ) {
			if ( ( i % 2 ) == 0 ){
				System.out.println(">" + i);
				suma = suma + i;	
			}
		}

		System.out.println("La suma de los primeros 10 numeros pares es: " + suma);
	}
}