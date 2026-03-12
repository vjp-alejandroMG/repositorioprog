/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej5_T10 {

    /**
     * @param args the command line arguments
     */
    
     // Creo el metodo que lee numeros enteros y los guarda en una lista
    public static ArrayList<Integer> leerNumeros() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        String continuar;

        // Se repite mientras el usuario quiera seguir introduciendo numeros
        do {
            System.out.print("Introduce un numero entero: ");
            int num = sc.nextInt(); // leemos el número
            lista.add(num); // lo añado a la lista

            System.out.print("Quieres introducir otro numero? (si/no): ");
            continuar = sc.next(); // compruebo si quiere continuar

        } while (continuar.equalsIgnoreCase("si"));

        return lista; // devuelvo la lista con los numeros
    }

    // Metodo que muestra todos los elementos de la lista
    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Lista:");

        // Recorro la lista mostrando cada numero
        for (int num : lista) {
            System.out.print(num + " ");
        }

    }

    // Metodo que busca el mayor numero par de la lista
    public static int obtenerMayorPar(ArrayList<Integer> lista) {

        // Inicializo con el valor minimo posible
        int mayorPar = Integer.MIN_VALUE;

        // Recorro la lista
        for (int num : lista) {

            // Compruebo si el numero es par y mayor que el guardado
            if (num % 2 == 0 && num > mayorPar) {
                mayorPar = num;
            }
        }

        return mayorPar; // devuelvo el mayor numero par
    }

    // Metodo que busca el menor numero impar de la lista
    public static int obtenerMenorImpar(ArrayList<Integer> lista) {

        // Inicializo con el valor maximo posible
        int menorImpar = Integer.MAX_VALUE;

        // Recorro la lista
        for (int num : lista) {

            // Compruebo si es impar y menor que el guardado
            if (num % 2 != 0 && num < menorImpar) {
                menorImpar = num;
            }
        }

        return menorImpar; // devuelvo el menor numero impar
    }

    // Metodo que intercambia las posiciones del mayor par y el menor impar
    public static void intercambiar(ArrayList<Integer> lista, int par, int impar) {

        // Busco las posiciones de los numeros en la lista
        int posPar = lista.indexOf(par);
        int posImpar = lista.indexOf(impar);

        // Si los dos existen en la lista realizamos el intercambio
        if (posPar != -1 && posImpar != -1) {
            lista.set(posPar, impar); // pongo el impar donde estaba el par
            lista.set(posImpar, par); // pongo el par donde estaba el impar
        }
    }

    public static void main(String[] args) {

        // Creo la lista leyendo los numeros introducidos por el usuario
        ArrayList<Integer> lista = leerNumeros();

        // Muestro la lista inicial
        mostrarLista(lista);

        // Calculo el mayor numero par
        int mayorPar = obtenerMayorPar(lista);

        // Calculo el menor impar
        int menorImpar = obtenerMenorImpar(lista);

        // Muestro los resultados
        System.out.println("Mayor numero par: " + mayorPar);
        System.out.println("Menor numero impar: " + menorImpar);

        // Intercambio sus posiciones en la lista
        intercambiar(lista, mayorPar, menorImpar);

        // Muestro la lista despues del intercambio
        System.out.println("Lista despues del intercambio:");
        mostrarLista(lista);
    }
}
