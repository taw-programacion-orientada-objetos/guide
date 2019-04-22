/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploestudiante;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaEstudiante {

    public static void main(String[] args) {
        // a. Declarar Variables
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        double valorCred;
        int numeroCred;
        
        // uso de la librería en lenguaje Java para lectura de datos desde
        // teclado: Scanner
        Scanner entrada = new Scanner(System.in); // importante, se debe importar
        
        // b. Declarar,crear e iniciar objeto
        Estudiante estudiante = new Estudiante();
        
        // c. Solicitar
        // d. Leer
        System.out.println("Ingrese el nombre del estudiante");
        nombresEst = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del estudiante");
        apellidosEst = entrada.nextLine();
        
        System.out.println("Ingrese la identificación del estudiante");
        identificacionEst = entrada.nextLine();
        
        System.out.println("Ingrese el número de créditos del estudiante");
        numeroCred = entrada.nextInt();
        
        System.out.println("Ingrese el valor de cada crédito del estudiante");
        valorCred = entrada.nextDouble();
        
        // e. Establecer
        estudiante.establecerNombresEstudiante(nombresEst);
        estudiante.establecerApellidoEstudiante(apellidosEst);
        estudiante.establecerIdentificacionEstudiante(identificacionEst);
        estudiante.establecerNumeroCreditos(numeroCred);
        estudiante.establecerValorCredito(valorCred);
        
        // f. Calcular
        estudiante.calcularCostoMatricula();
        
        // Imprimir
        System.out.println("Nombre de estudiante " + estudiante.obtenernombresEstudiante());
        System.out.println("Apellido de estudiante " + estudiante.obtenerApellidoEstudiante());
        System.out.println("Identificación de estudiante " + 
        estudiante.obtenerApellidoEstudiante());
        System.out.println("Costo matrícula de estudiante " + 
        estudiante.obtenerCostoMatricula());
        
    }
}
