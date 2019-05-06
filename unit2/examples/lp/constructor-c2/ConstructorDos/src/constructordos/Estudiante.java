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

// Clase Estudiante 
public class Estudiante {
    
    // nombresEstudiante: Cadena
    String nombresEstudiante;
    // apellidosEstudiante: Cadena
    String apellidosEstudiante;
    
    // se crea el constructor de la clase Estudiante
    /*
    miniespecificación
    2.  Método Estudiante(nom: Cadena, ape: Cadena)
        a.  nombresEstudiante = nom
        b.  apellidosEstudiante = ape 
        c.  Fin Método Estudiante 
    */
    public Estudiante(String nom, String ape){
        nombresEstudiante = nom;
        apellidosEstudiante = ape;
    }
    
    /*
    miniespecificación
    3.  Método establecerNombresEstudiante(nom: Cadena)
        a.  nombresEstudiante = nom
        b.  Fin Método establecerNombresEstudiante 
    */
    
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom;
    }
    
    /*
    miniespecificación
        4.  Método establecerApellidoEstudiante(ape: Cadena)
        a.  apellidosEstudiante = ape
        b.  Fin Método establecerApellidoEstudiante
    */
    public void establecerApellidoEstudiante(String ape){
        apellidosEstudiante = ape;
    }
    
    /*
    miniespecificación
        5.  Método obtenernombresEstudiante() : Cadena
        a.  return nombresEstudiante  
        b.  Fin Método obtenernombresEstudiante 
    */
    
    public String obtenernombresEstudiante(){
        return nombresEstudiante;
    }
    
    /*
    miniespecificación
        6.  Método obtenerApellidoEstudiante() : Cadena
        a.  return apellidosEstudiante 
        b.  Fin Método obtenerApellidoEstudiante
    */
    public String obtenerApellidoEstudiante(){
        return apellidosEstudiante;
    }
}
