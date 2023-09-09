import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Mediana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese un numero (Se finaliza con '.')");
            String entrada = sc.next();

            if (entrada.equals(".")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            Collections.sort(numeros);

            int cantidad = numeros.size();
            int mitad = cantidad / 2;

            if (cantidad % 2 == 0) {
                double mediana = (numeros.get(mitad - 1) + numeros.get(mitad)) / 2.0;
                System.out.println("La mediana es: " + mediana);
            } else {
                double mediana = numeros.get(mitad);
                System.out.println("La mediana es: " + mediana);
            }
        }
    }
}
