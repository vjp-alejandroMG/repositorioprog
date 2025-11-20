/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15_t5;

/**
 *
 * @author alumno
 */
public class Empleado {
    // Creo atributos privados
    private String nombre;
    private int salario;
    private Direccion direccion;// Relación con la clase Dirección

    // Constructor para inicializar los atributos
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    
    // Metodo que muestra los datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Direccion:");
        System.out.println("  Calle: " + direccion.getCalle());
        System.out.println("  Numero: " + direccion.getNumero());
        System.out.println("  Puerta: " + direccion.getPiso());
        System.out.println("  Ciudad: " + direccion.getCiudad());
    }
}
