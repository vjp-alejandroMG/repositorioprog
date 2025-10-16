/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej16_t3;

/**
 *
 * @author alumno
 */
public class Ej16_T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contadorImpares = 0; // Declaro la variable para contar los numeros impares
        
        // Hago el bucle que recorre los numeros desde 20 hasta 160
        for (int numero = 21; numero <= 160; numero += 2) {
            System.out.println(numero); // Imprime el numero impar actual
            contadorImpares++; // Incrementa el contador de impares hasta 160
        }
        
        // Imprimo cuantos numeros impares hay
        System.out.println("Cantidad de numeros impares entre 20 y 160: " + contadorImpares);
    }
    
}
