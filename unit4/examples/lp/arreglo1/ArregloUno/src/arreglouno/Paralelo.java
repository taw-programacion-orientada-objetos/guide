/*
 *   Algoritmo MANEJO DE ARREGLOS CON DATOS PRIMITIVOS
 */
package arreglouno;

/**
 *
 * @author reroes
 */
public class Paralelo {
    /// 1.  Declarar
        
    String nombre;
    String [] listaNombres = new String [20];
    int [] listaEdades = new int [20];


    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNombre(nom: Cadena)
    public void establecerNombreParalelo(String nom){
        nombre= nom;
    }
  
    // 3.  Método establecerListaNombres(arregloNombres []: <<Arreglo>> Cadena)
    public void establecerListaNombres(String [] arregloNombres){
        listaNombres = arregloNombres;
    }

    // 4.  Método establecerListaEdades(arregloEdades []: <<Arreglo>> Entero)
    public void establecerListaEdades(int [] arregloEdades){
        listaEdades = arregloEdades;
    }
    
    //  Métodos obtener para los datos o atributos de la clase
    // 5.  Método obtenerNombreParalelo() : Cadena
    public String obtenerNombreParalelo(){
        return nombre;
    }
 
    // 6.  Método obtenerListaNombres() : <<Arreglo>> [] Cadena 
    public String [] obtenerListaNombres(){
        return listaNombres; 
    }
    
    // 7.  Método obtenerListaEdades() : <<Arreglo>> [] Entero 
    public int [] obtenerListaEdades(){
        return listaEdades; 
    }
    
}
