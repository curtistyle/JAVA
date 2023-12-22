/*
	Hacer un programa que lee una serie de numeros enteros positivos de la entrada estandar
	y calcule el valor maximo de los mismos y cuantas veces aparece dicho valor repetido.
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char opc;
		Integer contador = 0;
		Integer maximo = 0;
		Integer numero;

		do {
			System.out.print("Ingrese un numero: ");
			numero = in.nextInt();

			if ( numero > maximo ){
				maximo = numero;
			} else {
				if ( numero == maximo ){
					contador = contador + 1;
				}
			}

			System.out.print("Desea continuar (s/n): ");
			opc = in.next().charAt(0);

		} while (opc == 's' || opc == 'S');

		System.out.println("El numero maximo de la susecion de numeros es: "+ maximo);
		System.out.println("... y se repition " + contador + " veces.");
	}

}