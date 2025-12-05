/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_t6;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
// Clase principal donde creo los objetos y los pruebo
public static void main(String[] args) {

        System.out.println("INSTANCIAS DIRECTAS");

        // Creacion de objetos usando sus propias clases
        Perro perro = new Perro("Firulais", 5, 10.5);
        Lobos lobos = new Lobos("Pumba", 7, 35.2);
        Leon leon = new Leon("Lionel", 6, 190.0);
        Gato gato = new Gato("Bimba", 3, 4.2);

        // Mostramos datos de cada animal
        mostrar(perro);
        mostrar(lobos);
        mostrar(leon);
        mostrar(gato);
        System.out.println("");
        System.out.println("POLIMORFISMO");

        // Se crean objetos desde la superclase Animal
        Animal[] animales = {
            new Perro("Toby", 4, 9.5),
            new Lobos("Nevado", 8, 40.0),
            new Leon("Simba", 5, 180.0),
            new Gato("Misifu", 2, 3.5)
        };

        // Cada objeto ejecuta su propia version de los metodos
        for (Animal a : animales) {
            mostrar(a);
        }
    }

    // Metodo para evitar repetir codigo al mostrar los datos de un animal
    public static void mostrar(Animal animal) {
        System.out.println("");
        animal.mostrarDatos();
        animal.mostrarSonido();
        animal.mostrarAlimentacion();
        animal.mostrarHabitat();
        animal.mostrarNombreCientifico();
    }
}

