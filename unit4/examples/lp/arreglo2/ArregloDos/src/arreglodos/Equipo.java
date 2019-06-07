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
public class Equipo {
    // 1.  Declarar
       
    String nombreEquipo;
    String siglasEquipo;
    // listaFutbolistas: <<Arreglo>>[20] Futbolista 
    Futbolista [] listaFutbolistas = new Futbolista [20];

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNombreEquipo(nom: Cadena)
    public void establecerNombreEquipo(String nom){
        nombreEquipo = nom;
    }
  
    // 3.  Método establecerSiglasEquipo(siglas: Cadena)
    public void establecerSiglasEquipo(String siglas){
        siglasEquipo = siglas;
    }
    
    // 4.  Método establecerListaFutbolista(lista_fut[]: <<Arreglo>> Futbolista)
    public void establecerListaFutbolista(Futbolista [] lista_fut ){
        listaFutbolistas = lista_fut; 
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5.  Método obtenerNombreEquipo() : Cadena
    public String obtenerNombreEquipo(){
        return nombreEquipo;
    }

    // 6.  Método obtenerSiglasEquipo() : Cadena
    public String obtenerSiglasEquipo(){
        return siglasEquipo;
    }
 
    // 7.  Método obtenerListaFutbolistas() : <<Arreglo>> [] Futbolista 
    public Futbolista [] obtenerListaFutbolistas(){
        return listaFutbolistas;
    }

}
