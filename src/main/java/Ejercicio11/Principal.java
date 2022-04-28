package Ejercicio11;

import Utilidades.CapturaDatos;
import Utilidades.Palabra;

/**
 * Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por
 * consola, indicar cuál es la longitud de esta frase, adicionalmente cuántas vocales tiene de
 * “a,e,i,o,u”.
 */
public class Principal {
    public static void main(String[] args) {
        Palabra palabra = new Palabra();
        CapturaDatos lector = new CapturaDatos();
        System.out.println("Ingrese una frase de su elección: ");
        String frase = lector.capturarDato();
        System.out.println("Tamaño de la frase: " + frase.length());
        palabra.contarVocales(frase);
    }
}
