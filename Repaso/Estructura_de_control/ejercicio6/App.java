/*
	Programa que lee dos valores numéricos enteros del dispositivo estandar 
	de entrada y los almacena en dos variables de nombre "x" e "y" realizando
	seguidamente las siguientes operaciones:
		a) En caso que el valor de "x" sea mayor que el valor de "y", se 
		efectuara la llamada a un modulo o funcion de nombre "suma" que
		devuelve el resultado correspondiente a la suma de dichos valores.
		b) En el caso que el valor de "x" sea menor que el valor de "y", se
		realizara la llamada a un modulo o funcion de nombre "producto" que
		devuelve el resultado correspondiente al producto de dichos valores.	
*/
import java.util.Scanner;
class App{
	public static Integer suma( Integer x, Integer y ){
		return x + y;
	}

	public static Integer producto( Integer x, Integer y ){
		return x * y;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer x;
		Integer y;

		System.out.print("Ingrese el valor de x: ");
		x = in.nextInt();
	
		System.out.print("Ingrese el valor de y: ");
		y = in.nextInt();

		if ( x > y ){
			System.out.println("Suma.");
			System.out.println( x + " + " + y + " = " + suma(x, y) );
		} else {
			System.out.println("Producto.");
			System.out.println( x + " * " + y + " = " + producto(x, y) );
		}
	}
}