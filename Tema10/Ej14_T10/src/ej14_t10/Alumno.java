/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14_t10;

/**
 *
 * @author alumno
 */
public class Alumno {

    String nombre;
    Asignatura[] asignaturas;

    // Constructor
    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    // Metodo para calcular la media del alumno
    public float calcularMedia() {

        float suma = 0;

        for (int i = 0; i < asignaturas.length; i++) {
            suma += asignaturas[i].nota;
        }

        return suma / asignaturas.length;
    }

}
