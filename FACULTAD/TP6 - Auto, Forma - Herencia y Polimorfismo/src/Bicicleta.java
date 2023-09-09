package polimorfismo;

public class Bicicleta implements ImpactoEcologico{

	private String tamanio;
	private Integer rodado;

	public Bicicleta(String tamanio, Integer rodado) {
		super();
		this.tamanio = tamanio;
		this.rodado = rodado;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public Integer getRodado() {
		return rodado;
	}

	public void setRodado(Integer rodado) {
		this.rodado = rodado;
	}

	@Override
	public String toString() {
		return "Bicicleta [tamanio=" + tamanio + ", rodado=" + rodado + "]";
	}

	@Override
	public String obtenerImpactoEcologico() {
		return "BAJO";
	}

}
