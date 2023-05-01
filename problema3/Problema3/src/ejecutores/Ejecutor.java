/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.InstitucionEducativa;

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
        InstitucionEducativa intitucionEducativa1 = new InstitucionEducativa();
        intitucionEducativa1.establecerNombre("Adolfo Valarezo");
        intitucionEducativa1.establecerNumAlumnos(200);
        intitucionEducativa1.establecerNumDocentes(60);
        intitucionEducativa1.establecerNumSedes(4);
        intitucionEducativa1.establecerTipoInstitucion("Publica");
        intitucionEducativa1.establecerGastosPorEstudiante(40);
        intitucionEducativa1.establecerPresupuesto();
        // Objeto 2
        InstitucionEducativa intitucionEducativa2 = new InstitucionEducativa();
        intitucionEducativa2.establecerNombre("La Dolorasa");
        intitucionEducativa2.establecerNumAlumnos(340);
        intitucionEducativa2.establecerNumDocentes(80);
        intitucionEducativa2.establecerNumSedes(3);
        intitucionEducativa2.establecerTipoInstitucion("Privada");
        intitucionEducativa2.establecerGastosPorEstudiante(80);
        intitucionEducativa2.establecerPresupuesto();

        // Imprimir Institucion Educativa 1
        System.out.println("Institucion Educativa 1");
        System.out.println("El nombre de la Institucion Edicativa 1 es: " + intitucionEducativa1.obtenerNombre());
        System.out.println("El tipo de Institucion Edicativa 1 es: " + intitucionEducativa1.obtenerTipoInstitucion());
        System.out.println("El numero de alumnos de la Institucion Edicativa 1 es: " + intitucionEducativa1.obtenerNumAlumnos());
        System.out.println("El numero de docentes de la Institucion Edicativa 1 es: " + intitucionEducativa1.obtenerNumDocentes());
        System.out.println("El numero de sedes de la Institucion Edicativa 1 es: " + intitucionEducativa1.obtenerNumSedes());
        System.out.println("Los gastos proyectado por estudiante\nde la Institucion Edicativa 1 es: " + intitucionEducativa1.obtenerGastosPorEstudiante());
        System.out.println("El presupuesto de la Institucion Edicativa 1 es: " + intitucionEducativa1.obtenerPresupuesto());
        // Imprimir Institucion Educativa 2
        System.out.println("Institucion Educativa 2");
        System.out.println("El nombre de la Institucion Edicativa 2 es: " + intitucionEducativa2.obtenerNombre());
        System.out.println("El tipo de Institucion Edicativa 2 es: " + intitucionEducativa2.obtenerTipoInstitucion());
        System.out.println("El numero de alumnos de la Institucion Edicativa 2 es: " + intitucionEducativa2.obtenerNumAlumnos());
        System.out.println("El numero de docentes de la Institucion Edicativa 2 es: " + intitucionEducativa2.obtenerNumDocentes());
        System.out.println("El numero de sedes de la Institucion Edicativa 2 es: " + intitucionEducativa2.obtenerNumSedes());
        System.out.println("Los gastos proyectado por estudiante\nde la Institucion Edicativa 2 es: " + intitucionEducativa2.obtenerGastosPorEstudiante());
        System.out.println("El presupuesto de la Institucion Edicativa 2 es: " + intitucionEducativa2.obtenerPresupuesto());
    }

}
