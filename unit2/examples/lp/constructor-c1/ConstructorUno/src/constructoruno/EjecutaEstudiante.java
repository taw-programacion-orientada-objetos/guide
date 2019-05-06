/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoruno;

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
        
        // Declarar,crear e iniciar objeto
        Estudiante estudiante = new Estudiante();
        
        // Imprimir  estudiante.obtenernombresEstudiante(),
        //           estudiante.obtenerApellidoEstudiante(),
        System.out.println(estudiante.obtenernombresEstudiante());
        System.out.println(estudiante.obtenerApellidoEstudiante());
        
    }
    
}
