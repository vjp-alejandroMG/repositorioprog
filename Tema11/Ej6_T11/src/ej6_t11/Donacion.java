/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6_t11;

/**
 *
 * @author alumno
 */
public class Donacion {

    // Atributos
    private String nombre;
    private double cantidad;

    // Constructor
    public Donacion(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getCantidad() {
        return cantidad;
    }

    // To string
    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
}

