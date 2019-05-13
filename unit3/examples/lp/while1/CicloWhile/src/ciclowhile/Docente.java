/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

/**
 *
 * @author reroes
 */
public class Docente {
    // 1.  Declarar
    String nombres;
    String apellidos;
    int numeroHoras;
    double costoHora;
    double sueldo;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    public void establecerNombres(String nom){
        nombres = nom;
}
  
    public void establecerApellido(String ape){
        apellidos= ape;
    }
     
    
    public void establecerNumeroHoras(int horas){
        numeroHoras = horas;
    }

    public void establecerCostoHora(double costo){
        costoHora = costo;
    }
    
    public void calcularSueldo(){
        if (numeroHoras >= 40){
            sueldo = (numeroHoras * costoHora) + 150;
        }else{
             sueldo = numeroHoras * costoHora;
        }
    }
     
    //  Métodos obtener para los datos o atributos de la clase
    public String obtenerNombres(){
        return nombres;
    }
 
    public String obtenerApellido(){
        return apellidos;
    }

    public int obtenerNumeroHoras(){
        return numeroHoras;
    }

    public double obtenerCostoHora(){
        return costoHora;
    }
 
    public double obtenerSueldo(){
        return sueldo;
    }

}
