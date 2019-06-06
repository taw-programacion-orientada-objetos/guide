/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglouno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaParalelo {
    public static void main(String[] args) {
        // Se declaran variables
        // a.  Declarar Variables
        Scanner entrada = new Scanner(System.in);
        String nombrePar;
        int [] listaDeEdades = new int[20];
        String [] listaDeNombres = new String[20];
        
        
        // Solicitar el ingreso de valores para nombre de paralelo
        // Solicitar nombrePar
        // Leer nombrePar
        System.out.println("Ingresar el nombre del paralelo: ");
        nombrePar = entrada.nextLine();
  
        // Incio ciclo repetitivo para llenar los nombre y edades
        // ingresadas por el teclado
        // Se usa un ciclo repetitivo for
        //    for i = 0; i<20; i++
        for (int i = 0; i < 20; i++) {
            // Solicitar el ingreso del valor del nombre de un alumno del 
            // paralelo y asignar a la posición correspondiente al arreglo
            // listaDeNombres
            // 1. Solicitar listaDeNombres[i]
            // 2. Leer listaDeNombres[i]
            System.out.printf("Ingrese el nombre del alumno %d: ", i+1);
            listaDeNombres[i] = entrada.nextLine();
            // Solicitar el ingreso del valor de la edad de un alumno del 
            // paralelo y asignar a la posición correspondiente al arreglo
            // listaDeEdades
            // 3. Solicitar listaDeEdades[i]
            // 4. Leer listaDeEdades[i]
            System.out.printf("Ingrese la edad del alumno %d: ", i+1);
            listaDeEdades[i] = entrada.nextInt();
            entrada.nextLine();
        // endfor
        }
        
        // Declarar e iniciar un objeto tipo Paralelo
        Paralelo paralelo = new Paralelo();
         
        // se hace uso de los métodos establecer para asignar valores
        // a los datos (atributos) del objeto paralelo
        // Establecer:  
        paralelo.establecerNombreParalelo(nombrePar);
        paralelo.establecerListaEdades(listaDeEdades);
        paralelo.establecerListaNombres(listaDeNombres);
        
        
        // Imprimir los datos del paralelo
        
        System.out.println("\nLos datos del paralelo son");
        System.out.printf("Nombre Paralelo: %s\n", paralelo.obtenerNombreParalelo());
        // for i = 0; i<20; i++
        for (int i = 0; i < 20; i++) {
            // Imprimir paralelo.obtenerListaNombres()[i]
            System.out.printf("Nombre de estudiante: %s\n", paralelo.obtenerListaNombres()[i]);
            // Imprimir paralelo.obtenerListaEdades()[i]
            System.out.printf("Edad de estudiante: %d\n\n", paralelo.obtenerListaEdades()[i]);
        }
            
    }
}
