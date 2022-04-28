package Ejercicio14;

import Utilidades.CapturaDatos;
import Utilidades.Numero;

/**
 * Crear un programa que pida un numero por teclado y que imprima por pantalla los números
 * desde el numero introducido hasta 1000 con saldos de 2 en 2.
 */

public class Principal {

    public static void main(String[] args) {
        Numero numeroSerie = new Numero();
        Integer numero;
        CapturaDatos lector = new CapturaDatos();
        System.out.println("Ingrese un número (menor a 1000): ");
        numero = lector.capturarNumero();
        System.out.println("===================================");
        numeroSerie.deDosEnDos(numero);
    }
}
