/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4_t6;

/**
 *
 * @author alumno
 */
// Creo la clase raiz abstracta que representa a cualquier animal
public abstract class Animal {

    // Hago los atributos comunes a todos los animales
    protected String nombre;
    protected int edad;
    protected double peso;

    // Creo el constructor para inicializar los atributos
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Metodos abstractos que luego las subclases deben implementar
    public abstract void mostrarSonido();
    public abstract void mostrarAlimentacion();
    public abstract void mostrarHabitat();
    public abstract void mostrarNombreCientifico();

    // Metodo comun a todos los animales para mostrar sus datos basicos de cada uno
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
    }
}
