/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4_t6;

/**
 *
 * @author alumno
 */
// Clase abstracta que representa a todos los animales canidos y que hereda de animal
public abstract class Canido extends Animal {
    
     // Constructor que llama al constructor de animal
    public Canido(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
}

