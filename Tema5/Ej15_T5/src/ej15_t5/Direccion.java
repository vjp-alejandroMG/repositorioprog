/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15_t5;

/**
 *
 * @author alumno
 */
public class Direccion {
    // Creo atributos privados
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;

    // Constructor para inicializar todos los atributos
    public Direccion(String calle, int numero, String piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }

    
    // Getters y setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
}
