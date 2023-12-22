/*
	Programa que contabiliza el número de caracteres que
	y el numeros de linas que forma un bloque de texto
	introducido por teclado.
*/
import java.util.Scanner;

public class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Integer indice;
		Integer espacios = 0;
		Integer nuevaLinea = 0;
		Integer numerosCaracteres = 0;


		String texto;

		System.out.print("Ingrese un texto: ");
		texto = in.nextLine();

		for (int i = 0; i<texto.length() ;i++) {
			// charAt : retorna el caracter de una posicion especifica.
			numerosCaracteres = texto.length();
			if (texto.charAt(i) == ' '){
				espacios = espacios + 1;
			} else if ( texto.charAt(i) == '\n'){
				nuevaLinea = nuevaLinea + 1;
			}
		}

		System.out.println("Espacios en blanco: " + espacios);
		System.out.println("Nuevas lineas (saltos): " + nuevaLinea);
		System.out.println("Numeros de caracteres: " + numerosCaracteres);
	}

}