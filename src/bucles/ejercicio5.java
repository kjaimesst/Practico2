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
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int limiteInferior, limiteSuperior, numero, suma = 0, dentroIntervalo = 0, fueraIntervalo = 0;
        
        do {
            System.out.print("Ingresa el limite inferior del intervalo: ");
            limiteInferior = sc.nextInt();
            
            System.out.print("Ingresa el limite superior del intervalo: ");
            limiteSuperior = sc.nextInt();
        } while (limiteInferior > limiteSuperior);
        
        System.out.println("Ingresa numeros (0 para salir):");
        
        do {
            numero = sc.nextInt();
            
            if (numero > limiteInferior && numero < limiteSuperior) {
                suma += numero;
                dentroIntervalo++;
            } else if (numero < limiteInferior || numero > limiteSuperior) {
                fueraIntervalo++;
            }
            
        } while (numero != 0);
        
        System.out.println("La suma de los numeros dentro del intervalo es: " + suma);
        System.out.println("Hay " + fueraIntervalo + " numeros fuera del intervalo.");
        
        if (limiteInferior == 0 || limiteSuperior == 0) {
            System.out.println("Se ha introducido el numero 0, que es igual a uno de los limites del intervalo.");
        } else {
            System.out.println("No se ha introducido ningun numero igual a los limites del intervalo.");
        }
    }
}


