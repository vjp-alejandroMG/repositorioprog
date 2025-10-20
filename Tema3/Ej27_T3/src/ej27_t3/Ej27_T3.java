/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej27_t3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej27_T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
          Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int opcion;

        // Solicito los dos numeros al usuario
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();

        do {
            // Muestro el menú
            System.out.println("\nMenú de opciones:");
            System.out.println("1.- Sumar los números.");
            System.out.println("2.- Restar los números.");
            System.out.println("3.- Multiplicar los números.");
            System.out.println("4.- Dividir los números.");
            System.out.println("5.- Salir del programa.");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            // Hago un switch dentro del do while para realizar las funciones
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    try {
                        if (num2 == 0) {
                            throw new ArithmeticException("Error: División por cero.");// Esto lo tuve que buscar
                        }
                        System.out.println("La división es: " + (num1 / num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor elige una opción del menú.");
                    break;
            }
        } while (opcion != 5);
    }
    
}
