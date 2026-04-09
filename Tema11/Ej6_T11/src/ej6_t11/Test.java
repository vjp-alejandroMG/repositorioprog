/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_t11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creo la campañia
        Campania c = new Campania("COVID");

        int opcion;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Anadir donacion");
            System.out.println("2. Mostrar donaciones");
            System.out.println("3. Mostrar por nombre");
            System.out.println("4. Numero de donaciones");
            System.out.println("5. Total recaudado");
            System.out.println("6. Ordenadas (ya lo estan)");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    // Pido los datos y creo la donacion
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cantidad: ");
                    double cantidad = sc.nextDouble();

                    c.anadirDonacion(new Donacion(nombre, cantidad));
                    break;

                case 2:
                    // Muestro todas las donaciones
                    c.mostrarDonaciones();
                    break;

                case 3:
                    // Busco por nombre
                    System.out.print("Nombre: ");
                    String n = sc.nextLine();
                    c.mostrarPorNombre(n);
                    break;

                case 4:
                    // Muestro el numero total de donaciones
                    System.out.println("Total donaciones: " + c.numeroDonaciones());
                    break;

                case 5:
                    // Muestro el dinero total
                    System.out.println("Total recaudado: " + c.totalRecaudado());
                    break;

                case 6:
                    System.out.println("Ya estan ordenadas de mayor a menor");
                    break;
            }

        } while (opcion != 7);
    }
}
