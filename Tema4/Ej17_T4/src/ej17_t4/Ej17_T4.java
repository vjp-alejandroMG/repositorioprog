/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej17_t4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej17_T4 {

    /**
     * @return 
     */
    // Creo el metodo generar letra aleatoria que genera una letra al azar
     public static char generarLetraAleatoria() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a'); // Genera una letra entre a y z(busque la formula)
    }
     
    
    public static void main(String[] args) {
        char letraGenerada = generarLetraAleatoria(); // declaro la variable letra generada
        Scanner entrada = new Scanner(System.in);
        int intentos = 0;// declaro y inicializo la variable intentos en 0
        char letraUsuario;// declaro la variable letra usuario que es la que nos va a introducir el usuario
        
        // Hago un do while que no para hasta adivinar la letra
        do {
            System.out.print("Introduce una letra minúscula entre 'a' y 'z': ");// Le pido al usuario una letra
            letraUsuario = entrada.nextLine().charAt(0);
            intentos++;
            // Creo un if else que da pista a los usuarios hasta adivinar la letra
            if (letraUsuario < letraGenerada) {
                System.out.println("La letra a adivinar esta despues de " + letraUsuario + "'.");// le da la pista al usuario que la letra esta despues de la introducida
            } else if (letraUsuario > letraGenerada) {
                System.out.println("La letra a adivinar esta antes de " + letraUsuario + "'.");// le da la pista al usuario que la letra esta antes de la introducida
            } else {
                System.out.println("Felicidades, has adivinado la letra " + letraGenerada + " en " + intentos + " intentos.");// Felicita al usuario por adivinar la letra y le dice cual es y el numero de intentos
            }
        } while (letraUsuario != letraGenerada);// termina el bucle
    
    }
}
