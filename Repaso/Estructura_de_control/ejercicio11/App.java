/*
	Programa que calcula la suma de los 200 primeros
	numeros pares y los 200 primeros numeros impares 
	simultaneamente.
*/
import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer par = 0;
		Integer impar = 0;
		Integer indice = 1;


		while ( indice <= 100 ){
			if ( (indice % 2) == 0 ){
				par = par + indice;
			} else {
				impar = impar + indice;
			}
			indice++;
		}

		System.out.println("Par: " + par);
		System.out.println("Impar: " + impar);
	}
}