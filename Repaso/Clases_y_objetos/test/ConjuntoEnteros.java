public class ConjuntoEnteros{
	
	public int numero = 0;

	public void ConjuntoEnteros(int numero){
		this.numero = numero;
	}

	public int getNumero(){
		return this.numero;
	}

	public void setNumero(int value){
		if ((value >= 0) && (value <= 100)){
			this.numero = value;	
		}
	}
}