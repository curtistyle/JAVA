import java.util.Scanner;

public class ClientesTienda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cuenta = 0;
        int saldo_incial = 0;
        int articulos = 0;
        int creditos = 0;
        final int limite = 10000;
        float nuevo_balance = 0;
        String opc = "n";

        do {
            System.out.println("Ingrese el numero de cuenta");
            cuenta = in.nextInt();

            System.out.println("Ingrese el saldo inicial: ");
            saldo_incial = in.nextInt();

            System.out.println("Ingrese el total de articulos del cliente: ");
            articulos = in.nextInt();

            System.out.println("Ingrese el total de los creditos del cliente: ");
            creditos = in.nextInt();

            nuevo_balance = (float) saldo_incial + articulos - creditos;

            if (nuevo_balance <= limite){
                System.out.println("El balance de la cuenta " + cuenta + " es: $" + String.format("%.2f",nuevo_balance));
            }else {
                System.out.println("Se exedió el límite de su crédito.");
            }

            System.out.println("¿Quiere ingresar una nueva cuenta?: (s/n)");
            opc = in.next();
        } while ("s".equals(opc));



    }
}
