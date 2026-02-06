/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11_12_t8;

/**
 *
 * @author alumno
 */
public class Mueble {

    // Atributos
    private double precio;
    private String descripcion;

    // Constructor por defecto
    public Mueble() {
        this.precio = 0;
        this.descripcion = "Sin descripción";
    }

    // Constructor parametrizado
    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  

    // Metodo para mostrar la informacion del mueble
    public void mostrarInfo() {
        System.out.println("Descripción: " + descripcion + " | Precio: " + precio + " €");
    }
}

