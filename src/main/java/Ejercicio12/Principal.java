package Ejercicio12;

import Utilidades.CapturaDatos;
import Utilidades.Palabra;

/**
 *  Pedir dos palabras por teclado, indicar si son iguales, si no son iguales mostrar sus diferencias.
 */

public class Principal {
    public static void main(String[] args) {
        Palabra palabra = new Palabra();
        CapturaDatos lector = new CapturaDatos();
        System.out.println("Ingrese la primera palabra a comparar: ");
        String palabra1 = lector.capturarDato();
        System.out.println("Ingrese la segunda palabra a comparar: ");
        String palabra2 = lector.capturarDato();

        palabra.compararPalabras(palabra1, palabra2);


    }
}
