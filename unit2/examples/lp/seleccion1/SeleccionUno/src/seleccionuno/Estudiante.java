/*
Algoritmo CALCULAR PENSIÓN DE UN ESTUDIANTE

El costo de la pensión del estudiante se define así: si el estudiante está 
cursando 6 créditos o más recibe un descuento del 10% en el valor del crédito y
el valor resultante se lo relaciona con el número de créditos; para el resto de
estudiantes se debe cobrar una pensión en base al número de créditos y costo de
cada crédito fijados inicialmente
"""
 

 */
package seleccionuno;

/**
 *
 * @author reroes
 *
 */
public class Estudiante {

    // 1.  Declarar
    String nombresEstudiante;
    String apellidosEstudiante;
    double valorCredito;
    int numeroCreditos;
    double costoPension;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    public void establecerNombresEstudiante(String nom) {
        nombresEstudiante = nom;

    }

    public void establecerApellidoEstudiante(String ape) {
        apellidosEstudiante = ape;

    }

    public void establecerValorCredito(double valor) {
        valorCredito = valor;
    }

    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    public void calcularCostoPension(){ 
        // el método permite la discriminación en base a lo solicitado
        // en la problemática, para calcular el costo de la pensión de un 
        // estudiante
        if (numeroCreditos < 6) {
            costoPension = numeroCreditos * valorCredito;
        } else {
              double nuevoValorCredito;
              nuevoValorCredito = (valorCredito * 10)/100;
              nuevoValorCredito = valorCredito - nuevoValorCredito;
              costoPension = numeroCreditos * nuevoValorCredito; 
        }
    }   
    
    //  Métodos obtener para los datos o atributos de la clase
    public String obtenerNombresEstudiante(){
        return nombresEstudiante; 
    }
        
                
    public String obtenerApellidoEstudiante() {
        return apellidosEstudiante;
    }

    public int obtenerNumeroCreditos(){
        return numeroCreditos;
    }
    

    public double obtenerValorCredito(){
        return valorCredito;
    }    

    public double obtenerCostoPension(){
        return costoPension;
    }

}
