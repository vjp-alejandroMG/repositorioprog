/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej17_t7;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Ej17_T7 {

    /**
     * @param args the command line arguments
     */
     // Creo el metodo que crea y devuelve un array de 10 numeros aleatorios entre 0 y 9
    public static int[] crearArray() {
        Random random = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10); // números entre 0 y 9
        }

        return numeros;
    }

    // Creo el metodo que muestra el contenido del array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Metodo que ordena el array de mayor a menor
    public static void ordenarMayorMenor(int[] array) {
        int aux;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Creo el array
        int[] numeros = crearArray();

        // Muestro el array original
        System.out.println("Array original:");
        mostrarArray(numeros);

        // Ordeno el array de mayor a menor
        ordenarMayorMenor(numeros);

        // Muestro el array ordenado
        System.out.println("Array ordenado de mayor a menor:");
        mostrarArray(numeros);
    }    
}
