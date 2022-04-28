package Ejercicio13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Realizar un algoritmo que permita consulta la fecha y hora actual en el formato
 * (AAAA/MM/DD) (HH:MM:SS)
 */

public class Principal {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        LocalTime hora = LocalTime.now();

        LocalDateTime fechaHoy = LocalDateTime.now();

        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter tiempo = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Hoy es: "+hoy.format(fecha));
        System.out.println("Hora: "+hora.format(tiempo));
    }
}
