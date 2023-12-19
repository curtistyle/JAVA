/*
	Programa que muestra en pantalla todos aquellos caracteres 
	introducidos a traves del dispositivo estandar de entrada
	hasta que sea pulsado el caracter asterisco.
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Character ch = ' ';

		while ( ch != '*' ){
			System.out.println("> "+ch);
			ch = in.next().charAt( 0 );
		}
	}
}