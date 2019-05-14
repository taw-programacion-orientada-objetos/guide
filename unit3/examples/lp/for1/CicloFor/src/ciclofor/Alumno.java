/*
*   Problemática:
*   Se necesita presentar una solución que permita encontrar el promedio de 
* calificacionnes de cada alumno de un paralelo. Cada alumno tiene como 
* atributos nombre, califiación 1, calificación 2, calificación 3. La solución 
* deberá permitir el ingreso máximo de alumnos para procesar

* Algoritmo CALCULAR EL PROMEDIO DE CALIFICACIONES DE UN CONJUNTO DE ALUMNOS 
 */
package ciclofor;

/**
 *
 * @author reroes
 */
public class Alumno {
    // 1.  Declarar
    String nombres;
    double calificacion1;
    double calificacion2;
    double calificacion3;
    double promedio;
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNombres(nom: Cadena)
    public void establecerNombres(String nom){
        nombres = nom;
    }
  
    // 3.  Método establecerCalificacion1(c1: Real)
    public void establecerCalificacion1(double c1){
        calificacion1 = c1;
    }
    
    // 4.  Método establecerCalificacion2(c2: Real)
    public void establecerCalificacion2(double c2){
        calificacion2 = c2;
    }

    // 5.  Método establecerCalificacion3(c2: Real)
    public void establecerCalificacion3(double c3){
        calificacion3 = c3;
    }
        
    //7.  Método calcularPromedio()
    public void calcularPromedio(){
        // a.  Declarar variable locales
        double suma;
        // b.  Proceso de suma de las calificaciones
        suma = calificacion1 + calificacion2 + calificacion3;
        // c.  Proceso para encontrar el promedio
        promedio = suma/3;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 8.  Método obtenerNombres() : Cadena
    public String obtenerNombres(){
        return nombres;
    }
    
    // 9.  Método obtenerCalificacion1() : Real 
    public double obtenerCalificacion1(){    
        return calificacion1; 
    }
        
    // 10.  Método obtenerCalificacion2() : Real 
    public double obtenerCalificacion2(){    
        return calificacion2; 
    }

    // 11.  Método obtenerCalificacion3() : Real 
    public double obtenerCalificacion3(){    
        return calificacion3; 
    }
    
    // 12. Método obtenerPromedio() : Real
    public double obtenerPromedio(){
        return promedio;
    }
        
}
