package poo;

// HERENCIA

//import javax.swing.*;

public class Uso_vehiculo {
	
	public static void main(String[] args) {
//		Coche micoche = new Coche();
//		
//		micoche.establecer_color(JOptionPane.showInputDialog("Introduce Color"));
//		
//		System.out.println(micoche.dime_datos_generales());
//		
//		System.out.println(micoche.dime_color());
//		
//		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
//		
//		System.out.println(micoche.dime_asientos());
//		
//		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
//		
//		System.out.println(micoche.dime_climatizador());
//		
//		System.out.println(micoche.dime_peso_coche());
		
		
		Coche micoche1 = new Coche();
		
		micoche1.establecer_color("Rojo");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7,580);
		
		mifurgoneta1.establecer_color("Amarillo");
		
		mifurgoneta1.configura_asientos("si");
		
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales() + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dime_color() + "\n" + mifurgoneta1.dimeDatosFurgoneta());
		
	}

}
