/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej20_t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej20_T4 {

    /**
     * @param args the command line arguments
     */
    
    // Constantes para las respuestas correctas
    private static final String capitalEspania = "Madrid";
    private static final String descubridor = "Cristobal Colon";

    // Creo el metodo que hace la primera pregunta
    public static boolean preguntarCapital() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: ");// Hago la pregunta
        String respuesta1 = scanner.nextLine();
        
        // Creo un if en el que si responde bien le da el mensaje y sino le dice que no es correcta y le dice cual es la respuesta correcta
        if (respuesta1.equalsIgnoreCase(capitalEspania)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + capitalEspania);
            return false;
        }
    }

    // Creo otro metodo igual que el anterior pero cambiando la pregunta
    public static boolean preguntarDescubridor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: ");// Igual que en el anterior creo un scanner para hacer la pregunta
        String respuesta2 = scanner.nextLine();

        // Si la dice bien le da el primer mensaje y sino le da un mensaje de que no es correcto y la respuesta correcta
        if (respuesta2.equalsIgnoreCase(descubridor)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + descubridor);
            return false;
        }
    }
    
    // Metodo main
    public static void main(String[] args) {
        int nota = 0;// inicializo la variable nota en cero
        System.out.println("EXAMEN DE CULTURA GENERAL");// pongo el titulo del examen

        // Hago las dos preguntas
        boolean respuesta1 = preguntarCapital();
        boolean respuesta2 = preguntarDescubridor();

        // Calculo la nota
        if (respuesta1 == true) {
            nota += 5;// si la respuesta de la primera pregunta esta bien suma 5
        }
        if (respuesta2 == true) {
            nota += 5;// si la respuesta de la segunda pregunta esta bien suma 5
        }
        
        // Muestro la nota final
        System.out.println("NOTA DEL EXAMEN: " + nota);
        
    }
    
}
