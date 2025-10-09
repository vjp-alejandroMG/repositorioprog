/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_t3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej9_T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
       
        // Pido cuatro numeros
        System.out.print("Por favor, introduzca el primer numero : ");
        int num1 = scanner.nextInt();
        System.out.print("Ahora, introduzca el segundo numero : ");
        int num2 = scanner.nextInt();
        System.out.print("Introduzca el tercer numero : ");
        int num3 = scanner.nextInt();
         System.out.print("Por ultimo, introduzca un cuarto numero: ");
        int num4 = scanner.nextInt();
        
         int aux;//Creo la variable auxiliar
         
         
        // Me aseguro de que num1 <= num2 <= num3 <= num4
        if (num1 > num2) { aux = num1; num1 = num2; num2 = aux;}
        if (num1 > num3) { aux = num1; num1 = num3; num3 = aux;}
        if (num1 > num4) { aux = num1; num1 = num4; num4 = aux;}

        if (num2 > num3) { aux = num2; num2 = num3; num3 = aux;}
        if (num2 > num4) { aux = num2; num2 = num4; num4 = aux;}

        if (num3 > num4) { aux = num3; num3 = num4; num4 = aux;}

         
         
         
        // Mustro el resultado
        System.out.println("El orden de los numeros introducidos es  "+num1+" - "+num2+" - "+num3+" - "+num4);
        
    }
    
}
