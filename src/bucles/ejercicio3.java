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
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese caracteres (separados por espacios):");
        String entrada = sc.nextLine();
        
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            
            if (c == ' ') {
                break;  
            }
            
            if (esVocal(c)) {
                System.out.println(c + " es VOCAL");
            } else {
                System.out.println(c + " es NO VOCAL");
            }
        }
    }
    
    private static boolean esVocal(char c) {
        c = Character.toLowerCase(c);  
        
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}


