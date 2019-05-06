/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructordos;

/**
 *
 * @author reroes
 */

//   Clase EjecutaEstudiante
public class EjecutaEstudiante {
    
    /*
    En un programa en lenguaje Java siempre necesitamos una clase
    que tenga el métodor principal, para poder ejecutar la lógica desarrollada
    en el programa. Nos estamos refiriendo al método main:
    public static void main(String[] args) {
        
    }
    */ 
    
    //  1.  Método principal()
    public static void main(String[] args) {
        // Declarar Variables
        // nombresEst: Cadena
        String nombresEst;
        // apellidosEst: Cadena
        String apellidosEst;
        
        // Asignar valores
        // nombresEst = "Luis"
        nombresEst = "Luis";
        // apellidosEst = "Alvarez"
        apellidosEst = "Alvarez";
        
        // Declarar, crear e iniciar objeto
        // Tomar en consideración que el constructor de la clase
        // requiere dos parámetros de tipo cadena.
        // public Estudiante(String nom, String ape){}
        Estudiante estudiante = new Estudiante(nombresEst, apellidosEst);
        
        // Imprimir  estudiante.obtenernombresEstudiante(),
        //           estudiante.obtenerApellidoEstudiante(),
        System.out.println(estudiante.obtenernombresEstudiante());
        System.out.println(estudiante.obtenerApellidoEstudiante());
        
    }
    
}
