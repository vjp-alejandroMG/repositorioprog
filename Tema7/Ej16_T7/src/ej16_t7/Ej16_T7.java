/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej16_t7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej16_T7 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

        // Creo el array con los nombres de los alumnos
        String[] alumnos = { "Pepe", "Juan", "Ana", "Marta", "Pedro", "María" };

        // Hago el array con los nombres de las asignaturas
        String[] asignaturas = { "Programacion", "BBDD", "Ingles", "LMSGI" };

        // Creo un array bidimensional para guardar las notas de los 6 alumnos y 4 asignaturas
        double[][] notas = new double[6][4];

        int opcion;

        // El menu se repetira hasta que el usuario introduzca el 6
        do {
            System.out.println(" MENU");
            System.out.println("1. Rellenar las notas de los alumnos");
            System.out.println("2. Mostrar las notas");
            System.out.println("3. Mostrar el mejor alumno de la clase");
            System.out.println("4. Mostrar el alumno con mas suspensos");
            System.out.println("5. Mostrar la asignatura mas dificil");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    // Relleno las notas de todos los alumnos
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("Alumno: " + alumnos[i]);
                        for (int j = 0; j < asignaturas.length; j++) {
                            System.out.print("Nota de " + asignaturas[j] + ": ");
                            notas[i][j] = sc.nextDouble();
                        }
                    }
                    break;

                case 2:
                    // Muestro todas las notas
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("Alumno: " + alumnos[i]);
                        for (int j = 0; j < asignaturas.length; j++) {
                            System.out.println(asignaturas[j] + ": " + notas[i][j]);
                        }
                    }
                    break;

                case 3:
                    // Busco el alumno con la media mas alta
                    double mejorMedia = 0;
                    int mejorAlumno = 0;

                    for (int i = 0; i < alumnos.length; i++) {
                        double suma = 0;
                        for (int j = 0; j < asignaturas.length; j++) {
                            suma += notas[i][j];
                        }
                        double media = suma / asignaturas.length;

                        if (media > mejorMedia) {
                            mejorMedia = media;
                            mejorAlumno = i;
                        }
                    }

                    System.out.println("El mejor alumno es " + alumnos[mejorAlumno]
                            + " con una media de " + mejorMedia);
                    break;

                case 4:
                    // Busco el alumno con mas suspensos
                    int maxSuspensos = 0;
                    int alumnoSuspensos = 0;

                    for (int i = 0; i < alumnos.length; i++) {
                        int suspensos = 0;
                        for (int j = 0; j < asignaturas.length; j++) {
                            if (notas[i][j] < 5) {
                                suspensos++;
                            }
                        }
                        if (suspensos > maxSuspensos) {
                            maxSuspensos = suspensos;
                            alumnoSuspensos = i;
                        }
                    }

                    System.out.println("El alumno con mas suspensos es "
                            + alumnos[alumnoSuspensos] + " con " + maxSuspensos + " suspensos");
                    break;

                case 5:
                    // Busco la asignatura con la nota media mas baja
                    double peorMedia = 10;
                    int asignaturaDificil = 0;

                    for (int j = 0; j < asignaturas.length; j++) {
                        double suma = 0;
                        for (int i = 0; i < alumnos.length; i++) {
                            suma += notas[i][j];
                        }
                        double media = suma / alumnos.length;

                        if (media < peorMedia) {
                            peorMedia = media;
                            asignaturaDificil = j;
                        }
                    }

                    System.out.println("La asignatura mas difícil es "
                            + asignaturas[asignaturaDificil]
                            + " con una media de " + peorMedia);
                    break;

                case 6:
                    // Saliendo del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    // Opcion incorrecta
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
