package Ejercicio6;

import java.util.ArrayList;

public class ListaNumeros {

    public ListaNumeros() {
    }

    public ArrayList<Integer> pares() {
        ArrayList<Integer> listaPares = new ArrayList<>();
        System.out.println("Listado de los números pares entre el 1 y 100 (incluidos): ");

        for (int numero = 1; numero <= 100; numero++) {
            if ((numero % 2) == 0) {
                listaPares.add(numero);
            }
        }
        return listaPares;
    }

    public ArrayList<Integer> impares() {
        ArrayList<Integer> listaImpares = new ArrayList<>();
        System.out.println("Listado de los números impares entre el 1 y 100 (incluidos): ");

        for (int numero = 0; numero <= 100; numero++) {
            if ((numero % 2) != 0) {
                listaImpares.add(numero);
            }
        }
        return listaImpares;
    }
}
