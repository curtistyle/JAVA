import java.util.Scanner;

public class EmpresaComisiones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opc = "n";
        float monto = 0.0f;
        float monto_total = 0.0f;
        int articulos = 0;
        int contador = 0;
        float resultado = 0.0f;
        final int bono = 200;

        do {

            contador += 1;
            System.out.println("Vendedor (" + contador + "): ");

            do {
                articulos += 1;

                System.out.println("Ingrese el monto del articulo ("+ articulos +"): ");
                monto = in.nextFloat();
                monto_total += monto;

                System.out.println("Quiere ingresar otro articulo (s/n): ");
                opc = in.next();
            } while ( opc.equals("s") );

            resultado = (monto_total*9) / 100;
            resultado = monto_total + resultado;

            System.out.println("El vendedor recibe el +9% de los " + articulos + " articulos vendidos $"+ String.format("%.2f",resultado) + " mas un bono de $" + bono);
            System.out.println("TOTAL RECIBIDO: " + String.format("%.2f",(resultado + bono)));

            System.out.println("Quiere ingresar otro vendedor: ");
            opc = in.next();

        } while (opc.equals("s"));
    }
}
