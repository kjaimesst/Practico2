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
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double precio, total = 0, pago;
        int meses;
        
        System.out.print("Ingresa el precio del articulo: ");
        precio = sc.nextDouble();
        
        System.out.print("Ingresa el numero de meses para pagar: ");
        meses = sc.nextInt();
        
        for (int i = 1; i <= meses; i++) {
            pago = precio * Math.pow(2, i - 1) / Math.pow(2, meses) ;
            total += pago;
            System.out.println("El pago del mes " + i + " es de " + pago + " €.");
        }
        
        System.out.println("El total pagado despues de " + meses + " meses es de " + total + " €.");
    }
}


