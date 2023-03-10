package condicionales;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero:  ");
        int numero = sc.nextInt();
        
        if( numero % 2 == 0){
            System.out.println("El numero ingresado es par");   
        }else {
            System.out.println("El numero ingresado es impar");
        }
        
    }
}
