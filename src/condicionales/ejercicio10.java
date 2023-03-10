package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio10 {

public class PrecioUva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioInicial, precioFinal;
        String tipoUva;
        int tamanoUva;

        System.out.println("Ingrese el precio inicial por kilo de uva:");
        precioInicial = sc.nextDouble();

        System.out.println("Ingrese el tipo de uva (A o B):");
        tipoUva = sc.next();

        System.out.println("Ingrese el tamaño de uva (1 o 2):");
        tamanoUva = sc.nextInt();

        if (tipoUva.equals("A")) {
            if (tamanoUva == 1) {
                precioFinal = precioInicial + 0.20;
            } else {
                precioFinal = precioInicial + 0.30;
            }
        } else {
            if (tamanoUva == 1) {
                precioFinal = precioInicial - 0.30;
            } else {
                precioFinal = precioInicial - 0.50;
            }
        }

        System.out.println("El precio final por kilo de uva es: " + precioFinal);
    }
}

}
