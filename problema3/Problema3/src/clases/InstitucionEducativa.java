/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class InstitucionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosPorEstudiante;
    private double presupuesto;

    // Metodos de establecer
    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerTipoInstitucion(String tipInst) {
        tipoInstitucion = tipInst;
    }

    public void establecerNumAlumnos(int numAl) {
        numAlumnos = numAl;
    }

    public void establecerNumDocentes(int numDo) {
        numDocentes = numDo;
    }

    public void establecerNumSedes(int numSe) {
        numSedes = numSe;
    }

    public void establecerGastosPorEstudiante(double gasEstu) {
        gastosPorEstudiante = gasEstu;
    }

    public void establecerPresupuesto() {
        presupuesto = numAlumnos * gastosPorEstudiante;
    }
    // Metodos de obtener

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumAlumnos() {
        return numAlumnos;
    }

    public int obtenerNumDocentes() {
        return numDocentes;
    }

    public int obtenerNumSedes() {
        return numSedes;
    }

    public double obtenerGastosPorEstudiante() {
        return gastosPorEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
