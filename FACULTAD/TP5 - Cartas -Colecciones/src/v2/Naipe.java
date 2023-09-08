package ej1;

public class Naipe {
	
	private Integer numero;
	private Palo palo;
	
	public Naipe(Integer numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	public Boolean equals(Naipe naipe) {
		if(this.numero == naipe.getNumero() &&
				this.palo.equals(naipe.getPalo())){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	@Override
	public String toString() {
		return "[" + numero + " - " + palo + "]";
	}
}
