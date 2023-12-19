/*
	Programa que determina si el caracter introducido a travez del dispositivo
	estandar de entrada (teclado) es o no una vocal.
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String caracter;

		System.out.print("Ingrese un caracter: ");
		caracter = in.nextLine();

		switch (caracter){
		case "a" : 
			System.out.println("La vocal es a");
			break;
		case "e" :
			System.out.println("La vocal es e");
			break;
		case "i" :
			System.out.println("La vocal es i");
			break;
		case "o" :
			System.out.println("La vocal es o");
			break;
		case "u" : 
			System.out.println("La vocal es u");
			break;
		default:
			System.out.println("No es vocal.");
		}
	}
}