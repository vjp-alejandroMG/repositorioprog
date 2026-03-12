/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15_t10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej15_T10 {

    /**
     * @param args the command line arguments
     */
      
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Empresa> listaEmpresas = new ArrayList<>();


    // Metodo que muestra el menu del programa
    public static void menu() {

        System.out.println("1. Introducir empresas y empleados");
        System.out.println("2. Mostrar empresas y empleados");
        System.out.println("3. Mostrar empleados con letra A");
        System.out.println("4. Mostrar empleados ordenados por sueldo");
        System.out.println("5. Salir");
    }


    // Opcion 1 Introducir empresas y sus empleados
    public static void introducirEmpresas() {

        String continuarEmpresa;

        // Bucle para seguir introduciendo empresas
        do {

            System.out.print("Nombre de la empresa: ");
            String nombreEmpresa = sc.nextLine();

            // Creo la empresa
            Empresa empresa = new Empresa(nombreEmpresa);

            String continuarEmpleado;

            // Bucle para introducir empleados en esa empresa
            do {

                System.out.print("Nombre del empleado: ");
                String nombreEmpleado = sc.nextLine();

                System.out.print("Sueldo: ");
                int sueldo = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                // Añado el empleado a la lista de la empresa
                empresa.listaEmpleados.add(new Empleado(nombreEmpleado, sueldo));

                System.out.print("Quires añadir mas empleados? ");
                continuarEmpleado = sc.nextLine();

            } while (continuarEmpleado.equalsIgnoreCase("si"));

            // Añado la empresa a la lista general
            listaEmpresas.add(empresa);

            System.out.print("Quieres añadir mas empresas? ");
            continuarEmpresa = sc.nextLine();

        } while (continuarEmpresa.equalsIgnoreCase("si"));
    }


    // Opcion 2 Mostrar todas las empresas y sus empleados
    public static void mostrarEmpresas() {

        // Recorro la lista de empresas
        for (Empresa e : listaEmpresas) {

            System.out.println("Empresa: " + e.nombreEmpresa + " **");

            int contador = 1;

            // Recorro los empleados de esa empresa
            for (Empleado emp : e.listaEmpleados) {

                System.out.println("Empleado " + contador + ": " + emp.nombreEmpleado);
                System.out.println("Sueldo: " + emp.sueldo);

                contador++;
            }
        }
    }


    // Opcion 3 Mostrar empleados cuyo nombre contenga la letra A
    public static void empleadosConA() {

        // Recorro todas las empresas
        for (Empresa e : listaEmpresas) {

            // Recorro los empleados de cada empresa
            for (Empleado emp : e.listaEmpleados) {

                // Convierto el nombre a mayusculas y comprobamos si contiene la letra A
                if (emp.nombreEmpleado.toUpperCase().contains("A")) {

                    System.out.print(emp.nombreEmpleado + " - ");
                }
            }
        }

        System.out.println();
    }


    // Opcion 4 Mostrar empleados ordenados por sueldo
    public static void empleadosOrdenados() {

        // Lista donde guardo todos los empleados
        ArrayList<Empleado> todos = new ArrayList<>();

        // Añado todos los empleados de todas las empresas
        for (Empresa e : listaEmpresas) {
            todos.addAll(e.listaEmpleados);
        }

        // Ordeno la lista por sueldo de mayor a menor
        Collections.sort(todos, new Comparator<Empleado>() {

            public int compare(Empleado e1, Empleado e2) {

                return e2.sueldo - e1.sueldo;
            }
        });

        // Muestro la lista ordenada
        for (Empleado emp : todos) {

            System.out.println(emp.nombreEmpleado + " - " + emp.sueldo);
        }
    }


    public static void main(String[] args) {

        int opcion;

        // El menu se repetira hasta que el usuario pulse 5
        do {

            menu();

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    introducirEmpresas();
                    break;

                case 2:
                    mostrarEmpresas();
                    break;

                case 3:
                    empleadosConA();
                    break;

                case 4:
                    empleadosOrdenados();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");

            }

        } while (opcion != 5);
    }
}
