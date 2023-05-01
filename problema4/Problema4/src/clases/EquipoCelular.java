/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class EquipoCelular {
    private String sistemaOperativo;
    private String tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    
    // Metodos de establecer
    public void establecerSistemaOperativo(String sisOpe) {
        sistemaOperativo = sisOpe;
    }
    public void establecerTamanioPantalla(String tamPan) {
        tamanioPantalla = tamPan;
    }
    public void establecerCostoInicial(double cosIn) {
        costoInicial = cosIn;
    }
    public void establecerIvaPorcentaje(double ivaPor) {
        ivaPorcentaje = ivaPor;
    }
    public void establecerIvaCostoInicial() {
        ivaCostoInicial = costoInicial*ivaPorcentaje;
    }
    public void establecerCostoFinal() {
        costoFinal = costoInicial+ivaCostoInicial;
    }
    //Metodos de obtener

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerTamanioPantalla() {
        return tamanioPantalla;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }
    

}
