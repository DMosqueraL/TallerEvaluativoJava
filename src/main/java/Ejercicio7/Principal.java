package Ejercicio7;

import Utilidades.CapturaDatos;

/**
 * Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo
 * es lo volverá a pedir (do while), después muestra ese número por consola.
 */
public class Principal {
    public static void main(String[] args) {
        CapturaDatos lector = new CapturaDatos();
        double numero;

        do {
            System.out.println("ingrese un número: ");
            numero = lector.capturarNumero();
            if (numero >= 0) {
                System.out.println(numero);
            } else {
                System.out.println("Por favor ingrese un número válido: ");
                numero = lector.capturarNumero();
            }
        } while (numero < 0);
    }
}
