/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24_t5;

/**
 *
 * @author alumno
 */
public class ProductoCongelado extends Producto{
    // Creo un atributo privado
    private double temperaturaCongelacion;

    // Constructor
    public ProductoCongelado(String fechaCaducidad, String numeroLote, double temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }
    // Get y Set
    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    // Muestro informacion del producto
    public void mostrarInfo() {
        System.out.println("Producto Congelado");
        super.mostrarInfo();
        System.out.println("Temperatura recomendada: " + temperaturaCongelacion + "ºC");
    }
}
