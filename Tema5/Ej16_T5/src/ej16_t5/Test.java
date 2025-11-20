/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej16_t5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {

    // Hago el metodo para pedir el nombre al usuario
    public static String pedirNombre(Scanner scanner) {
        System.out.print("Introduce el nombre del alumno: ");
        return scanner.nextLine();
    }

    // Metodo para pedir una nota al usuario
    public static int pedirNota(Scanner scanner) {
        System.out.print("Introduce la nota (0-10): ");
        return scanner.nextInt();
    }

    // Metodo para crear un alumno pidiendo datos al usuario
    public static Alumno crearAlumno(Scanner scanner) {
        scanner.nextLine(); // limpio el bufer
        String nombre = pedirNombre(scanner);
        int nota = pedirNota(scanner);
        return new Alumno(nombre, nota);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creo 3 alumnos
        Alumno a1 = crearAlumno(scanner);
        Alumno a2 = crearAlumno(scanner);
        Alumno a3 = crearAlumno(scanner);

        // Muestro la información de los alumnos
        System.out.println("");
        a1.mostrarDatos();
        a2.mostrarDatos();
        a3.mostrarDatos();

        scanner.close();// Scanner que cierra
    }
    
}
