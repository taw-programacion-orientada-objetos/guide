/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciauno;

/**
 *
 * @author reroes
 */
public class Estudiante {
    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    
    // 2.  Método establecerNombresEstudiante(nom: Cadena)
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom;
    }
  
    // 3.  Método establecerApellidoEstudiante(ape: Cadena)
    public void establecerApellidoEstudiante(String ape){
        apellidosEstudiante = ape;
    }
    
    // 4.  Método establecerIdentificacionEstudiante(iden: Cadena)
    public void establecerIdentificacionEstudiante(String iden){
        identificacionEstudiante = iden;
    }

    // 5.  Método establecerEdadEstudiante(ed: Edad)
    public void establecerEdadEstudiante(int ed){
        edadEstudiante = ed;
    }
    
    //  Métodos obtener para los datos o atributos de la clase
    // 6.  Método obtenerNombresEstudiante() : Cadena
    public String obtenerNombresEstudiante(){
        return nombresEstudiante;  
    }
 
    //7.  Método obtenerApellidoEstudiante() : Cadena
    public String obtenerApellidoEstudiante(){
        return apellidosEstudiante; 
    }

    // 8. Método obtenerIdentificacionEstudiante() : Cadena
    public String obtenerIdentificacionEstudiante(){
        return identificacionEstudiante; 
    }

    // 9.  Método obtenerEdadEstudiante() : Entero
    public int obtenerEdadEstudiante(){
        return edadEstudiante;
    }

}
