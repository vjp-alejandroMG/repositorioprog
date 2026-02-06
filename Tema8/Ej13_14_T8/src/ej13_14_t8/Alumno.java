/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13_14_t8;

/**
 *
 * @author alumno
 */
// Clase que representa a un alumno
public class Alumno {

    // Atributos del alumo
    private String nombre;
    private int edad;
    private double notaMedia;

    // Constructor por defecto
    public Alumno() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.notaMedia = 0;
    }

    // Constructor parametrizado
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Metodo para mostrar los datos del alumno
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + 
                           " | Edad: " + edad + 
                           " | Nota media: " + notaMedia);
    }
}

