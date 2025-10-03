/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej32_t2;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ej32_T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         // Declaro variables
         int cantidad;
         int importeOriginal;
         int billetes50;
         int billetes20;
         int billetes10;
         int billetes5;
         int monedas2;
         int monedas1;
         
         
         
        // Solicitar al usuario la cantidad
        System.out.print("Por favor, indique una cantidad de dinero: ");
        cantidad = scanner.nextInt();

        // Guardamos el importe original para mostrarlo después
        importeOriginal = cantidad;

        // Calcular numero de billetes y monedas
        billetes50 = cantidad / 50;
        cantidad %= 50;

        billetes20 = cantidad / 20;
        cantidad %= 20;

        billetes10 = cantidad / 10;
        cantidad %= 10;

        billetes5 = cantidad / 5;
        cantidad %= 5;

        monedas2 = cantidad / 2;
        cantidad %= 2;

        monedas1 = cantidad;

        // Mostrar el resultado
        System.out.println(importeOriginal + " Euros se descomponen en: "+billetes50 + " billetes de 50, "+billetes20 + " billetes de 20, "+billetes10 + " billetes de 10, "+billetes5 + " billetes de 5, "+monedas2 + " monedas de 2 euros y "+monedas1 + " monedas de 1 euro.");




    }
    
}
