/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13_14_t8;

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

        //  Ejercicio 13 

        // Creo dos alumnos
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("Ana", 20, 7.5);

        // Modifico los datos usando los setters
        alumno1.setNombre("Luis");
        alumno1.setEdad(18);
        alumno1.setNotaMedia(5.8);

        // Muestro la informacion
        System.out.println("ALUMNOS DEL EJERCICIO 13");
        alumno1.mostrarInfo();
        alumno2.mostrarInfo();

        // ---------- EJERCICIO 14 ----------

        // Creo un vector de 5 alumnos
        Alumno[] alumnos = new Alumno[5];
        int opcion;

        do {
            // Menu
            System.out.println("MENU DE ALUMNOS");
            System.out.println("1. Rellenar un alumno");
            System.out.println("2. Mostrar vector de alumnos");
            System.out.println("3. Mostrar alumnos con nota media superior a una nota");
            System.out.println("4. Mostrar cuantos alumnos estan suspensos");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    // Relleno un alumno en una posicion concreta
                    int posicion;

                    do {
                        System.out.print("Introduce la posicion del (0 a 4): ");
                        posicion = sc.nextInt();
                        sc.nextLine();

                        if (posicion < 0 || posicion >= alumnos.length) {
                            System.out.println("Posicion invalida.");
                        } else if (alumnos[posicion] != null) {
                            System.out.println("Esa posicion ya esta ocupada.");
                        }
                    } while (posicion < 0 || posicion >= alumnos.length || alumnos[posicion] != null);

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    System.out.print("Nota media: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    alumnos[posicion] = new Alumno(nombre, edad, nota);
                    System.out.println("Alumno insertado correctamente.");
                    break;

                case 2:
                    // Muestro alumnos del vector
                    System.out.println("LISTA DE ALUMNOS");
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] != null) {
                            alumnos[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    // Muestro alumnos con nota superior a la indicada
                    System.out.print("Introduce la nota minima: ");
                    double notaMin = sc.nextDouble();

                    System.out.println("ALUMNOS CON NOTA MAYOR A " + notaMin);
                    for (Alumno a : alumnos) {
                        if (a != null && a.getNotaMedia() > notaMin) {
                            a.mostrarInfo();
                        }
                    }
                    break;

                case 4:
                    // Cuento los alumnos suspensos
                    int suspensos = 0;

                    for (Alumno a : alumnos) {
                        if (a != null && a.getNotaMedia() < 5) {
                            suspensos++;
                        }
                    }

                    System.out.println("Numero de alumnos suspensos: " + suspensos);
                    break;

                case 5:
                    // Busco el alumno por nombre
                    System.out.print("Introduce el nombre a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    boolean encontrado = false;

                    for (Alumno a : alumnos) {
                        if (a != null && a.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        System.out.println("El alumno esta matriculado.");
                    } else {
                        System.out.println("El alumno no esta matriculado.");
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
