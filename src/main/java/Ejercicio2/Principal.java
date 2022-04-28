package Ejercicio2;

import Utilidades.CapturaDatos;
import Utilidades.Numero;

/**
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
 * son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 * Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores,
 * menores o iguales.
 */

public class Principal {
    public static void main(String[] args) {
        Numero num = new Numero();
        CapturaDatos lector = new CapturaDatos();
        System.out.println("Ingrese el valor del primer número: ");
        Integer numero1 = lector.capturarNumero();
        System.out.println("Ingrese el valor del segundo número: ");
        Integer numero2 = lector.capturarNumero();

        num.esMayor(numero1, numero2);
        num.esMenor(numero1, numero2);
        num.esIgual(numero1, numero2);


    }
}
