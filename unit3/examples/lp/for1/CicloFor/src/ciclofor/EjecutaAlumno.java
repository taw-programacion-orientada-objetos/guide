/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaAlumno {

    // 1.  Método principal()
    public static void main(String[] args) {
        // a.  Declarar Variables
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        double calf1;
        double calf2;
        double calf3;
        int numero_alumnos;

        // b.  Solicitar numero_estudiante
        // c.  Leer numero_alumnos
        System.out.println("Ingrese el número de alumnos");
        numero_alumnos = entrada.nextInt();
        

        // d. inicio del ciclo repetitivo
        // que itera hasta el valor ingresado en 
        // numero_alumnos
        // for j=1; j<=numero_alumnos; j++
        for (int j = 1; j <= numero_alumnos; j++) {
            // 1. Declarar e iniciar el objeto Alumno 
            // para todas las ocasiones que se recorra el ciclo
            Alumno alumno = new Alumno();
            
            // 2.  Solicitar y leer información necesaria para establecer los 
            //  valores a los a atributos del objeto alumno
            entrada.nextLine(); // ref: https://bit.ly/2DXczEk
            System.out.println("Ingrese el nombre del alumno");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese la calificación 1");
            calf1 = entrada.nextDouble();
            System.out.println("Ingrese la calificación 2");
            calf2 = entrada.nextDouble();
            System.out.println("Ingrese la calificación 3");
            calf3 = entrada.nextDouble();
            
            // 4. se hace uso de los métodos establecer para asignar valores
            // a los datos (atributos) del objeto
            // Establecer  
            alumno.establecerNombres(nombresEst);
            alumno.establecerCalificacion1(calf1);
            alumno.establecerCalificacion2(calf2);
            alumno.establecerCalificacion3(calf3);
            
            // 5. Se hace uso del método que permite calcular el promedio de
            // calificaciones de un alumno, se llama al método llamado calcularPromedio
            // 6.  Calcular  
            alumno.calcularPromedio();
            
            // 7.  Imprimir  
            System.out.printf("Los datos del alumno ingresados son: \n"
                    + "Nombres: %s\n"
                    + "Calificación 1: %.2f\n"
                    + "Calificación 2: %.2f\n"
                    + "Calificación 3: %.2f\n"
                    + "Su promedio de calificacione es: %.2f\n\n",
                    alumno.obtenerNombres(), alumno.obtenerCalificacion1(),
                    alumno.obtenerCalificacion2(), alumno.obtenerCalificacion3(),
                    alumno.obtenerPromedio());

        }
        //
    }
}
