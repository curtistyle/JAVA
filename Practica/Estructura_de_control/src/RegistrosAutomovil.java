import java.util.Scanner;
public class RegistrosAutomovil {
    /* Los conductores se preocupan acerca del kilometraje de sus automóviles. Un conductor
    *  ha llevado el registro de varios reabastecimientos de gasolina, registrando los kilómetros
    *  conducidos y los litros usados en cada reabastecimiento. Desarolle una aplicación en Java que
    *  reciba como entrada los kilómetros conducidos y los litros usados (ambos como enteros) por cada
    *  reabastecimiento, y debe imprimir el total de kilómetros por litro obtenidos en todos los
    *  reabastecimientos hasta este punto. Todos los cálculos del promedio deben producir resultados
    *  en números de punto flotante. Use la clase `Scanner` y la repeticion controlada por centinela
    *  para obtener los datos del usuario. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kilometros = 0; // kilometros conducidos.
        int litros = 0;     // litros usados.
        int total_kilometros = 0;
        int total_litros = 0;
        int contador = 0;
        float resultado = 0.0f;
        String opc = "n";

        do {
            contador += 1;
            System.out.println("Reabastecimiento (" + contador + ").");

            System.out.println("Ingrese los kilometros recorridos: ");
            kilometros = in.nextInt();

            System.out.println("Ingrese la cantidad de listros de combustible consumido: ");
            litros = in.nextInt();

            resultado = (float) kilometros / litros;
            System.out.println("Kilometros x litro: " + String.format("%.2f",resultado) + "Km.");

            System.out.println("¿Quieres hacer otro reabastecimiento? (s/n)");
            opc = in.next();

            total_kilometros += kilometros;
            total_litros += litros;
        } while (opc.equals("s"));

        System.out.println("El coductor hizo " + contador + " reabastecimientos.");
        System.out.println("Recorrio " + total_kilometros + "km.");
        System.out.println("Consumio " + total_litros + "lts de combustible.");

        resultado = (float) total_kilometros / total_litros;

        System.out.println("Kilometros x litro: " + resultado + "km.");
        in.close();
    }

}
