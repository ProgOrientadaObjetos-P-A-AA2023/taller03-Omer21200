/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.EquipoCelular;

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
        EquipoCelular equipoCelular1 = new EquipoCelular();
        equipoCelular1.establecerSistemaOperativo("Android");
        equipoCelular1.establecerTamanioPantalla("14 Pulgadas");
        equipoCelular1.establecerCostoInicial(300);
        equipoCelular1.establecerIvaPorcentaje(0.18);
        equipoCelular1.establecerIvaCostoInicial();
        equipoCelular1.establecerCostoFinal();
         // Objeto 2
        EquipoCelular equipoCelular2 = new EquipoCelular();
        equipoCelular2.establecerSistemaOperativo("IOS");
        equipoCelular2.establecerTamanioPantalla("13 Pulgadas");
        equipoCelular2.establecerCostoInicial(500);
        equipoCelular2.establecerIvaPorcentaje(0.20);
        equipoCelular2.establecerIvaCostoInicial();
        equipoCelular2.establecerCostoFinal();

        // Imprimir Equipo Celular 1
        System.out.println("Equipo Celular 1");
        System.out.println("El sistema operativo del Equipo Celular 1 es: " + equipoCelular1.obtenerSistemaOperativo());
        System.out.println("El tamaño de pantalla del Equipo Celular 1 es de: " + equipoCelular1.obtenerTamanioPantalla());
        System.out.println("El costo inicial del Equipo Celular 1 es de: " + equipoCelular1.obtenerCostoInicial());
        System.out.println("El iva del Equipo celular 1 es de: " + equipoCelular1.obtenerIvaPorcentaje());
        System.out.println("El iva del costo inicial del Equipo 1 es de: " + equipoCelular1.obtenerIvaCostoInicial());
        System.out.println("El costo final del Equipo 1 es de: " + equipoCelular1.obtenerCostoFinal());
        // Imprimir Equipo Celular 2
        System.out.println("Equipo Celular 2");
        System.out.println("El sistema operativo del Equipo Celular 2 es: " + equipoCelular2.obtenerSistemaOperativo());
        System.out.println("El tamaño de pantalla del Equipo Celular 2 es de: " + equipoCelular2.obtenerTamanioPantalla());
        System.out.println("El costo inicial del Equipo Celular 2 es de: " + equipoCelular2.obtenerCostoInicial());
        System.out.println("El iva del Equipo celular 2 es de: " + equipoCelular2.obtenerIvaPorcentaje());
        System.out.println("El iva del costo inicial del Equipo 2 es de: " + equipoCelular2.obtenerIvaCostoInicial());
        System.out.println("El costo final del Equipo 2 es de: " + equipoCelular2.obtenerCostoFinal());

    }
}
