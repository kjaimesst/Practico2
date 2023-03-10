/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad, nota;
        char sexo;
        String resultado;
        
        System.out.println("Ingrese la edad:");
        edad = sc.nextInt();
        
        System.out.println("Ingrese la nota:");
        nota = sc.nextInt();
        
        System.out.println("Ingrese el sexo (M o F):");
        sexo = sc.next().charAt(0);
        
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                resultado = "POSIBLE";
            } else if (sexo == 'F') {
                resultado = "ACEPTADA";
            } else {
                resultado = "NO ACEPTADA";
            }
        } else {
            resultado = "NO ACEPTADA";
        }
        
        System.out.println("El resultado de la solicitud es: " + resultado);
    }
}

