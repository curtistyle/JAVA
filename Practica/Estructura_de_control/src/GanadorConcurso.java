/* El proceso de encontrar el valor más grande (es decir, el máximo de un grupo de valores) se utiliza frecuentemente
en aplicaciones de computadora. Por ejemplo, un programa para determinar el ganador de un concurso de
ventas recibe como entrada el número de unidades vendidas por cada vendedor. El vendedor que haya vendido más
unidades es el que gana el concurso. Escriba un programa en seudocódigo y después una aplicación en Java que reciba
como entrada una serie de 10 números enteros, y que determine e imprima el mayor de los números. Su programa debe
utilizar cuando menos las siguientes tres variables:
    a) contador: un contador para contar hasta 10 (es decir, para llevar el registro de cuántos números se han
        introducido, y para determinar cuando se hayan procesado los 10 números).
    b) numero: el entero más reciente introducido por el usuario.
    c) mayor: el número más grande encontrado hasta ahora. */
import java.util.Scanner;
public class GanadorConcurso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int mayor = 0;

        for (int contador = 1 ; contador <= 10 ; contador++){
            System.out.println(" ("+contador +") Ingrese un numero :");
            numero = in.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El numero mayor ingresado es: " + mayor);
    }
}
