public class App{
	
	public static void main(String[] args) {
		Capital capital1 = new Capital();
		

		capital1.setNombre("Juan Pablo");
		

		capital1.setPrecioAnterior(1200.0);
		capital1.setPrecioAlCierre(2000.0);
		capital1.setNumerosDeAcciones(3);

		System.out.println("Capital de: " + capital1.getNombre());
		System.out.println("Precio Anterior: $" + capital1.getPrecioAnterior());
		System.out.println("Precio Al Cierre: $" + capital1.getPrecioAlCierre());
		System.out.println("Numero De Acciones: " + capital1.getNumerosDeAcciones() + "\n");

		System.out.println("Porcentaje de Ganancias: " + String.format("%.2f", capital1.gananciaPorcentaje()) + "%");
		System.out.println("Valor total de las Acciones: "+ capital1.valorTotalAcciones());


		Capital capital2 = new Capital("Maria Martinez", 4200.0, 6000.0, 8);

		System.out.println("Capital de: " + capital2.getNombre());
		System.out.println("Precio Anterior: $" + capital2.getPrecioAnterior());
		System.out.println("Precio Al Cierre: $" + capital2.getPrecioAlCierre());
		System.out.println("Numero De Acciones: " + capital2.getNumerosDeAcciones() + "\n");

		System.out.println("Porcentaje de Ganancias: " + String.format("%.2f", capital2.gananciaPorcentaje()) + "%");
		System.out.println("Valor total de las Acciones: "+ capital2.valorTotalAcciones());

	}	
}