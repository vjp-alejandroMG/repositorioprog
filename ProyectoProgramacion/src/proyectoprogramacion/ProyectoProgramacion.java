/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogramacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class ProyectoProgramacion {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        
        int contador = 0;
       
        try {
            // Abro el archivo de entrada 
            FileReader fr = new FileReader("datos_empleados.txt");
            BufferedReader br = new BufferedReader(fr);
           
            // Creo el archivo de salida
            FileWriter fw = new FileWriter("empleados_zona_cero.txt");
            PrintWriter pw = new PrintWriter(fw);
           
            // Leo la primera linea
            String linea = br.readLine();
           
            // Escribo la cabecera en el archivo de salida
            if (linea != null) {
                pw.println(linea);
            }
           
            // Leo el resto de lineas una por una
            while (linea != null) {
                linea = br.readLine();
               
                if (linea != null) {
                    if (linea.toLowerCase().contains(";zona cero;")) {
                        pw.println(linea);
                        contador++;
                    }
                }
            }
           
            // Cierro los archivos
            br.close();
            pw.close();
           
            // Muestro resultado
            System.out.println("Numero de empleados en Zona Cero: " + contador);
            System.out.println("Resultados guardados en: empleados_zona_cero.txt");
           
        } catch (Exception e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
            System.out.println("Asegurate de que el archivo 'datos_empleados.txt' existe");
        }
    }
}


