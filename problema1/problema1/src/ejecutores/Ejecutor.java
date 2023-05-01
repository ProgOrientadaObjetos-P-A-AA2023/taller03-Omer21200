/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.Terreno;

/**
 *
 * @author omerb
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Objeto 1
        Terreno terreno1 = new Terreno();
        terreno1.establecerAncho(300);
        terreno1.establecerLargo(500);
        terreno1.establecerValorMetroCuadrado(30);
        terreno1.establecerArea();
        terreno1.establecerCostoTerreno();
        // Objeto 2
        Terreno terreno2 = new Terreno();
        terreno2.establecerAncho(200);
        terreno2.establecerLargo(300);
        terreno2.establecerValorMetroCuadrado(20);
        terreno2.establecerArea();
        terreno2.establecerCostoTerreno();
        // Imprimir el terreno 1
        System.out.println("Terreno 1");
        System.out.printf("El ancho del Terreno 1 es de: %.2f\n",terreno1.obtenerAncho());
        System.out.printf("El largo del Terreno 1 es de: %.2f\n",terreno1.obtenerLargo());
        System.out.printf("El valor por metro cuadrado del Terreno 1 es de: %.2f\n",terreno1.obtenerValorMetroCuadrado());
        System.out.printf("El area del Terreno 1 es de: %.2f\n",terreno1.obtenerArea());
        System.out.printf("El valor total del Terreno 1 es de: %.2f$\n",terreno1.obtenerCostoTerreno());
        // Imprimir el terreno 2
        System.out.println("Terreno 2");
        System.out.printf("El ancho del Terreno 2 es de: %.2f\n",terreno2.obtenerAncho());
        System.out.printf("El largo del Terreno 2 es de: %.2f\n",terreno2.obtenerLargo());
        System.out.printf("El valor por metro cuadrado del Terreno 2 es de: %.2f\n",terreno2.obtenerValorMetroCuadrado());
        System.out.printf("El area del Terreno 2 es de: %.2f\n",terreno2.obtenerArea());
        System.out.printf("El valor total del Terreno 2 es de: %.2f$\n",terreno2.obtenerCostoTerreno());
        
    }
    
}
