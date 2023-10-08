import java.util.Scanner;

public class TablaValores {
    public static void main(String[] args) {
        int indice;
        String letra;

        System.out.println("N     " + "10*N    " + "100*N    " + "1000*N");
        for (indice = 1 ; indice <= 5 ; indice++){
            System.out.println(indice + "     " + indice*10 + "      " + indice*100 + "      " + indice*1000);
        }

    }
}
