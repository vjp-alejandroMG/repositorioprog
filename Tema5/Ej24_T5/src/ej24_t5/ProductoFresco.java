/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24_t5;

/**
 *
 * @author alumno
 */
public class ProductoFresco extends Producto{
    // Creo los atributos privados
    private String fechaEnvasado;
    private String paisOrigen;

    // Constructor
    public ProductoFresco(String fechaCaducidad, String numeroLote,
                          String fechaEnvasado, String paisOrigen) {

        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    // Getters y setters
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    // Muestro informacion del producto
    public void mostrarInfo() {
        System.out.println("Producto Fresco");
        super.mostrarInfo();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Pais de origen: " + paisOrigen);
    }
    
}
