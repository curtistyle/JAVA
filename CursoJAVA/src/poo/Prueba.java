package poo;

import java.util.Date;

public class Prueba {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date hora = new Date();
		
		System.out.printf("%d:%d", hora.getHours(), hora.getMinutes() );
	}
}
