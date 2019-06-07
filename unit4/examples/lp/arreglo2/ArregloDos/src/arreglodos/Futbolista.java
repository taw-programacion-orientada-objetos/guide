/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglodos;

/**
 *
 * @author reroes
 */
public class Futbolista {
    // 1.  Declarar
    String nombre;
    int edad;
    String posicion;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNombre(nom: Cadena)
    public void establecerNombre(String nom){
        nombre= nom;
    }
  
    // 2.  Método establecerEdad(ed: Entero)
    public void establecerEdad(int ed){
        edad = ed;
    }

    // 3.  Método establecerPosicion(pos: Cadena)
    public void establecerPosicion(String pos){
        posicion = pos; 
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 4.  Método obtenerNombre() : Cadena
    public String obtenerNombre(){
        return nombre;
    }

    // 5.  Método obtenerEdad() : Entero 
    public int obtenerEdad(){
        return edad;
    }
 
    // 6.  Método obtenerPosicion() : Cadena
    public String obtenerPosicion(){
        return posicion;
    }
    
}
