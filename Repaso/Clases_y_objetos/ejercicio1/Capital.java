public class Capital{
	
	private String nombre;
	private double precioAnterior;
	private double precioAlCierre;
	private int numerosDeAcciones;


	public Capital(){
		this.nombre = "";
		this.precioAnterior = 0;
		this.precioAlCierre = 0;
		this.numerosDeAcciones = 0;
	}

	public Capital(String nombre, double precioAnterior, double precioAlCierre, int numerosDeAcciones){
		this.nombre = nombre;
		this.precioAnterior = precioAnterior;
		this.precioAlCierre = precioAlCierre;
		this.numerosDeAcciones = numerosDeAcciones;
	}

	public void setNombre(String value){
		this.nombre = value;
	}

	public void setPrecioAnterior(double value){
		this.precioAnterior = value;
	}

	public void setPrecioAlCierre(double value){
		this.precioAlCierre = value;
	}

	public void setNumerosDeAcciones(int value){
		this.numerosDeAcciones = value;
	}

	public String getNombre(){
		return this.nombre;
	}

	public double getPrecioAnterior(){
		return this.precioAnterior;
	}

	public double getPrecioAlCierre(){
		return this.precioAlCierre;
	}

	public double getNumerosDeAcciones(){
		return this.numerosDeAcciones;
	}

	public double gananciaPorcentaje(){
		double porcentajeGanancia = 0;
		porcentajeGanancia = ( (this.precioAlCierre - this.precioAnterior) / this.precioAnterior ) * 100;
		return porcentajeGanancia;
	}

	public double valorTotalAcciones(){
		// Calcula la ganancia por accion.
		double gananciaPorAccion = this.precioAlCierre - this.precioAnterior;
		// Calcula el valor total de las acciones poseidas.
		double valorTotalAcciones = this.numerosDeAcciones * this.precioAlCierre;

		return valorTotalAcciones;
	}

	@Override
	public String toString(){
		return "Capital( " + this.nombre + ", " + this.precioAnterior + ", " + this.precioAlCierre + ", " + this.numerosDeAcciones + " )"; 
	}
}	