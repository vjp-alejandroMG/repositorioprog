/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24_t5;

/**
 *
 * @author alumno
 */
public class Producto {
    // Creo los atributos privados
    private String fechaCaducidad;
    private String numeroLote;

    // Creo el constructor
    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    // Getters y setters
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    // Metodo para mostrar informacion del rpoducto
    public void mostrarInfo() {
        System.out.println("Fecha caducidad: " + fechaCaducidad);
        System.out.println("Numero de lote: " + numeroLote);
    }
}
