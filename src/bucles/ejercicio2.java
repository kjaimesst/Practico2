/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de numeros a introducir: ");
        int cantidad = sc.nextInt();
        
        int mayores = 0;
        int menores = 0;
        int iguales = 0;
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce un numero: ");
            int numero = sc.nextInt();
            
            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }
        
        System.out.println("Has introducido " + mayores + " numeros mayores que 0.");
        System.out.println("Has introducido " + menores + " numeros menores que 0.");
        System.out.println("Has introducido " + iguales + " numeros iguales a 0.");
    }
}


