/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6_t11;

/**
 *
 * @author alumno
 */
public class Campania {

    // Atributos
    private String nombre;
    private Donacion[] donaciones;
    private int contador;

    // Constructor
    public Campania(String nombre) {
        this.nombre = nombre;
        donaciones = new Donacion[100]; // tamaño maximo
        contador = 0;
    }

    // Añado una donacion de mayor a menor
    public void anadirDonacion(Donacion d) {

        // busco la posicion donde insertar
        int i = contador - 1;

        // desplazo elementos hacia la derecha
        while (i >= 0 && donaciones[i].getCantidad() < d.getCantidad()) {
            donaciones[i + 1] = donaciones[i];
            i--;
        }

        // inserto la donacion
        donaciones[i + 1] = d;
        contador++;
    }

    // Muestro todas las donaciones
    public void mostrarDonaciones() {
        for (int i = 0; i < contador; i++) {
            System.out.println(donaciones[i]);
        }
    }

    // Muestro las donaciones por nombre
    public void mostrarPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (donaciones[i].getNombre().equals(nombre)) {
                System.out.println(donaciones[i]);
            }
        }
    }

    // Devuelvo el numero de donaciones
    public int numeroDonaciones() {
        return contador;
    }

    // Calculo el total recaudado
    public double totalRecaudado() {
        double total = 0;

        for (int i = 0; i < contador; i++) {
            total += donaciones[i].getCantidad();
        }

        return total;
    }
}
