package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa la base: ");
        double base = entrada.nextDouble();
        
        System.out.print("Ingresa el exponente: ");
        int exponente = entrada.nextInt();
        
        if (exponente > 0) {
            double resultado = Math.pow(base, exponente);
            System.out.println("El resultado es: " + resultado);
        } else if (exponente == 0) {
            System.out.println("El resultado es: 1");
        } else {
            double resultado = 1 / Math.pow(base, Math.abs(exponente));
            System.out.println("El resultado es: " + resultado);
        }
    }
}
 


