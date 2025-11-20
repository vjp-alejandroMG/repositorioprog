/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16_t5;

/**
 *
 * @author alumno
 */
public class Alumno {
    //Creo atributos privados
    private String nombre;
    private int nota;

    // Hago el constructor
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getter y setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("ERROR: La nota debe estar entre 0 y 10. Se asigna -1 por defecto.");
            this.nota = -1; // Valor inválido
        } else {
            this.nota = nota;
        }
    }

    // Creo el mtodo que devuelve la calificacion 
    public String getCalificacion() {
        if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota <= 6) {
            return "Bien";
        } else if (nota <= 8) {
            return "Notable";
        } else if (nota <= 10) {
            return "Sobresaliente";
        } else {
            return "Nota invalida";
        }
    }

    // Creo el metodo para mostrar los datos del alumno
    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Calificacion: " + getCalificacion());
    }
}
