package Ejercicio10;

import Utilidades.CapturaDatos;

/**
 * Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios
 * que esta contenga.
 */
public class Principal {
    public static void main(String[] args) {
        String frase;
        CapturaDatos lector = new CapturaDatos();
        System.out.println("Ingrese una frase de su elección: ");
        frase = lector.capturarDato();
        String fraseSinEspacios = frase.replaceAll("\\s+", "");
        System.out.println("Resultado: " + fraseSinEspacios);
    }
}
