/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej19_t5;

/**
 *
 * @author alumno
 */
public class Empleado {
    // Creo los atributos privados
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    // Hago el constructor
    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    // Calculo del sueldo bruto
    public double calcularSueldoBruto() {
        // Creo un if else dependiendo las horas trabajdas
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        } else {
            int horasExtra = horasTrabajadas - 40;
            return (40 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
    }
}
