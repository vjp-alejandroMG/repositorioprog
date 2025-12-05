/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4_t6;

/**
 *
 * @author alumno
 */
// La clase perro es un tipo de canido
public class Perro extends Canido {

    // Constructor del perro
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    // Implemento los metodos abstractos de animal
    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Ladrido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Carnivora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: Domestico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre cientifico: Canis lupus");
    }

}
