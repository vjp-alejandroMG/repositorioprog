/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6_t8;

/**
 *
 * @author alumno
 */
public class Empleado {

    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

   
    // Constructor
    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    // Metodo que calcula el sueldo bruto del empleado
    public double calcularSueldoBruto() {

        // Si trabajó 40 horas o menos se paga la tarifa normal
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        } 
        // Si trabajó mas de 40 horas se pagan horas extra a la tarifa y media
        else {
            int horasExtra = horasTrabajadas - 40;
            return (40 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
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
}
