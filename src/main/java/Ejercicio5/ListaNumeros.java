package Ejercicio5;

import java.util.ArrayList;

public class ListaNumeros {

    public ListaNumeros() {
    }

    public ArrayList<Integer> pares() {
        ArrayList<Integer> listaPares = new ArrayList<>();
        System.out.println("Listado de los números pares entre el 1 y 100 (incluidos): ");
        Integer numero = 0;
        while (numero <= 100) {
            if ((numero % 2) == 0) {
                listaPares.add(numero);
            }
            numero++;
        }
        return listaPares;
    }

    public ArrayList<Integer> impares() {
        ArrayList<Integer> listaImpares = new ArrayList<>();
        System.out.println("Listado de los números impares entre el 1 y 100 (incluidos): ");
        Integer numero = 1;
        while (numero <= 100) {
            if ((numero % 2) != 0) {
                listaImpares.add(numero);
            }
            numero++;
        }
        return listaImpares;
    }
}
