/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Terreno {

    private double valorMetroCuadrado;
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;

    // Metodos de establecer
    public void establecerAncho(double an) {
        ancho = an;
    }

    public void establecerLargo(double lar) {
        largo = lar;
    }

    public void establecerValorMetroCuadrado(double va) {
        valorMetroCuadrado = va;
    }

    public void establecerArea() {
        area = largo * ancho;
    }

    public void establecerCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }

    // Metodos de obtener
    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerCostoTerreno() {
        return costoTerreno;
    }
}
