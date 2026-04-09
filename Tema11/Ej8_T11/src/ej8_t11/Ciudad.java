/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8_t11;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */

public class Ciudad {

    // Atributos
    private String nombre;
    private ArrayList<Sede> sedes;

    // Constructor
    public Ciudad(String nombre) {
        this.nombre = nombre;
        sedes = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Sede> getSedes() {
        return sedes;
    }

    // Añado una sede
    public void anadirSede(Sede s) {
        sedes.add(s);
    }
}
