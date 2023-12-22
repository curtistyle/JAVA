/*
	Programa que lee 10 numeros enteros y determina si cada numero leido esta comprendido en el
	siguiente intervalo, mostrando la palabra 'Cierto' en caso afirmativo, y 'Falso' en caso 
	contrario. Intervalo: [35-75]
*/


import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numero;

		for ( int i = 1; i <= 10 ; i++ ) {
			System.out.print("Ingrese un numero: ");
			numero = in.nextInt();

			if ( ( numero >= 35 ) && ( numero <= 75 ) ){
				System.out.println("Cierto!");
			} else {
				System.out.println("Falso!");
			}

		}
	}
}