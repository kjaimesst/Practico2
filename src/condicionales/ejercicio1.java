
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio1 {
       public static void main(String[] args){ 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero:  ");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero:   ");
        int numero2 = sc.nextInt();
        
        if(numero1 > numero2) {
        System.out.println("El primer numero es mayor.");
        } else if(numero2 > numero1) {
        System.out.println("El segundo numero es mayor.");
        } else {
        System.out.println("Los dos numeros son iguales.");
        }
    }
}
