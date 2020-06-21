/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public abstract class Estudiante {
    /*
        1.  Declarar
        // se declaran datos o atributos con visibilidad protegido,
        // para que se puedan manipular por las clases derivadas
        # nombresEstudiante: Cadena
        # apellidosEstudiante: Cadena
        # identificacionEstudiante: Cadena
        # edadEstudiante: Entero
        # matricula: Real
        
    */
    protected String nombresEstudiante;
    protected String apellidosEstudiante;
    protected String identificacionEstudiante;
    protected int edadEstudiante;
    protected double matricula;
    
    // Método establecerNombresEstudiante(nom: Cadena)
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom;
    }
  
    // Método establecerApellidoEstudiante(ape: Cadena)
    public void establecerApellidoEstudiante(String ape){
        apellidosEstudiante = ape;
    }
    
    //  Método establecerIdentificacionEstudiante(iden: Cadena)
    public void establecerIdentificacionEstudiante(String iden){
        identificacionEstudiante = iden;
    }

    // Método establecerEdadEstudiante(ed: Edad)
    public void establecerEdadEstudiante(int ed){
        edadEstudiante = ed;
    }
    
    /*
    Método abstracto calcularMatricula()
        // método sin impĺementar, se deja la responsabilidad 
        // a las clases derivadas
    */
    public abstract void calcularMatricula();
    
    //  Métodos obtener para los datos o atributos de la clase
    //  Método obtenerNombresEstudiante() : Cadena
    public String obtenerNombresEstudiante(){
        return nombresEstudiante;  
    }
 
    // Método obtenerApellidoEstudiante() : Cadena
    public String obtenerApellidoEstudiante(){
        return apellidosEstudiante; 
    }

    // Método obtenerIdentificacionEstudiante() : Cadena
    public String obtenerIdentificacionEstudiante(){
        return identificacionEstudiante; 
    }

    //  Método obtenerEdadEstudiante() : Entero
    public int obtenerEdadEstudiante(){
        return edadEstudiante;
    }
    
    /*
    Método obtenerMatricula() : Real
        a.  return matricula
        b.  Fin Método obtenerMatricula
    */
    public double obtenerMatricula(){
        return matricula;
    }
}
