/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_t11;

/**
 *
 * @author alumno
 */
public class Conductor {

    // Atributos
    private String dni;
    private String nombre;

    // Constructor
    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    // Getters
    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }
}