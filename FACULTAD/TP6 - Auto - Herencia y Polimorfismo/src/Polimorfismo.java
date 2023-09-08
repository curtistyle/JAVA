package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Polimorfismo {

	public static void main(String[] args) {

		List<ImpactoEcologico> lista = new ArrayList<ImpactoEcologico>();

		Bicicleta bici = new Bicicleta("Grande", 29);
		Edificio edificio = new Edificio("25 de Mayo", "Sarmiento 456", 10, 40);
		Auto auto = new Auto("Peugeot", "3008", 2021);
		Bicicleta bici2 = new Bicicleta("Mediano", 20);
		Barco barco = new Barco("Independencia");

		lista.add(edificio);
		lista.add(auto);
		lista.add(bici);
		lista.add(bici2);
		lista.add(barco);

		for (ImpactoEcologico impacto : lista) {
			System.out.println(impacto + " - " + impacto.obtenerImpactoEcologico());
		}

	}

}
