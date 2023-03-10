/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Oriana
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1;
        int intentos = 10;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adivina el numero del 1 al 100. Tienes 10 intentos.");
        
        while (intentos > 0) {
            System.out.print("Introduce un numero: ");
            int numero = sc.nextInt();
            
            if (numero == numeroAleatorio) {
                System.out.println("¡Correcto! Has acertado el numero en " + (11 - intentos) + " intentos.");
                return;
            } else if (numero < numeroAleatorio) {
                System.out.println("El numero a adivinar es mayor. Te quedan " + (intentos - 1) + " intentos.");
            } else {
                System.out.println("El numero a adivinar es menor. Te quedan " + (intentos - 1) + " intentos.");
            }
            
            intentos--;
        }
        
        System.out.println("Lo siento, has agotado tus intentos. El numero era: " + numeroAleatorio);
    }
}


