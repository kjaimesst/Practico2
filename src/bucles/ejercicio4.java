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
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        int numero2 = sc.nextInt();
   
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        
        System.out.println("Numeros pares entre " + numero1 + " y " + numero2 + ":");
        
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}




