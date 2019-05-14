/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaEstudiante {
    public static void main(String[] args) {
        // a.  Declarar Variables
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        double valorCred;
        int numeroCred;
        String bandera;
        
        do{
            //1.    Declarar e iniciar el objeto Estudiante
            // para todas las ocasiones que se recorra el ciclo
            Estudiante estudiante = new Estudiante();
            
            // Solicitar y leer datos necesarios
            System.out.println("Ingrese nombre del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese apellido del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese el valor del crédito del estudiante");
            valorCred = entrada.nextDouble();
            System.out.println("Ingrese el número de créditos del estudiante");
            numeroCred = entrada.nextInt();
            
            // 4. se hace uso de los métodos establecer para asignar valores
            // a los datos (atributos) del objeto
            // Establecer  
            estudiante.establecerNombresEstudiante(nombresEst);
            estudiante.establecerApellidosEstudiante(apellidosEst);
            estudiante.establecerNumeroCreditos(numeroCred);
            estudiante.establecerValorCredito(valorCred);

            
            // 5.   Se hace uso del método que permite calcular el costo de
            // la pensión, se llama al método llamado calcularCostoPension
            // Calcular  
            estudiante.calcularCostoPension();
            // 6.  Imprimir  
            System.out.printf("Los datos del estudiante ingresados son: \n%s %s"
                    + "\nSu pensión a pagar es:\n%.2f\n\n",
                            estudiante.obtenerNombresEstudiante(),
                            estudiante.obtenerApellidosEstudiante(),
                            estudiante.obtenerCostoPension());
            
            // 7.  Imprimir "Desea continuar ingresando estudiante S/N"
            // 8.  Leer bandera 
            entrada.nextLine(); // ref: https://bit.ly/2DXczEk
            System.out.println("Desea continuar ingresando estudiante S/N");
            bandera = entrada.nextLine();

        // si el usuario ingresa el valor 'S', se continua 
        // en el ciclo repetitivo, si el usuario ingresa
        // algún otro valor, se sale del ciclo 
        // repetitivo
        }while(bandera.equals("S"));
        
    }
}
