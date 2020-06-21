
package paqueteuno;

import java.util.Scanner;

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
        int contador;
        Estudiante [] estudiantes = new Estudiante[10];

        // Incio ciclo repetitivo que permite generar 10 objetos de tipo
        // EstudiantePresencial y EstudianteDistancia 
        contador = 0;
        while(contador<10){
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
                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudiantePresencial
                estudiantes[contador] = estudianteP;
                
            } else {
                // Si el usuario ingresa un número diferente del valor 1 para 
                // tipoEstudiante se procede a crear los procesos necesarios para 
                // crear un objeto de tipo EstudianteDistancia
                
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
                    
                    // Se agrega al arreglo estudiantes un objeto de tipo
                    // EstudianteDistancia
                    estudiantes[contador] = estudianteD;
                    
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
                            + "Costo Matricula: %.2f\n\n",
                            estudianteD.obtenerNombresEstudiante(),
                            estudianteD.obtenerApellidoEstudiante(),
                            estudianteD.obtenerIdentificacionEstudiante(),
                            estudianteD.obtenerEdadEstudiante(),
                            estudianteD.obtenerMatricula());
                
            }
            
            contador = contador + 1;
        }
        
        // Luego de crear y almancenar los objetos EstudiantePresencial
        // y EstudianteDistancia, se procede a usar un ciclo repetitivo
        // para recorrer el arreglo estudiantes, que permitirá:
        // 1. Llamar al método abstracto calcularMatricula, de acuedo a las
        // características propias de cada objeto.
        // 2. Presentar en pantalla los valores que se necesite.

        for (int i = 0; i < 10; i++) {
            // 1.  
            estudiantes[i].calcularMatricula();
            // en el punto 1, estudiantes[i] representa un objeto de tipo 
            // EstudiantePresencial o EstudianteDistancia; en cualquiera de los
            // dos casos, para dichos objetos se llama al método calcularMatricula()
            // de acuerdo al tipo de dato. Se recuerda que obtenerMatricula, es
            // un método abstracto de la clase abstracta Estudiante y que fue implementado
            // de forma obligatoria en cada clase hija (EstudiantePresencial y
            // EstudianteDistancia)
            
            // 2. se hace uso de los métodos obtener del objeto para presentar
            // los valores que se necesite en pantalla
            // Imprimir:
            System.out.printf("Datos Estudiante\n"
                        + "Nombres: %s\n"
                        + "Apellidos: %s\n"
                        + "Identificación: %s\n"
                        + "Edad: %d\n"
                        + "Costo Matricula: %.2f\n",
                  estudiantes[i].obtenerNombresEstudiante(),
                  estudiantes[i].obtenerApellidoEstudiante(),
                  estudiantes[i].obtenerIdentificacionEstudiante(),
                  estudiantes[i].obtenerEdadEstudiante(),
                  estudiantes[i].obtenerMatricula());
            
        }
    }

}