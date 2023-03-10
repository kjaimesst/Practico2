package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una letra: ");
        char letra = sc.next().charAt(0);
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra introducida es mayuscula.");
        } else {
            System.out.println("La letra introducida no es mayuscula.");
        }
    }
}


