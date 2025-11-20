/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24_t5;

/**
 *
 * @author alumno
 */
public class ProductoRefrigerado extends Producto{
    
    // Creo un atributo privado
    private String codigoOrganismo;

    // Constructor
    public ProductoRefrigerado(String fechaCaducidad, String numeroLote,
                               String codigoOrganismo) {

        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    // Get y set
    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    // Muestro info producto
    public void mostrarInfo() {
        System.out.println("Producto Refrigerado");
        super.mostrarInfo();
        System.out.println("Codigo organismo supervision: " + codigoOrganismo);
    }
}
