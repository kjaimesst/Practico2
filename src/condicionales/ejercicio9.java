package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Ingrese el año que desea verificar:");
        year= sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " no es bisiesto.");
        }
    }
}


