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
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de numeros primos que quieres mostrar: ");
        int n = sc.nextInt();
        
        int i = 2, count = 0;
        while (count < n) {
            if (esPrimo(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
    
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}


