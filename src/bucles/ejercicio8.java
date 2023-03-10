/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author Oriana
 */
public class ejercicio8 {
    public static void main(String[] args) throws InterruptedException {
        int horas = 0, minutos = 0, segundos = 0;
        
        while (true) {
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }
        Thread.sleep(1000);
        }
    }
}


