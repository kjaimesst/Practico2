package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas x e y del primer centro separadas por un espacio: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Ingrese el radio de la primera circunferencia:");
        double r1 = sc.nextDouble();

        System.out.println("Ingrese las coordenadas x e y del segundo centro separadas por un espacio: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Ingrese el radio de la segunda circunferencia:");
        double r2 = sc.nextDouble();

         double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

         if (d > r1 + r2) {
            System.out.println("Las circunferencias son exteriores.");
        } else if (d == r1 + r2) {
            System.out.println("Las circunferencias son tangentes exteriores.");
        } else if (d < r1 + r2 && d > Math.abs(r2 - r1)) {
            System.out.println("Las circunferencias son secantes.");
        } else if (d == Math.abs(r2 - r1)) {
            System.out.println("Las circunferencias son tangentes interiores.");
        } else if (d < Math.abs(r2 - r1)) {
            System.out.println("Las circunferencias son interiores.");
        } else if (d == 0 && r1 == r2) {
            System.out.println("Las circunferencias son concentricas.");
        } else {
            System.out.println("Las circunferencias no se pueden clasificar.");
        }
    }
}


