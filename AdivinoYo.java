import java.util.Scanner;
import java.util.Random;
public class AdivinoYo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int randomNumber = random.nextInt(100)+1;

    int numero;
    int intento = 0;

        do {
        System.out.println("Intenta adivinar el numero misterioso");
        numero = sc.nextInt();
        intento++;
        if (numero > randomNumber) {
            System.out.println("El numero "+numero+" es mayor al numero misterioso");
        } else if (numero < randomNumber) {
            System.out.println("El numero "+numero+" es menor al numero misterioso");
        }
    } while (randomNumber != numero);

        System.out.println("Adivinaste, el " + randomNumber + " es el numero misterioso.");
        System.out.println("Te tomo " +intento+ " intentos para adivinarlo ");
    }
}