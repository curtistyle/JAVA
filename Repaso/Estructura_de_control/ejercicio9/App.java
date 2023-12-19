/*
	Programa que suma todo aquellos numeros leidos del dispositivo
	estandar de entrada (teclado) mientras no sean negativos.	
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		Integer num;
		Integer acumulador = 0;


		System.out.print("Ingrese un numero: ");
		num = in.nextInt();


		while ( num > 0 ){
			acumulador = acumulador + num;
			System.out.print("Ingrese un numero: ");
			num = in.nextInt();
		}

		System.out.println("La suma total de los numeros ingresados es: " + acumulador);
	}
}