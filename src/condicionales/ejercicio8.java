package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Ingresa el segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Ingrea el tercer lado: ");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es equilatero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es isosceles.");
        } else if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)
                || Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2)
                || Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2)) {
            System.out.println("El triangulo es rectangulo.");
        } else {
            System.out.println("El triangulo es escaleno.");
        }
    }
}


