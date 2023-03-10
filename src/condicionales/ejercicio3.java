package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double numero2 = sc.nextDouble();

        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir por cero");
        } else {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        }

        sc.close();
    }
}

