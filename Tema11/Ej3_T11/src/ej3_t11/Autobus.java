/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_t11;

import java.util.HashMap;

/**
 *
 * @author alumno
 */
public class Autobus {
    
    // Atributo
    private String matricula; 

    // HashMap
    private HashMap<String, Conductor> conductores;

    // Constructor
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public HashMap<String, Conductor> getConductores() {
        return conductores;
    }

    // Metodo para añadir un conductor al HashMap
    public void agregarConductor(Conductor c) {
        conductores.put(c.getDni(), c);
    }
}