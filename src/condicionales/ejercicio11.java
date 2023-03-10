package condicionales;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ejercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de alumnos que van a realizar el viaje: ");
        int numAlumnos = input.nextInt();
        
        int costoPorAlumno;
        if (numAlumnos >= 100) {
            costoPorAlumno = 65;
        } else if (numAlumnos >= 50) {
            costoPorAlumno = 70;
        } else if (numAlumnos >= 30) {
            costoPorAlumno = 95;
        } else {
            costoPorAlumno = 0; 
        }
        
        int costoAutobus = (numAlumnos < 30) ? 4000 : 0;
        
        int costoTotal = costoPorAlumno * numAlumnos + costoAutobus;
        int costoPorAlumnoReal = (numAlumnos == 0) ? 0 : costoTotal / numAlumnos;
        
        System.out.println("El costo total del viaje es de " + costoTotal + " euros.");
        if (costoPorAlumnoReal > 0) {
            System.out.println("El costo por alumno es de " + costoPorAlumnoReal + " euros.");
        } else {
            System.out.println("No se cobrara por alumno.");
        }
    }

}


