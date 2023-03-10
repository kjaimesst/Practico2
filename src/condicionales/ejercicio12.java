package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la duracion de la llamada en minutos: ");
        int duracion = sc.nextInt();

        System.out.println("La llamada se realizo en domingo? (s/n): ");
        String esDomingoStr = sc.next();
        boolean esDomingo = esDomingoStr.equalsIgnoreCase("s");

        boolean esManana = false;
        boolean esTarde = false;
        if (!esDomingo) {
            System.out.println("La llamada se realizo en turno de mañana? (s/n): ");
            String esMananaStr = sc.next();
            esManana = esMananaStr.equalsIgnoreCase("s");
            System.out.println("La llamada se realizo en turno de tarde? (s/n): ");
            String esTardeStr = sc.next();
            esTarde = esTardeStr.equalsIgnoreCase("s");
        }

        double costo = 0;
        if (duracion > 0 && duracion <= 5) {
            costo = 1;
        } else if (duracion > 5 && duracion <= 8) {
            costo = 1 + ((duracion - 5) * 0.8);
        } else if (duracion > 8 && duracion <= 10) {
            costo = 1 + (3 * 0.8) + ((duracion - 8) * 0.7);
        } else if (duracion > 10) {
            costo = 1 + (3 * 0.8) + (2 * 0.7) + ((duracion - 10) * 0.5);
        }

        double impuesto = 0;
        if (esDomingo) {
            impuesto = costo * 0.03;
        } else if (esManana) {
            impuesto = costo * 0.15;
        } else if (esTarde) {
            impuesto = costo * 0.1;
        }

        System.out.println("El costo de la llamada es: " + costo + " euros");
        System.out.println("El impuesto correspondiente es: " + impuesto + " euros");
    }
}


