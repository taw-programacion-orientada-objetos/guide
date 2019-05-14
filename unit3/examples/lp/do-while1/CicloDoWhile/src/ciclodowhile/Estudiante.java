/*
* Problemática:
* Se desea generar una solución informática que permita determinar el valor 
* a pagar de la pensión mensual de un estudiante de un instituto educativo, 
* en función de los créditos que está cursando en un ciclo en particular. 
* El costo de la pensión del estudiante se define así: si el estudiante está 
* cursando 6 créditos o más recibe un descuento del 10% en el valor del crédito 
* y el valor resultante se lo relaciona con el número de créditos; para el 
* resto de estudiantes se debe cobrar una pensión en base al número de créditos
* y costo de cada crédito fijados inicialmente

* Algoritmo CALCULAR LA PENSIÓN DE VARIOS ESTUDIANTE
 */
package ciclodowhile;

/**
 *
 * @author reroes
 */
public class Estudiante {
    // 1.  Declarar
    String nombresEstudiante;
    String apellidosEstudiante;
    double valorCredito;
    int numeroCreditos;
    double costoPension;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom;
    }
          
    public void establecerApellidosEstudiante(String ape){
        apellidosEstudiante = ape;
    }
    
    public void establecerValorCredito(double valor){
        valorCredito = valor;
    }
        
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
        
    
    public void calcularCostoPension(){
        // el método permite la discriminación en base a lo solicitado
        // en la problemática, para calcular el costo de la pensión de un estudiante
        if (numeroCreditos < 6){
            costoPension = numeroCreditos * valorCredito;
        }else{
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
 
    public String obtenerApellidosEstudiante(){
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
