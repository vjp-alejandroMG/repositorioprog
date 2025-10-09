/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_t3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej1_T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pido un numero que puede ser positivo o negativo
        System.out.print("Por favor, introduzca un número tanto positivo como negativo: ");
        int numero = scanner.nextInt();

        if (numero>1) {
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }


    }
    
}
