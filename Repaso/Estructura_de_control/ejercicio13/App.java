/*
	Programa que calcula el factorial de un numero 'N' entero positivo.
*/

import java.util.Scanner;
class App{
	public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);

	    	Integer i = 1;
	    	Integer numero;
	    	Integer factorial = 1;

	    	System.out.print("Ingrese un numero entero: ");
	    	numero = in.nextInt();

	    	while (i <= numero){
	    		factorial = factorial * i;
	    		i++;
	    	}

	    	System.out.println("El factorial de "+ numero + " es: " + factorial);
	    }    
}

