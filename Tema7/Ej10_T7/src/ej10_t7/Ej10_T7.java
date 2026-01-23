/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10_t7;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Ej10_T7 {

    /**
     * @param args the command line arguments
     */
    
    //Creo el metodo que llena el vector con numeros aleatorios del 1 al 8
    public static void rellenarVector(int[] vector){
       for(int i = 0; i < vector.length; i++){
           double aleatorio = Math.floor(Math.random() * 8 + 1);
           vector[i] = (int) aleatorio;
       } 
    }
    //Creo el metodo que muestra el vector
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        } 
    }
    //Metodo que sustiye los numeros repetidos por cero
    public static void sustituirRepetidos(int[] vector){
        boolean repetido = false;
        for(int i = 0; i < vector.length; i++){
            for(int j = i + 1; j < vector.length; j++){
                if (vector[i] == vector[j]){
                    vector[j] = 0;
                    repetido = true;
                }
            }
            if(repetido){
                vector[i] = 0;
                repetido = false;
            }
        }
    }
    public static void main(String[] args) {

        int[] numeros = new int[10];
        //Lleno el vector y lo mostramos
        rellenarVector(numeros);
        System.out.println("Se han generado los siguientes numeros:");
        mostrarVector(numeros);
        //Sustituyo los repetidos por 0 y lo muestro
        sustituirRepetidos(numeros);
        System.out.println("Sustituimos los elementos repetidos por un 0:");
        mostrarVector(numeros);
    }
}

