/*
	Programa que calcula el factorial de un numero 'N' entero y positivo.
*/
import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer numero; 
		Integer resultado = 1;
		Integer i = 1;

		System.out.print("Ingrese un numero para calcular su factorial: ");
		numero = in.nextInt();

		while ( i <= numero) {
			resultado = resultado * i;
			i++;
		}

		System.out.println("El facotorial de " + numero + " es " + resultado);

	}
}