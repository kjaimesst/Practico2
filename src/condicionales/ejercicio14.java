package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero del 1 al 7: ");
        int dia = sc.nextInt();

        if (dia == 1) {
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miercoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 5) {
            System.out.println("Viernes");
        } else if (dia == 6) {
            System.out.println("Sabado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("ERROR: numero incorrecto");
        }
    }
}


