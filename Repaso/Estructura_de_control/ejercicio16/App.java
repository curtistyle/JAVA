/*
	Programa que lee 5 valores numericos enteros y calcula su producto mostrando
	el resultado en el dispositivo estandar de salida (pantalla).
*/


import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer numero;
		Integer resultado = 1;

		for (int i = 1; i <= 5 ; i++ ) {
			System.out.print("Ingrese un numero entero: ");
			numero = in.nextInt();

			resultado = resultado * numero;
		}
	
		System.out.println("El producto de los 5 numeros ingresado es: " + resultado);
	}
}