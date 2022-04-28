package Ejercicio1;

import Utilidades.Numero;

/**
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
 * son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */
public class Principal {
    public static void main(String[] args){

        Integer num1 = 20;
        Integer num2 = 20;
        Numero numero = new Numero(num1, num2);

        numero.esIgual(num1, num2);
        numero.esMayor(num1, num2);
    }
}
