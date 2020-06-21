/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaEstudiante {

    public static void main(String[] args) {

        // Se declaran variables
        // a.  Declarar Variables
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;

        // b. Incio ciclo repetitivo que permite generar objetos de tipo
        // EstudiantePresencial y EstudianteDistancia hasta que el usaurio
        // decida salir del proceso.
        do {
            // Se imprime mensaje en pantalla para solicitar
            // el tipo de estudiante que se desea ingresar
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            // se captura el valor ingresado por el usuario en 
            // la variable tipoEstudiante
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            // Solicitar el ingreso de valores para las variables

            // Solicitar nombresEst, apellidosEst, identificacionEst, edadEst
            // Leer nombresEst, apellidosEst, identificacionEst, edadEst
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {

                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);

                // Luego que se ha ingresado los datos, se hace uso del método
                // abtracto <calcularMatricula> para obtener 
                // el costo de la Matricula Presencial para el objeto tipo 
                // EstudiantePresencial
                estudianteP.calcularMatricula();

                // se hace uso de los métodos obtener del objeto para presentar
                // los valores que se necesite en pantalla
                // Imprimir
                System.out.printf("Datos Estudiante Presencial\n"
                        + "Nombres: %s\n"
                        + "Apellidos: %s\n"
                        + "Identificación: %s\n"
                        + "Edad: %d\n"
                        + "Costo Matricula: %.2f\n",
                        estudianteP.obtenerNombresEstudiante(),
                        estudianteP.obtenerApellidoEstudiante(),
                        estudianteP.obtenerIdentificacionEstudiante(),
                        estudianteP.obtenerEdadEstudiante(),
                        estudianteP.obtenerMatricula());
            } else {
                // Si el usuario ingresa un número igual a 2 para 
                // tipoEstudiante se procede a crear los procesos necesarios para 
                // crear un objeto de tipo EstudianteDistancia
                if (tipoEstudiante == 2) {
                    // Declarar,crear e iniciar objeto tipo EstudianteDistancia
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    // Solicitar ingreso de valores para variables 
                    // Solicitar numeroAsigs, costoAsig 
                    // Leer numeroAsigs, costoAsig
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();

                    // se hace uso de los métodos establecer para asignar valores
                    // a los datos (atributos) del objeto
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);

                    // Luego que se ha ingresado los datos, se hace uso del método
                    // abtracto <calcularMatricula> para obtener 
                    // el costo de la Matricula Distancia para el objeto tipo 
                    // EstudianteDistancia
                    estudianteD.calcularMatricula();

                    // se hace uso de los métodos obtener del objeto para presentar
                    // los valores que se necesite en pantalla
                    System.out.printf("Datos Estudiante Distancia\n"
                            + "Nombres: %s\n"
                            + "Apellidos: %s\n"
                            + "Identificación: %s\n"
                            + "Edad: %d\n"
                            + "Costo Matricula: %.2f\n",
                            estudianteD.obtenerNombresEstudiante(),
                            estudianteD.obtenerApellidoEstudiante(),
                            estudianteD.obtenerIdentificacionEstudiante(),
                            estudianteD.obtenerEdadEstudiante(),
                            estudianteD.obtenerMatricula());
                } else {
                    System.out.println("Opción fuera de rango");

                }
            }

            entrada.nextLine();
            // Se pregunta si se desea ingresar más estudiante
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");

            // se captura el valor ingresado por el usuario para la variable 
            // continuar
            continuar = entrada.nextLine();
            // se pregunta si el valor continuar es igual al valor "S", se sigue en 
            // ciclo repetitivo; si el valor es distinto de "S", se sale del ciclo
            // repetitivo
        } while (continuar.equals("S"));

    }

}
