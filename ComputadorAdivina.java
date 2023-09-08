import java.util.Scanner;

public class ComputadorAdivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 100;
        int intentos = 0;

        System.out.println("Piensa en un numero entre 0 y 100, y yo tratare de adivinarlo.");

        while (true) {
            int numeroAdivinado = (min + max) / 2;
            intentos++;

            System.out.println("¿Es " + numeroAdivinado + " tu numero? (responde '<','>','=')");
            String respuesta = sc.next();

            if (respuesta.equals("=")) {
                System.out.println("¡OMG! Tu numero es el "+numeroAdivinado+".");
                System.out.println("Me tomo "+intentos+" intentos para adivinarlo B)");
                break;
            } else if (respuesta.equals("<")) {
                max = numeroAdivinado - 1;
            } else if (respuesta.equals(">")) {
                min = numeroAdivinado + 1;
            } else {
                System.out.println("Respuesta no válida. Por favor, responde '<', '>' o '='.");
            }
        }
    }
}
