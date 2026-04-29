/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_t12;

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
public class Ej6_T12 {

    /**
     * @param args the command line arguments
     */
    
    static String nombreFichero = "";

    // Metodo para guardar los 100 primeros numeros pares en un fichero
    public static void guardarPares(Scanner sc) {

        try {
            System.out.print("Introduce el nombre del fichero: ");
            nombreFichero = sc.nextLine();

            FileWriter fw = new FileWriter(nombreFichero);
            BufferedWriter bw = new BufferedWriter(fw);

            // Array con los 100 primeros numeros pares
            int[] pares = new int[100];

            for (int i = 0; i < 100; i++) {
                pares[i] = (i + 1) * 2;
            }

            // Escribo los numeros en el fichero
            for (int num : pares) {
                bw.write(String.valueOf(num));
                bw.newLine();
            }

            bw.close();

            System.out.println("Numeros guardados correctamente");

        } catch (IOException e) {
            // Error al escribir en el fichero
            System.out.println("Error al guardar en el fichero");
        }
    }

    // Metodo para mostrar el contenido del fichero
    public static void mostrarFichero() {

        if (nombreFichero.equals("")) {
            // Si no se ha creado aun
            System.out.println("Primero debes crear el fichero");
            return;
        }

        try {
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            System.out.println("\n--- CONTENIDO DEL FICHERO ---");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {
            // Error si el fichero no existe
            System.out.println("El fichero no existe");

        } catch (IOException e) {
            // Error de lectura
            System.out.println("Error al leer el fichero");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // Menu
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Guardar numeros pares en fichero");
            System.out.println("2. Mostrar fichero");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            
                switch (opcion) {

                    case 1:
                        guardarPares(sc);
                        break;

                    case 2:
                        mostrarFichero();
                        break;

                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                }        
        } while (opcion != 3);
    }
}
