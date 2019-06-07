/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglodos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaEquipo {
    public static void main(String[] args) {
        // a.  Declarar Variables
        Scanner entrada = new Scanner(System.in);
        String nombreEq;
        String siglas;
        Futbolista [] lista_jugadores = new Futbolista [20];
        String nombreFutbolista;
        int edadFutbolista;
        String posicionFutbolista;
            
        // Solicitar el ingreso de valores para nombre y siglas del equipo
        // Solicitar nombreEq, siglas
        // Leer nombreEq, siglas
        System.out.println("Ingrese el nombre del equipo");
        nombreEq = entrada.nextLine();
        System.out.println("Ingrese las siglas del equipo");
        siglas = entrada.nextLine();
        
        // Incio ciclo repetitivo para llenar los datos de cada jugador 
        // creando objetos de tipo Futbolista
        // Se usa un ciclo repetitivo for
        for (int i = 0; i < 20; i++) {
            // Solicitar el ingreso de nombre, edad y posición de un 
            // futbolista
            // Solicitar nombreFutbolista, edadFutbolista, posicionFutbolista
            // Leer nombreFutbolista, edadFutbolista, posicionFutbolista
            System.out.printf("Ingrese datos del futbolista %d\n", i);
            System.out.println("Ingrese nombre de Futbolista");
            nombreFutbolista = entrada.nextLine();
            System.out.println("Ingrese edad de Futbolista");
            edadFutbolista = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese posición de Futbolista");
            posicionFutbolista = entrada.nextLine();
            // Se crea un objeto de tipo Futbolista
            Futbolista f = new Futbolista();

            // se usa los método establecer para asignar valores a los atributos
            // del objeto de tipo Futbolista
            f.establecerNombre(nombreFutbolista);
            f.establecerEdad(edadFutbolista);
            f.establecerPosicion(posicionFutbolista);
            // El objeto de tipo Futbolista se agrega a la posición i 
            // del arreglo
            lista_jugadores[i] = f;
            // endfor
              
        }
        
        // Declarar e iniciar un objeto tipo Equipo
        Equipo equipo = new Equipo();
         
        // se hace uso de los métodos establecer para asignar valores
        // a los datos (atributos) del objeto equipo
        // Establecer:  
        equipo.establecerNombreEquipo(nombreEq);
        equipo.establecerSiglasEquipo(siglas);
        equipo.establecerListaFutbolista(lista_jugadores);
        
        // Se imprime los datos establecidos en el objeto de tipo Equipo
        // Imprimir "Los datos del equipo son:",
        System.out.println("Los datos del equipo son:");
        System.out.printf("Nombre del Equipo: %s\n", 
                equipo.obtenerNombreEquipo());
        System.out.printf("Siglas del Equipo: %s\n", 
                equipo.obtenerSiglasEquipo());
        // Se hace uso de un ciclo repetitivo para presentar los valores
        // de los objetos de tipo Futbolista almacenados en el atributo
        // listaFutbolistas del objeto de tipo Equipo
        for (int i = 0; i < 10; i++) {
            // obtenerListaFutbolistas()[i], es tratado como un objeto
            // de tipo Futbolista
            // Imprimir "Jugador con datos: ",
            System.out.println("Jugador con datos: ");
            System.out.printf("Nombre %s\n", 
                    equipo.obtenerListaFutbolistas()[i].obtenerNombre());
            System.out.printf("Edad %d\n", 
                    equipo.obtenerListaFutbolistas()[i].obtenerEdad());
            System.out.printf("Posición %s\n", 
                    equipo.obtenerListaFutbolistas()[i].obtenerPosicion());
            // endfor
              
        }
    }
}
