/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploestudiante;

/**
 *
 * @author reroes Algoritmo CALCULAR COSTO DE MATRICULA DE UN ESTUDIANTE
 */
public class Estudiante {

    // Declarar los atributos
    String nombresEstudiante;
    String apellidosEstudiante;
    String identificacionEstudiante;
    double valorCredito;
    int numeroCreditos;
    double costoMatricula;

    // métodos establecer
    public void establecerNombresEstudiante(String nom) {
        nombresEstudiante = nom;
    }

    public void establecerApellidoEstudiante(String ape) {
        apellidosEstudiante = ape;
    }

    public void establecerIdentificacionEstudiante(String iden) {
        identificacionEstudiante = iden;
    }

    public void establecerValorCredito(double valor) {
        valorCredito = valor;
    }

    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }
    

    public void calcularCostoMatricula() {
        costoMatricula = numeroCreditos * valorCredito;
    }

    // métodos obtener
    
    public String obtenernombresEstudiante() {
        return nombresEstudiante;
    }

    public String obtenerApellidoEstudiante() {
        return apellidosEstudiante;
    }

    public String obtenerIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    public double obtenerCostoMatricula() {
        return costoMatricula;
    }
}
