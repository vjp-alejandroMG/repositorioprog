/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7_t6;

/**
 *
 * @author alumno
 */
// La clase Televisor implementa la interfaz control remoto
public class Televisor implements ControlRemoto {

    // Creo los atributos del televisor
    private boolean encendido;
    private int canal;
    private int volumen;

    // Constructor que inicializa el televisor apagado, el canal y  el volumen 
    public Televisor() {
        this.encendido = false; // La tele empieza apagada
        this.canal = 1;         // Canal inicial
        this.volumen = 10;      // Volumen inicial
    }

    // Metodo para mostrar toda la informacion del televisor
    public void mostrarInfo() {
        System.out.println("ESTADO DEL TELEVISOR");
        System.out.println("Encendido: " + encendido);
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("");
    }

    // Metodo para encender la tele
    @Override
    public void encender() {
        // Solo se enciende si esta apagada
        if (!encendido) {
            encendido = true;
            System.out.println("Television encendida. Canal actual: " + canal);
        }
    }

    // Metodo para apagar la TV
    @Override
    public void apagar() {
        // Solo muestra el mensaje si esta encendida
        if (encendido) {
            System.out.println("La tele se apagara en 10 segundos...");
            encendido = false;
        }
    }

    // Metodo para bajar volumen
    @Override
    public void bajarVolumen() {
        if (encendido) {     // Solo podemos bajar volumen si esta encendida
            volumen--;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    // Metodo para subir volumen
    @Override
    public void subirVolumen() {
        if (encendido) {    // igual que bajar volumen
            volumen++;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    // Metodo para cambiar canal
    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal; // Se convierte a int porque las televisiones usan canales con numeros enteros
            System.out.println("Canal cambiado a: " + this.canal);
        }
    }
}

