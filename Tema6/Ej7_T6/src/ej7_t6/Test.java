/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7_t6;

/**
 *
 * @author alumno
 */

// Clase prueba donde se pruebo la television y la radio
public class Test {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        // Prueba de la tele
        Televisor tv = new Televisor();  // Se crea la television

        tv.encender();   // Se enciende
        tv.mostrarInfo(); // Se muestran los datos

        // Subo el volumen 3 veces
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();

        System.out.println("Volumen final de la tele mostrado arriba.");

        // Cambiar de canal
        tv.cambiarCanal(5);

        // Bajar el volumen 1 vez
        tv.bajarVolumen();

        // Apagar la tele
        tv.apagar();
        
        System.out.println("");
        
        // Mostrar informacion final
        tv.mostrarInfo();
        
        System.out.println("");
        
        // Prueba de la radio
        Radio radio = new Radio(); // Creo la radio

        radio.encender();  // Encender radio
        radio.mostrarInfo(); // Mostrar datos

        // Subir el volumen 3 veces
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();

        System.out.println("Volumen final de la Radio mostrado arriba.");

        // Cambiar emisora
        radio.cambiarCanal(102.5f);

        // Bajar volumen
        radio.bajarVolumen();
        radio.bajarVolumen();

        // Apagar radio
        radio.apagar();

        System.out.println("");
        
        // Mostrar informacion final
        radio.mostrarInfo();
    }
}

