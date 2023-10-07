import java.util.Scanner;

public class SueldoBrutoEmpleado {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opc = "n";

        float sueldo = 0.0f;
        float horas = 0.0f;
        float tarifa = 0.0f;
        int empleado = 0;

        do {
            empleado += 1;
            System.out.println("Ingrese el numero de horas del empleado #" + empleado + " : ");
            horas = in.nextFloat();

            System.out.println("Ingrese el valor de la tarifa por hora de trabajo: ");
            tarifa = in.nextFloat();

            if (horas > 40){
                sueldo = tarifa * horas;
                sueldo = (sueldo / 2) + sueldo;
                System.out.println("El sueldo bruto del empleado es: $" + String.format("%.2f", sueldo) + ".");
            } else {
                sueldo = tarifa * horas;
                System.out.println("El sueldo bruto del empleado es: $" + String.format("%.2f", sueldo) + ".");
            }

            System.out.println("¿Quiere ingresar otro empleado? (s/n)");
            opc = in.next();
        }while ( opc.equals("s"));
    }
}
