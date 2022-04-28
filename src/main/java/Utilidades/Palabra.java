package Utilidades;

public class Palabra {

    public void compararPalabras(String palabra1, String palabra2) {
        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las dos palabras ingresadas son iguales");
        } else {
            Integer minTamanno = Math.min(palabra1.length(), palabra2.length());
            System.out.println("Las dos palabras ingresadas son diferentes");
            System.out.println("");
            for (int index = 0; index < minTamanno; index++) {
                if (palabra1.charAt(index) != palabra2.charAt(index)) {
                    System.out.println("En la posición " + (index + 1) + " de las dos palabras, las letras son diferentes");
                    System.out.println("\tSu diferencia está en:");
                    System.out.println("\tEn la primera palabra hay un: '" + palabra1.charAt(index) + "'");
                    System.out.println("\tEn la segunda palabra hay un: '" + palabra2.charAt(index) + "'");
                }
            }
        }
    }

    public void contarVocales(String frase) {
        Integer a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int contador = 0; contador < frase.length(); contador++) {
            Character vocal = frase.charAt(contador);

            if (vocal.equals('a')) {
                a++;
                continue;
            }
            if (vocal.equals('e')) {
                e++;
                continue;
            }
            if (vocal.equals('i')) {
                i++;
                continue;
            }
            if (vocal.equals('o')) {
                o++;
                continue;
            }
            if (vocal.equals('u')) {
                u++;
            }
        }
        System.out.println("Cantidad de a: " + a);
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i);
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);
    }
}
