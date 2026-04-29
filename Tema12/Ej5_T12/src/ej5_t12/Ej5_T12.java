/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_t12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ej5_T12 {

    /**
     * @param args the command line arguments
     */
    
   // Metodo para anadir un contacto al fichero
    public static void anadirContacto(Scanner sc) throws IOException {

        try {
            System.out.print("Introduce nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Introduce edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.print("Introduce telefono: ");
            String telefono = sc.nextLine();

            // Abro el fichero 
            FileWriter fw = new FileWriter("agenda.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Ecbribo el contacto en una linea
            bw.write(nombre + " - " + edad + " - " + telefono);
            bw.newLine();

            bw.close();

            System.out.println("Contacto guardado correctamente");

        } catch (NumberFormatException e) {
            // Error si la edad no es numero
            System.out.println("La edad debe ser un numero");

        } catch (IOException e) {
            // Error de escritura en el fichero
            System.out.println("Error al guardar el contacto");
        }
    }

    // Metodo para mostrar los contactos del fichero
    public static void mostrarContactos() {

        try {
            FileReader fr = new FileReader("agenda.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;

            System.out.println("\n--- CONTACTOS ---");

            // Leo todas las lineas del fichero
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {
            // Error si el fichero no existe
            System.out.println("El fichero no existe aun");

        } catch (IOException e) {
            // Error de lectura
            System.out.println("Error al leer el fichero");
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // Menu
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Anadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        anadirContacto(sc);
                        break;

                    case 2:
                        mostrarContactos();
                        break;

                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un numero valido");
            }

        } while (opcion != 3);
    }
}
