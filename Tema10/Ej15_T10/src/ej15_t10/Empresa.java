/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15_t10;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */


public class Empresa {

    String nombreEmpresa;
    ArrayList<Empleado> listaEmpleados;

    // Constructor
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        listaEmpleados = new ArrayList<>();
    }

}
