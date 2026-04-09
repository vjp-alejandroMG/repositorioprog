/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_t11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
     // Creo el vector de 6 posiciones para los autobuses
    static Autobus[] darsenas = new Autobus[6];

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        // Menu
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Aparcar autobus");
            System.out.println("2. Mostrar darsenas libres");
            System.out.println("3. Buscar autobus");
            System.out.println("4. Buscar conductor");
            System.out.println("5. Autobus con mas conductores");
            System.out.println("6. Salir");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    aparcar();
                    break;
                case 2:
                    mostrarLibres();
                    break;
                case 3:
                    buscarAutobus();
                    break;
                case 4:
                    buscarConductor();
                    break;
                case 5:
                    autobusConMasConductores();
                    break;
                case 6 :
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("El valor introducido es incorrecto");
            }

        } while (opcion != 6);
    }

    // Metodo para aparcar un autobus
    public static void aparcar() {

        int pos;

        // Pido la posicion hasta que sea valida y este libre
        do {
            System.out.print("Posicion (0-5): ");
            pos = sc.nextInt();
        } while (pos < 0 || pos >= 6 || darsenas[pos] != null);

        sc.nextLine();

        // Pido la matricula
        System.out.print("Matricula: ");
        String matricula = sc.nextLine();

        // Creo el autobus
        Autobus bus = new Autobus(matricula);

        // Pido numero de conductores
        System.out.print("Numero de conductores: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Introduzco los conductores
        for (int i = 0; i < n; i++) {
            System.out.print("DNI: ");
            String dni = sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            // Añado el conductor al autobus
            bus.agregarConductor(new Conductor(dni, nombre));
        }

        // Guardo el autobus en la posicion elegida
        darsenas[pos] = bus;

        System.out.println("Autobus aparcado.");
    }

    // Metodo para mostrar darsenas libres
    public static void mostrarLibres() {
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) {
                System.out.println("Darsena " + i + " libre");
            }
        }
    }

    // Metodo para buscar autobuús por matricula
    public static void buscarAutobus() {

        System.out.print("Matricula: ");
        String mat = sc.nextLine();

        // Recorro el array
        for (Autobus b : darsenas) {
            if (b != null && b.getMatricula().equals(mat)) {

                System.out.println("Autobus encontrado:");
                System.out.println("Matricula: " + b.getMatricula());

                // Mostramos conductores
                for (Conductor c : b.getConductores().values()) {
                    System.out.println(c.getNombre() + " - " + c.getDni());
                }
                return;
            }
        }

        System.out.println("No encontrado.");
    }

    // Metodo para buscar un conductor por DNI
    public static void buscarConductor() {

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        // Recorro todos los autobuses
        for (Autobus b : darsenas) {
            if (b != null && b.getConductores().containsKey(dni)) {

                System.out.println("Esta en el autobus: " + b.getMatricula());
                return;
            }
        }

        System.out.println("Conductor no encontrado.");
    }

    // Metodo que devuelve la posicion del autobus con mas conductores
    public static void autobusConMasConductores() {

        int max = -1;
        int posicion = -1;

        // Recorro el array
        for (int i = 0; i < darsenas.length; i++) {

            if (darsenas[i] != null) {

                int numConductores = darsenas[i].getConductores().size();

                // Comparo
                if (numConductores > max) {
                    max = numConductores;
                    posicion = i;
                }
            }
        }

        // Muestro el resultado
        if (posicion != -1) {
            System.out.println("Mayor numero de conductores en posicion: " + posicion);
        } else {
            System.out.println("No hay autobuses.");
        }
    }
}
