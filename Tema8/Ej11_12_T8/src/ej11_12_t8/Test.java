/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11_12_t8;

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

        //  Ejercicio 11 

        // Creo un mueble con constructor por defecto
        Mueble mueble1 = new Mueble();

        // Creo un mueble con constructor parametrizado
        Mueble mueble2 = new Mueble(120, "Mesa de comedor");

        // Cambio la descripcion usandolos setters
        mueble1.setDescripcion("Silla de madera");
        mueble1.setPrecio(45);

        mueble2.setDescripcion("Mesa grande de roble");

        // Muestro la informacion de los muebles
        System.out.println("MUEBLES DEL EJERCICIO 11:");
        mueble1.mostrarInfo();
        mueble2.mostrarInfo();

        //  Ejercicio 12 

        // Creo un vector de 4 muebles
        Mueble[] muebles = new Mueble[4];

        int opcion;

        do {
            // Muestro el menu
            System.out.println("MENU DE MUEBLES");
            System.out.println("1. Rellenar muebles");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    // Relleno el vector de muebles
                    for (int i = 0; i < muebles.length; i++) {
                        System.out.println("\nMUEBLE " + (i + 1));

                        System.out.print("Descripcion: ");
                        String descripcion = sc.nextLine();

                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();
                        sc.nextLine();

                        muebles[i] = new Mueble(precio, descripcion);
                    }
                    System.out.println("Muebles rellenados correctamente.");
                    break;

                case 2:
                    // Muestro todos los muebles
                    System.out.println("LISTA DE MUEBLES");
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null) {
                            muebles[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    // Muestro muebles por precio
                    System.out.print("Introduce el precio maximo: ");
                    double precioMax = sc.nextDouble();

                    System.out.println("MUEBLES CON PRECIO IGUAL O MENOR A " + precioMax + " €");
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null && muebles[i].getPrecio() <= precioMax) {
                            muebles[i].mostrarInfo();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
