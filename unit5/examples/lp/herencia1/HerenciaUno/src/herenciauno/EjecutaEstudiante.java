/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciauno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaEstudiante {
    public static void main(String[] args) {
        // 1.  Método principal()
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
        String bandera = "SI";

        // b. Incio ciclo repetitivo
        do {
            // Se impreme mensaje en pantalla para solicitar
            // el tipo de estudiante que se desea ingresar
            // 1. Imprimir "Tipo de Estudiante a ingresar
            //    1. Estudiante Presencial
            //    2. Estudiante Distancia"
            
            System.out.println("Tipo de Estudiante a ingresar.\n1) Estudiante"
                    + "Presencial. \n2) Estudiante Distancia");
            // se captura el valor ingresado por el usuario en 
            // la variable tipoEstudiante
            // 2. Leer tipoEstudiante; 
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            // Solicitar el ingreso de valores para las variables
            // 3. Solicitar nombresEst, apellidosEst, identificacionEst, edadEst
            // 4. Leer nombresEst, apellidosEst, identificacionEst, edadEst
            System.out.println("Ingrese el nombre del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese el apellido del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            // 5. if tipoEstudiante == 1 then
            if (tipoEstudiante == 1){
                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                // Solicitar ingreso de valores para variables 
                // numero de creditos, costo de cada credito
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el número de créditos del "
                        + "estudiante");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada crédito "
                        + "del estudiante");
                costoCred = entrada.nextDouble();
                
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                // Establecer:  
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);

                // Luego que se ha ingresado los datos, se hace uso del método
                // calcular Matricula Presencial para el objeto tipo
                // EstudiantePresencial
                // Calcular: 
                estudianteP.calcularMatriculaPresencial();

                // se hace uso de los métodos obtener del objeto para presentar
                // los valores que se necesite en pantalla
                // Imprimir:
                System.out.println("Datos del estudiante Presencial");
                System.out.printf("Nombre: %s\n", 
                        estudianteP.obtenerNombresEstudiante());
                System.out.printf("Apelllido: %s\n", 
                        estudianteP.obtenerApellidoEstudiante());
                System.out.printf("Identificación: %s\n", 
                        estudianteP.obtenerIdentificacionEstudiante());
                System.out.printf("Edad: %d\n", 
                        estudianteP.obtenerEdadEstudiante());
                System.out.printf("Matricula final $: %.2f\n", 
                        estudianteP.obtenerMatriculaPresencial());      
                      
            }else{
                // Si el usuario ingresa un número diferente del valor 1 para 
                // tipoEstudiante se procede a crear los procesos necesarios para 
                // crear un objeto de tipo EstudianteDistancia
              
                // Declarar,crear e iniciar objeto tipo EstudianteDistancia
                EstudianteDistancia estudianteD = new EstudianteDistancia();
                // Solicitar ingreso de valores para variables 
                // numero de asignaturas, costo de cada asignatura 
                // Solicitar numeroAsigs, costoAsig 
                // Leer numeroAsigs, costoAsig
                System.out.println("Ingrese en el número de asignaturas del"
                        + " estudiante");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese en el costo de cada asignaturas del"
                        + " estudiante");
                costoAsig = entrada.nextDouble();
                
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                // Establecer:  
                estudianteD.establecerNombresEstudiante(nombresEst);
                estudianteD.establecerApellidoEstudiante(apellidosEst);
                estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                estudianteD.establecerEdadEstudiante(edadEst);
                estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);

                // Luego que se ha ingresado los datos, se hace uso del método
                // calcular Matricula Distancia para el objeto tipo
                // EstudianteDistancia
                // Calcular: 
                estudianteD.calcularMatriculaDistancia();
                // se hace uso de los métodos obtener del objeto para presentar
                // los valores que se necesite en pantalla
                // Imprimir:
                System.out.println("Datos del estudiante a Distancia");
                System.out.printf("Nombre: %s\n", 
                        estudianteD.obtenerNombresEstudiante());
                System.out.printf("Apelllido: %s\n", 
                        estudianteD.obtenerApellidoEstudiante());
                System.out.printf("Identificación: %s\n", 
                        estudianteD.obtenerIdentificacionEstudiante());
                System.out.printf("Edad: %d\n", 
                      estudianteD.obtenerEdadEstudiante());
                System.out.printf("Matricula: %.2f\n", 
                       estudianteD.obtenerMatriculaDistancia());

            }
            // Se pregunta si se desea ingresar más estudiante
            // Imprimir "Desea ingresar más estudiante. Digite la letra S para
            // continuar o digite la letra N para salir del proceso"
            System.out.println("Desea ingresar más estudiantes. Digite la letra"
                    + " S para continuar o digite la letra N para salir");
            // 9. // se captura el valor ingresado por el usuario para la variable
            // carácter 
            // Leer continuar
            entrada.nextLine(); // limpiar buffer
            continuar = entrada.nextLine();
            
            // se pregunta si el valor continuar es igual al valor "S", se sigue en 
            // ciclo repetitivo; si el valor es distinto de "S", se sale del ciclo
            // repetitivo
            
        }while (continuar.equals("S"));
        

    }
//    
}
