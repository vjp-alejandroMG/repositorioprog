/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_t8;

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

        // Creo el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Pido al usuario el numero de empleados
        System.out.print("¿Cuántos empleados desea introducir? ");
        int numEmpleados = sc.nextInt();
        sc.nextLine(); 

        // Creo un array de empleados con el tamaño indicado
        Empleado[] empleados = new Empleado[numEmpleados];

        // Hago un bucle para introducir los datos de cada empleado
        for (int i = 0; i < numEmpleados; i++) {

            System.out.println("\n- EMPLEADO " + (i + 1) + " -");

            // Pido el nombre
            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = sc.nextLine();

            // Pido las horas trabajadas
            System.out.print("¿Cuántas horas trabajó este mes? ");
            int horas = sc.nextInt();

            // Pido la tarifa por hora
            System.out.print("¿Cuál es su tarifa por hora de trabajo? ");
            double tarifa = sc.nextDouble();
            sc.nextLine(); // Limpiamos el buffer

            // Creo el objeto empleado y lo guardo en el array
            empleados[i] = new Empleado(nombre, horas, tarifa);

            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON ÉXITO");
        }

        // Muestro el sueldo bruto de cada empleado
        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS");

        for (Empleado e : empleados) {
            System.out.println(
                e.getNombre() + " trabajó " + e.getHorasTrabajadas() +
                " horas, cobra " + e.getTarifaHora() +
                " euros la hora por lo que le corresponde un sueldo de " +
                e.calcularSueldoBruto() + " euros."
            );
        }
        sc.close();
    }
}

