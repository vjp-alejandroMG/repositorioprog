/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej26_t2;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ej26_T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        int numero = scanner.nextInt();

        // Validar que el número tenga exactamente 4 cifras
        if (numero < 1000 || numero > 9999) {
            System.out.println("Error: Debes introducir un número de 4 cifras.");
        } else {
            int primera = numero / 1000;
            int segunda = (numero / 100) % 10;
            int tercera = (numero / 10) % 10;
            int cuarta = numero % 10;

            System.out.println("La primera cifra es: " + primera);
            System.out.println("La segunda cifra es: " + segunda);
            System.out.println("La tercera cifra es: " + tercera);
            System.out.println("La cuarta cifra es: " + cuarta);
        }
    }
    
}
