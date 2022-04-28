package Ejercicio6;

/**
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
 * Realiza el ejercicio anterior usando un ciclo for
 */

import Ejercicio5.ListaNumeros;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Usando For");
        Ejercicio5.ListaNumeros lista = new ListaNumeros();

        lista.pares().forEach(System.out::println);
        lista.impares().forEach(System.out::println);
    }
}
