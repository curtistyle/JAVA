package poo;

public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	private int plazas_extras;
	
	public Furgoneta(int plazas_extras, int capacidad_carga) {
		super(); //llamar al constructor de la clase padre
		this.capacidad_carga=capacidad_carga;
		this.plazas_extras=plazas_extras;
	}
	
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + this.capacidad_carga + " Y las plazas son: " + this.plazas_extras;
	}
}
