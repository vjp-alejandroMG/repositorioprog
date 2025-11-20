/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej19_t5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param scanner
     * @return 
     */
    
        
    // Creo el metodo para crear un empleado pidiendole los datos
    public static Empleado crearEmpleado(Scanner scanner) {
        scanner.nextLine(); // limpio el bufer

        System.out.print("Introduce el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce las horas trabajadas: ");
        int horas = scanner.nextInt();

        System.out.print("Introduce la tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        return Empleado(nombre, horas, tarifa);
    }

    // Método para mostrar sueldo
    public static void mostrarSueldoEmpleado(Empleado emp) {
        System.out.println(emp.getNombre() + " trabajo " + emp.getHorasTrabajadas() +
                " horas, y cobra " + emp.getTarifaHora() + " €/h, asi que su sueldo es: " +
                emp.calcularSueldoBruto() + " euros");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creao 3 empleados
        Empleado e1 = crearEmpleado(scanner);
        Empleado e2 = crearEmpleado(scanner);
        Empleado e3 = crearEmpleado(scanner);

        System.out.println("\nSUELDOS DE LOS EMPLEADOS");
        
        // Muestro sueldos
        mostrarSueldoEmpleado(e1);
        mostrarSueldoEmpleado(e2);
        mostrarSueldoEmpleado(e3);

        scanner.close();
    
    }
    // Se me genera solo por el return del metodo empleado
    private static Empleado Empleado(String nombre, int horas, double tarifa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
