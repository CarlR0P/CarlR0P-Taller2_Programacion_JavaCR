import java.util.Scanner;

public class TiempoViaje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totaltiempo = 0;

        while (true) {
            System.out.println("Ingrese el tiempo del tramo en min (Se finaliza con 0):");
            int tiempo = sc.nextInt();

            if (tiempo == 0) {
                break;
            }

            totaltiempo = totaltiempo + tiempo;
        }

        int horas = totaltiempo / 60;
        int minutosrestantes = totaltiempo % 60;

        System.out.println("El tiempo total de viaje fue: "+horas+" horas y "+minutosrestantes+" minutos.");
    }
}