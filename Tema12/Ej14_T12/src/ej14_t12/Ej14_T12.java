/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14_t12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Alex
 */
public class Ej14_T12 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        String linea;

        try {
            FileReader fr = new FileReader("DatosBeca.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("--- RESULTADO BECAS ---");

            // Leo cada linea del fichero
            while ((linea = br.readLine()) != null) {

                // Separo los datos
                StringTokenizer st = new StringTokenizer(linea, " - ");

                String nombre = st.nextToken();
                String sexo = st.nextToken();
                int edad = Integer.parseInt(st.nextToken());
                int suspensos = Integer.parseInt(st.nextToken());
                String residencia = st.nextToken();
                double ingresos = Double.parseDouble(st.nextToken());

                double beca = 1500;

                // Si tiene 2 suspensos o mas no hay beca
                if (suspensos >= 2) {
                    continue;
                }

                // Complemento por ingresos
                if (ingresos <= 12000) {
                    beca += 500;
                }

                // Complemento por edad
                if (edad < 23) {
                    beca += 200;
                }

                // Complemento por suspensos
                if (suspensos == 0) {
                    beca += 500;
                } else if (suspensos == 1) {
                    beca += 200;
                }

                // Complemento por residencia (SI = vive con familia, NO = alquiler)
                if (residencia.equalsIgnoreCase("NO")) {
                    beca += 1000;
                }

                // Muestro solo si tiene beca valida
                if (beca > 0) {
                    System.out.println(nombre + " -> " + beca + " euros");
                }
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el fichero DatosBeca.txt");

        } catch (IOException e) {
            System.out.println("Error al leer el fichero");

        } catch (Exception e) {
            System.out.println("Error en el formato de los datos");
        }
    }
}
