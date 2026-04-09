/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8_t11;

/**
 *
 * @author alumno
 */

public class Sede {
    
    // Atributos
    private String nombre;
    private double ingresos;

    // Constructor
    public Sede(String nombre, double ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    // To String
    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresos=" + ingresos + '}';
    }
   
}
