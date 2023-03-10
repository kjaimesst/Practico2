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
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base, resultado = 1;
        int exponente;
        
        System.out.print("Ingresa la base: ");
        base = sc.nextDouble();
        
        System.out.print("Ingresa el exponente: ");
        exponente = sc.nextInt();
        
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
    }
}


