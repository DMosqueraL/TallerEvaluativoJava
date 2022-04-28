package Ejercicio5;

/**
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Usando WHIlE");
        ListaNumeros lista = new ListaNumeros();

        lista.pares().forEach(System.out::println);
        lista.impares().forEach(System.out::println);


    }


}
