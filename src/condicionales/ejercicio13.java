package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el resultado del lanzamiento del dado (un numero entre 1 y 6): ");
        int resultado = sc.nextInt();

        String caraOpuesta;

        switch (resultado) {
            case 1:
                caraOpuesta = "6";
                break;
            case 2:
                caraOpuesta = "5";
                break;
            case 3:
                caraOpuesta = "4";
                break;
            case 4:
                caraOpuesta = "3";
                break;
            case 5:
                caraOpuesta = "2";
                break;
            case 6:
                caraOpuesta = "1";
                break;
            default:
                System.out.println("ERROR: numero incorrecto");
                return;
        }

        System.out.println("La cara opuesta es: " + caraOpuesta);
    }
}


