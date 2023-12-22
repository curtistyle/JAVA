/*
	Programa que escribr la suma de una seria de números recogidos del dispositivo estandar de entrada
	(teclado). La entrada de datos finaliza al evaluar la respuesta dada a un mensaje que diga 
	"¿Continuar (S/N)?" mostrado una vez finalizado las operaciones del bucle.

*/
import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer x;
		Integer y;
		Integer resultado = 0;


		char opc;

		do {
			System.out.println("Ingrese un par de numeros: ");
			System.out.print("x: ");
			x = in.nextInt();
			System.out.print("y: ");
			y = in.nextInt();

			resultado = x + y + resultado;

			System.out.println("Resultado actual: " + resultado);

			System.out.print("¿Continuar (S/N)?: ");
			opc = in.next().charAt(0);	
		} while (opc == 's' || opc == 'S');

		System.out.println("Resultado final: " + resultado);
	}
}