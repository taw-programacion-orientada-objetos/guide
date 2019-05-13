/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaDocente {
    public static void main(String[] args) {
        // a.  Declarar Variables
        Scanner entrada = new Scanner(System.in);
        String nombresDoc;
        String apellidosDoc;
        double costoHr;
        int numeroHr;
        String bandera;
        
        bandera = "S";
        // Se inicia el ciclo repetitivo
        // Se ingresa al ciclo repetitivo, siempre que bandera sea igual
        // al carácter "S"
        while(bandera.equals("S")){
            // Declarar e iniciar el objeto Docente 
            // para todas las ocasiones que se recorra el ciclo
            Docente docente = new Docente();
            
            // Solicitar y leer información
            System.out.println("Ingrese el nombre del docente");
            nombresDoc = entrada.nextLine();
            System.out.println("Ingrese el apellido del docente");
            apellidosDoc = entrada.nextLine();
            System.out.println("Ingrese el numero de horas de trabajo del "
                    + "docente");
            numeroHr = entrada.nextInt();
            System.out.println("Ingrese el valor de cada hora de trabajo del "
                    + "docente");
            costoHr = entrada.nextDouble();
            // se hace uso de los métodos establecer para asignar valores
            // a los datos (atributos) del objeto
            docente.establecerNombres(nombresDoc);
            docente.establecerApellido(apellidosDoc);
            docente.establecerCostoHora(costoHr);
            docente.establecerNumeroHoras(numeroHr);
            
            // 5.  Calcular  docente.calcularSueldo()
            docente.calcularSueldo();
            // 6.  Imprimir  "Los datos del docente ingresados son:",
            //                docente.obtenerNombres(),
            //                docente.obtenerApellido(),
            //                "El sueldo del docentes es:",
            //                docente.obtenerSueldo()
            System.out.printf("Los datos del docente ingresados son: %s\n"
                    + "%s\nEl sueldo del docente es: %.2f\n", 
                    docente.obtenerNombres(), docente.obtenerApellido(),
                    docente.obtenerSueldo());
            
            // 7.  Imprimir "Desea continuar ingresando docentes S/N"
            // 8.  Leer bandera 
            entrada.nextLine(); // ref: https://bit.ly/2DXczEk
            System.out.println("Desea continuar ingresando docente S/N");
            bandera = entrada.nextLine();
        }

    }
}
