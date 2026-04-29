/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13_t12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ej13_T12 {

    /**
     * @param args the command line arguments
     */
    
    // Metodo para guardar los datos en el fichero
    public static void guardarDatos(Scanner sc) throws IOException {

        try {
            System.out.print("Introduce nombre y apellido: ");
            String nombre = sc.nextLine();

            // Valido el sexo (H o M)
            String sexo;
            do {
                System.out.print("Introduce sexo (H/M): ");
                sexo = sc.nextLine().toUpperCase();
            } while (!sexo.equals("H") && !sexo.equals("M"));

            // Valido la edad (20-60)
            int edad;
            do {
                System.out.print("Introduce edad (20-60): ");
                edad = Integer.parseInt(sc.nextLine());
            } while (edad < 20 || edad > 60);

            // Valido el numero de suspensos (0-4)
            int suspensos;
            do {
                System.out.print("Introduce numero de suspensos (0-4): ");
                suspensos = Integer.parseInt(sc.nextLine());
            } while (suspensos < 0 || suspensos > 4);

            // Valido la residencia (SI o NO)
            String residencia;
            do {
                System.out.print("Residencia familiar (SI/NO): ");
                residencia = sc.nextLine().toUpperCase();
            } while (!residencia.equals("SI") && !residencia.equals("NO"));

            // Ingresos familiares
            double ingresos;
            do {
                System.out.print("Introduce ingresos anuales: ");
                ingresos = Double.parseDouble(sc.nextLine());
            } while (ingresos < 0);

            // Abro el fichero
            FileWriter fw = new FileWriter("DatosBeca.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Guardo los datos en una linea
            bw.write(nombre + " - " + sexo + " - " + edad + " - " + suspensos + " - " + residencia + " - " + ingresos);
            bw.newLine();

            bw.close();

            System.out.println("Datos guardados correctamente");

        } catch (NumberFormatException e) {
            // Error si se introducen numeros incorrectos
            System.out.println("Error en los datos numericos");

        } catch (IOException e) {
            // Error de escritura en fichero
            System.out.println("Error al guardar en el fichero");
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String opcion;

        // Bucle para permitir varios becarios
        do {
            guardarDatos(sc);

            System.out.print("Quieres introducir otro becario? (SI/NO): ");
            opcion = sc.nextLine().toUpperCase();

        } while (opcion.equals("SI"));
    }
}
