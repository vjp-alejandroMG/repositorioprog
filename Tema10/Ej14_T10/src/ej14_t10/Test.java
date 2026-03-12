/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14_t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Alumno> listaAlumnos = new ArrayList<>();


    // Metodo que muestra el menu
    public static void mostrarMenu() {

        System.out.println("--- MENU ---");
        System.out.println("1. Introducir alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Mejor alumno");
        System.out.println("4. Asignatura mas dificil");
        System.out.println("5. Salir");
    }


    // Opcion 1 introducir un nuevo alumno con sus notas
    public static void introducirAlumno() {

        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();

        // Creo el array de asignaturas
        Asignatura[] asignaturas = new Asignatura[3];

        System.out.print("Nota Lengua: ");
        float lengua = sc.nextFloat();

        System.out.print("Nota Mates: ");
        float mates = sc.nextFloat();

        System.out.print("Nota Fisica: ");
        float fisica = sc.nextFloat();
        sc.nextLine(); 

        // Creo las asignaturas con su nombre y nota
        asignaturas[0] = new Asignatura("Lengua", lengua);
        asignaturas[1] = new Asignatura("Mates", mates);
        asignaturas[2] = new Asignatura("Fisica", fisica);

        // Creo el alumno
        Alumno alumno = new Alumno(nombre, asignaturas);

        // Lo añado a la lista
        listaAlumnos.add(alumno);

        System.out.println("Alumno añadido correctamente.");
    }


    // Opcion 2 mostrar todos los alumnos y sus notas
    public static void mostrarAlumnos() {

        // Recorro la lista de alumnos
        for (Alumno a : listaAlumnos) {

            System.out.println("\nAlumno: " + a.nombre);

            // Recorro sus asignaturas
            for (Asignatura as : a.asignaturas) {

                System.out.println(as.nombre + ": " + as.nota);
            }
        }
    }


    // Opcion 3 encontrar el alumno con mejor media
    public static void mejorAlumno() {

        if (listaAlumnos.isEmpty()) {

            System.out.println("No hay alumnos.");
            return;
        }

        // Pensando que el primero es el mejor
        Alumno mejor = listaAlumnos.get(0);

        // Recorro la lista comparando medias
        for (Alumno a : listaAlumnos) {

            if (a.calcularMedia() > mejor.calcularMedia()) {

                mejor = a;
            }
        }

        System.out.println("El mejor alumno es: " + mejor.nombre);
        System.out.println("Media: " + mejor.calcularMedia());
    }


    // Opcion 4 asignatura con mas suspensos
    public static void asignaturaMasDificil() {

        int suspLengua = 0;
        int suspMates = 0;
        int suspFisica = 0;

        // Recorro todos los alumnos
        for (Alumno a : listaAlumnos) {

            // Cuento suspensos en cada asignatura
            if (a.asignaturas[0].nota < 5) suspLengua++;

            if (a.asignaturas[1].nota < 5) suspMates++;

            if (a.asignaturas[2].nota < 5) suspFisica++;
        }

        // omparo cual tiene mas suspensos
        if (suspLengua >= suspMates && suspLengua >= suspFisica)
            System.out.println("La asignatura mas dificil es Lengua");

        else if (suspMates >= suspLengua && suspMates >= suspFisica)
            System.out.println("La asignatura mas dificil es Mates");

        else
            System.out.println("La asignatura mas dificil es Fisica");
    }


    public static void main(String[] args) {

        int opcion;

        // El menu se repite hasta que el usuario pulse 5
        do {

            mostrarMenu();

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    introducirAlumno();
                    break;

                case 2:
                    mostrarAlumnos();
                    break;

                case 3:
                    mejorAlumno();
                    break;

                case 4:
                    asignaturaMasDificil();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 5);
    }
    
}
