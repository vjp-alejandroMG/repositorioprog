/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7_t6;

/**
 *
 * @author alumno
 */

// La clase Radio tambiée implementa la interfaz control remoto
public class Radio implements ControlRemoto {

    // Atributos de la radio
    private boolean encendido;
    private float emisora;
    private int volumen;

    // Constructor lo inicializo por defecto
    public Radio() {
        this.encendido = false;  // Empieza apagada
        this.emisora = 80.0f;    // Emisora predeterminada
        this.volumen = 15;       // Volumen predeterminado
    }

    // Méetodo para mostrar la informacion de la radio
    public void mostrarInfo() {
        System.out.println("ESTADO DE LA RADIO");
        System.out.println("Encendido: " + encendido);
        System.out.println("Emisora: " + emisora);
        System.out.println("Volumen: " + volumen);
        System.out.println("");
    }

    // Metodo para encender la radio
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Radio encendida.");
        }
    }

    // Metodo para apagar la radio
    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Radio apagada.");
        }
    }

    // Metodo para bajar volumen de 5 unidades en 5
    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen -= 5;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    // Metodo para subir volumen de 5 unidades en 5
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    // Metodo para cambiar de emisora
    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            emisora = canal;
            System.out.println("Emisora cambiada a: " + emisora);
        }
    }
}

