package Ejercicio8;

import Utilidades.CapturaDatos;

/**
 * Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día
 * laboral o no. Usa un switch para ello
 */
public class Principal {
    public static void main(String[] args) {
        String diaSemana = "";
        CapturaDatos lector = new CapturaDatos();
        System.out.println("Digite un día de la semana: ");
        diaSemana = lector.capturarDato().toLowerCase();
        switch (diaSemana) {
            case "lunes":
                System.out.println("Lunes es un día laboral");
                break;
            case "martes":
                System.out.println("Martes es un día laboral");
                break;
            case "miercoles":
                System.out.println("Miércoles es un día laboral");
                break;
            case "jueves":
                System.out.println("Jueves es un día laboral");
                break;
            case "viernes":
                System.out.println("Viernes es un día laboral");
                break;
            case "sabado":
                System.out.println("Sábado no es un día laboral");
                break;
            case "domingo":
                System.out.println("Domingo no es un día laboral");
                break;
            default:
                System.out.println("Opción no válida. Escriba un día de la semana");
                break;
        }
    }
}
