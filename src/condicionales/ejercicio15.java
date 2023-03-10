package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 1 y 12: ");
        int mes = sc.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("El mes " + mes + " tiene 31 dias.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El mes " + mes + " tiene 30 dias.");
        } else if (mes == 2) {
            System.out.println("El mes 2 tiene 28 dias, excepto en años bisiestos donde tiene 29 dias.");
        } else {
            System.out.println("ERROR: numero incorrecto.");
        }
    }
}


