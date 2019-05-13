/*
 * Clase que contiene el método main o principal
 */
package seleccionuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaEstudiante {

    public static void main(String[] args) {
        // Declarar Variables
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        double valorCred;
        int numeroCred;
        
        // Declarar e iniciar el objeto Estudiante
        Estudiante estudiante = new Estudiante();
        
        // Solicitar y leer nombre de estudiante,
        //              apellido de estudiante
        //              número de créditos
        //              valor de cada crédito
        System.out.println("Ingrese los nombres del estudiante");
        nombresEst = entrada.nextLine();
        System.out.println("Ingrese los apellidos del estudiante");
        apellidosEst = entrada.nextLine();
        System.out.println("Ingrese el número de créditos");
        numeroCred = entrada.nextInt();
        System.out.println("Ingrese el valor de cada crédito");
        valorCred = entrada.nextDouble();
        
        // se hace uso de los métodos establecer para asignar valores
        // a los datos (atributos) del objeto
        // Establecer  estudiante.establecerNombresEstudiante(nombresEst),
        //                estudiante.establecerApellidoEstudiante(apellidosEst),
        //                estudiante.establecerNumeroCredito(numeroCredito),
        //                estudiante.establecerValorCredito(valorCredito)
        estudiante.establecerNombresEstudiante(nombresEst);
        estudiante.establecerApellidoEstudiante(apellidosEst);
        estudiante.establecerNumeroCreditos(numeroCred);
        estudiante.establecerValorCredito(valorCred);

        // Se hace uso del método que permite calcular el costo de
        // la pensión, se llama al método llamado calcularCostoPension
        // Calcular  estudiante.calcularCostoPension()
        estudiante.calcularCostoPension();
        
        // Imprimir  estudiante.obtenernombresEstudiante(),
        //           estudiante.obtenerApellidoEstudiante(),
        //           estudiante.obtenerCostoPension()
        System.out.println("\nMuestra de valores ingresados:\n");
        System.out.println(estudiante.obtenerNombresEstudiante());
        System.out.println(estudiante.obtenerApellidoEstudiante());
        System.out.println(estudiante.obtenerCostoPension());
    }
}
