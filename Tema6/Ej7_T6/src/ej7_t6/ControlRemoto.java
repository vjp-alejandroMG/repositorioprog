/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ej7_t6;

/**
 *
 * @author alumno
 */
// Creo la interfaz que define lo que hacen los dispositivo con control remoto
public interface ControlRemoto {

    // Metodo para encender el dispositivo
    void encender();

    // Metodo para apagar el dispositivo
    void apagar();

    // Metodo para bajar el volumen
    void bajarVolumen();

    // Metodo para subir el volumen
    void subirVolumen();

    // Metodo para cambiar de canal o emisora de radio
    void cambiarCanal(float canal);
}
