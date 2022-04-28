package Ejercicio18.Ejecutable;

import Ejercicio18.Clases.Serie;
import Ejercicio18.Clases.Videojuego;

import java.util.Arrays;

/**
 * Crear una clase llamada Serie con las siguientes características:
 * • Sus atributos son título, numero de temporadas, entregado, género y creador.
 * • Por defecto, el número de temporadas es de 3 temporadas y entregado false. El resto de
 * atributos serán valores por defecto según el tipo del atributo.
 * • Los constructores que se implementarán serán:
 * • Un constructor por defecto.
 * • Un constructor con el titulo y creador. El resto por defecto.
 * • Un constructor con todos los atributos, excepto de entregado.
 * • Los métodos que se implementara serán:
 * • Métodos get de todos los atributos, excepto de entregado.
 * • Métodos set de todos los atributos, excepto de entregado.
 * • Sobrescribe los métodos toString.
 * Crearemos una clase Videojuego con las siguientes características:
 * • Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
 * • Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán
 * valores por defecto según el tipo del atributo.
 * • Los constructores que se implementaran serán:
 * • Un constructor por defecto.
 * • Un constructor con el titulo y horas estimadas. El resto por defecto.
 * • Un constructor con todos los atributos, excepto de entregado.
 * • Los métodos que se implementara serán:
 * • Métodos get de todos los atributos, excepto de entregado.
 * • Métodos set de todos los atributos, excepto de entregado.
 * • Sobrescribe los métodos toString.
 * •
 * Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a
 * hacer una interfaz llamada Entregable con los siguientes métodos:
 * • entregar(): cambia el atributo prestado a true.
 * • devolver(): cambia el atributo prestado a false.
 * • isEntregado(): devuelve el estado del atributo prestado.
 * • Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el
 * numero de temporadas. Como parámetro que tenga un objeto, no es necesario que implementes
 * la interfaz Comparable. Recuerda el uso de los casting de objetos.
 * Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y
 * realiza lo siguiente:
 * • Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
 * • Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos
 * constructores.
 * • Entrega algunos Videojuegos y Series con el método entregar().
 * • Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
 * • Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas.
 * Muéstralos en pantalla con toda su información (usa el método toString())
 */
public class Principal {
    static Serie[] series = new Serie[5];
    static Videojuego[] videojuegos = new Videojuego[5];

    public static void main(String[] args) {

        series[0] = new Serie("Betty, La fea", 12, "Comedia", "Hnos Guerra");
        series[1] = new Serie("LightTeen", "Lois Hackman");
        series[2] = new Serie("Abogados", 10, "Drama", "Susan D'ior");
        series[3] = new Serie("Crepusculo", "Mike Johnson");
        series[4] = new Serie("One Peace", 25, "Comedia", "Anito Yakamoto");

        videojuegos[0] = new Videojuego("FIFA 2022", 35);
        videojuegos[1] = new Videojuego("Gran Turismo", 5, "Aventura", "Epig Games");
        videojuegos[2] = new Videojuego("Soul Reader", 2, "Acción", "RideVideoGame");
        videojuegos[3] = new Videojuego("God Of War", 40);
        videojuegos[4] = new Videojuego("Need for Speed", 4, "Acción", "AllVideoGames");

        series[0].entregar();
        series[1].entregar();
        series[3].entregar();

        videojuegos[1].entregar();
        videojuegos[2].entregar();
        videojuegos[4].entregar();

        contarDevolver();
        ordenarVideojuegosPorHoras();
        ordenarSeriesPorTemporadas();
    }

    private static void contarDevolver() {
        for (int i = 0; i < 5; i++) {
            if (series[i].isEntregado() || videojuegos[i].isEntregado()) {
                series[i].devolver();
                videojuegos[i].devolver();
            }
        }

    }

    private static void ordenarVideojuegosPorHoras() {
        for (int i = 0; i < videojuegos.length - 1; i++) {
            for (int j = 0; j < videojuegos.length - 1; j++) {
                if (videojuegos[j].compareTo(videojuegos[j + 1]) == 1) {
                    Videojuego videojuegoTemp = videojuegos[j];
                    videojuegos[j] = videojuegos[j + 1];
                    videojuegos[j + 1] = videojuegoTemp;
                }
            }
        }
        System.out.println("El videojuego con más horas estimadas es: " + videojuegos[0].toString());
    }

    private static void ordenarSeriesPorTemporadas() {
        for (int i = 0; i < series.length - 1; i++) {
            for (int j = 0; j < series.length - 1; j++) {
                if (series[j].compareTo(series[j + 1]) == 1) {
                    Serie serieTemp = series[j];
                    series[j] = series[j + 1];
                    series[j + 1] = serieTemp;
                }
            }
        }
        System.out.println("La serie con más temporadas es: " + series[0].toString());
    }
}
