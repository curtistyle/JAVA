package polimorfismo;

public class Barco implements ImpactoEcologico {

	private String nombre;

	public Barco(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + "]";
	}

	@Override
	public String obtenerImpactoEcologico() {
		return "ALTO";
	}

}
