/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4_t6;

/**
 *
 * @author alumno
 */
// La clase gato es un felino
public class Gato extends Felino {

    // Constructor de Gato
    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    // Implemento los metodos abstractos
    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Maullido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Ratones");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: Domestico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre cientifico: Felis silvestris catus");
    }
}

