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
public class ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el numero de filas de la piramide: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n - i; j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { 
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) { 
                System.out.print(l);
            }
            System.out.println(); 
        }
    }
}


