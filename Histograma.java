import java.util.Scanner;

public class Histograma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumapositivos = 0;
        int sumanegativos = 0;

        while (true) {
            System.out.println("Ingrese un numero entero (positivo o negativo)(Se finaliza con 0)");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            } else if (numero > 0) {
                sumapositivos++;
            } else
                sumanegativos++;
        }

        System.out.print("Positivos son: ");
        for (int i = 0; i < sumapositivos; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Negativos son: ");
        for (int i = 0; i < sumanegativos; i++) {
            System.out.print("*");
        }
    }
}
