/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8_t11;

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creo la lista de ciudades
        ArrayList<Ciudad> ciudades = new ArrayList<>();

        int opcion;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Anadir ciudad");
            System.out.println("2. Mostrar ciudades");
            System.out.println("3. Sedes por encima de la media");
            System.out.println("4. Buscar sede");
            System.out.println("5. Anadir sede");
            System.out.println("6. Sedes ordenadas");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    // Añado ciudad con al menos una sede
                    System.out.print("Nombre ciudad: ");
                    String nombreCiudad = sc.nextLine();

                    Ciudad c = new Ciudad(nombreCiudad);

                    String seguir;

                    do {
                        // Pido datos de sede
                        System.out.print("Nombre sede: ");
                        String nombreSede = sc.nextLine();

                        System.out.print("Ingresos: ");
                        double ingresos = sc.nextDouble();
                        sc.nextLine();

                        c.anadirSede(new Sede(nombreSede, ingresos));

                        System.out.print("Seguir añadiendo sedes (s/n): ");
                        seguir = sc.nextLine();

                    } while (seguir.equalsIgnoreCase("s"));

                    ciudades.add(c);
                    break;

                case 2:
                    // Muestro todas las ciudades con sus sedes
                    for (Ciudad ciudad : ciudades) {
                        System.out.println("Ciudad: " + ciudad.getNombre());

                        for (Sede s : ciudad.getSedes()) {
                            System.out.println("  " + s);
                        }
                    }
                    break;

                case 3:
                    // Calculo la media de ingresos
                    double total = 0;
                    int contador = 0;

                    for (Ciudad ciudad : ciudades) {
                        for (Sede s : ciudad.getSedes()) {
                            total += s.getIngresos();
                            contador++;
                        }
                    }

                    if (contador > 0) {
                        double media = total / contador;

                        // Muestro las sedes por encima de la media
                        for (Ciudad ciudad : ciudades) {
                            for (Sede s : ciudad.getSedes()) {
                                if (s.getIngresos() > media) {
                                    System.out.println(s.getNombre());
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    // Busco una sede
                    System.out.print("Nombre sede: ");
                    String buscada = sc.nextLine();

                    boolean encontrada = false;

                    for (Ciudad ciudad : ciudades) {
                        for (Sede s : ciudad.getSedes()) {
                            if (s.getNombre().equals(buscada)) {
                                encontrada = true;
                            }
                        }
                    }

                    System.out.println(encontrada);
                    break;

                case 5:
                    // Añado una sede a una ciudad existente
                    System.out.print("Nombre ciudad: ");
                    String nc = sc.nextLine();

                    boolean existe = false;

                    for (Ciudad ciudad : ciudades) {
                        if (ciudad.getNombre().equals(nc)) {

                            existe = true;

                            System.out.print("Nombre sede: ");
                            String ns = sc.nextLine();

                            System.out.print("Ingresos: ");
                            double ing = sc.nextDouble();
                            sc.nextLine();

                            ciudad.anadirSede(new Sede(ns, ing));
                        }
                    }

                    if (!existe) {
                        System.out.println("Ciudad no encontrada");
                    }
                    break;

                case 6:
                    // Creo una lista ordenada de sedes
                    ArrayList<Sede> ordenadas = new ArrayList<>();

                    for (Ciudad ciudad : ciudades) {
                        for (Sede s : ciudad.getSedes()) {

                            int i = ordenadas.size() - 1;

                            ordenadas.add(null);

                            while (i >= 0 && ordenadas.get(i).getIngresos() < s.getIngresos()) {
                                ordenadas.set(i + 1, ordenadas.get(i));
                                i--;
                            }

                            ordenadas.set(i + 1, s);
                        }
                    }

                    // Muestro la sede
                    for (Sede s : ordenadas) {
                        System.out.println(s);
                    }
                    break;

            }

        } while (opcion != 7);
    }
}
