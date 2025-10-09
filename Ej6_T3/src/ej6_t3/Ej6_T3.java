/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_t3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej6_T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        // Pido la nota de un alumno
        System.out.print("Por favor, introduzca la nota del alumno : ");
        int nota = scanner.nextInt();
        
        if (nota>=0 && nota<=4) {
            System.out.println("Suspenso");
            }
            else{if (nota>=5 && nota<=6) {
                System.out.println("Bien");
                }
                else{if (nota>=7 && nota<=8) {
                    System.out.println("Notable");
                    }
                    else{if (nota>=9 && nota<=10) {
                        System.out.println("Sobresaliente");
                    }else{
                        System.out.println("La nota que has introducido no esta entre 0 y 10");
                    }
                  }   
                }
            }
    }
}
