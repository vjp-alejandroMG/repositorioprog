/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15_t5;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Creo 3 direcciones
        Direccion d1 = new Direccion("Calle del Sol", 1, "3A", "Plasencia");
        Direccion d2 = new Direccion("Gran Via", 22, "1B", "Madrid");
        Direccion d3 = new Direccion("Avenida Portugal", 10, "2C", "Salamanca");

        // Creo 3 empleados
        Empleado e1 = new Empleado("Juan Perez Sanchez", 1500, d1);
        Empleado e2 = new Empleado("Ana Lopez Martin", 3800, d2);
        Empleado e3 = new Empleado("Carlos Ruiz Gonzalez", 2700, d3);

        // Muestro los datos del empleado
        System.out.println("EMPLEADO 1:");
        e1.mostrarDatos();

        System.out.println("EMPLEADO 2:");
        e2.mostrarDatos();

        System.out.println("EMPLEADO 3:");
        e3.mostrarDatos();
    }
    
}
