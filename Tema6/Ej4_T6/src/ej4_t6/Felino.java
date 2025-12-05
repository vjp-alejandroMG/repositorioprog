/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4_t6;

/**
 *
 * @author alumno
 */
// Clase abstracta que representa a los felinos
public abstract class Felino extends Animal {
     // Constructor que herda de animal
    public Felino(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
}
