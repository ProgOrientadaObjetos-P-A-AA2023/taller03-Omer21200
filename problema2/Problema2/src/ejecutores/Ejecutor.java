/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.EquivalenteHora;

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
        EquivalenteHora equiHora1 = new EquivalenteHora();
        equiHora1.establecerHoras(75);
        equiHora1.establecerMinutos();
        equiHora1.establecerSegundos();
        equiHora1.establecerDias();
        // Objeto 2
        EquivalenteHora equiHora2 = new EquivalenteHora();
        equiHora2.establecerHoras(125);
        equiHora2.establecerMinutos();
        equiHora2.establecerSegundos();
        equiHora2.establecerDias();
        // Imprimir el quivalente en minutos, segundos y dias  1
        System.out.println("Conversion 1");
        System.out.printf("El numero de horas es de: %.0f\n",equiHora1.obtenerHoras());
        System.out.printf("El quivalente en minutos es de: %.0f\n",equiHora1.obtenerMinutos());
        System.out.printf("El quivalente en segundos es de: %.0f\n",equiHora1.obtenerSegundos());
        System.out.printf("El quivalente en dias es de: %.2f\n",equiHora1.obtenerDias());
        // Imprimir el quivalente en minutos, segundos y dias  2
         System.out.println("Conversion 2");
        System.out.printf("El numero de horas es de: %.0f\n",equiHora2.obtenerHoras());
        System.out.printf("El quivalente en minutos es de: %.0f\n",equiHora2.obtenerMinutos());
        System.out.printf("El quivalente en segundos es de: %.0f\n",equiHora2.obtenerSegundos());
        System.out.printf("El quivalente en dias es de: %.2f\n",equiHora2.obtenerDias());
    }
    
}
