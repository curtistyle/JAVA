package polimorfismo;

public class Auto implements ImpactoEcologico{

	private String marca;
	private String modelo;
	private Integer anio;

	public Auto(String marca, String modelo, Integer anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
	}

	@Override
	public String obtenerImpactoEcologico() {
		return "ALTO";
	}

}
