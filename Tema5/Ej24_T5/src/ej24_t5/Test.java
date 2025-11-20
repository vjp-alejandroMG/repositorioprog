/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej24_t5;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo un objeto de tipo ProductoFresco e introduzco los datos
        ProductoFresco fresco = new ProductoFresco("10/04/2025", "L001", "01/03/2025", "España");

        // Creo un objeto de tipo ProductoRefrigerado e introduzco los datos
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("15/07/2025", "L002", "ORG-ALIM-528");

        // Creo un objeto de tipo ProductoCongelado e introduzco los datos 
        ProductoCongelado congelado = new ProductoCongelado("30/12/2026", "L003", -20.5);

        // Muestro la informacion del producto fresco
        fresco.mostrarInfo();
        System.out.println("");
        // Muestro la informacion del producto refrigerado
        refrigerado.mostrarInfo();
        System.out.println("");
        // Muestro la informacion del producto congelado
        congelado.mostrarInfo();
    
    }
}
