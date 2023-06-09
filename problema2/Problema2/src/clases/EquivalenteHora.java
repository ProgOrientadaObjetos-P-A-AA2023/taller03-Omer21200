/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    // Metodos de establecer
    public void establecerHoras(double ho) {
        horas = ho;
    }

    public void establecerMinutos() {
        minutos = horas * 60;
    }

    public void establecerSegundos() {
        segundos = minutos * 60;
    }

    public void establecerDias() {
        dias = horas / 24;
    }
    // Metodos de obtener
    public double obtenerHoras() {
        return horas;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerSegundos() {
        return segundos;
    }

    public double obtenerDias() {
        return dias;
    }
}
