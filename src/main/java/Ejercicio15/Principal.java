package Ejercicio15;

import javax.swing.*;

/**
 * Hacer un programa que muestre el siguiente menú de opciones
 * ****** GESTION CINEMATOGRÁFICA ********
 * 1-NUEVO ACTOR
 * 2-BUSCAR ACTOR
 * 3-ELIMINAR ACTOR
 * 4-MODIFICAR ACTOR
 * 5-VER TODOS LOS ACTORES
 * 6- VER PELICULAS DE LOS ACTORES
 * 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
 * 8-SALIR
 * EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS
 * CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO
 * ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU
 * NUEVAMENTE.
 * PISTA: COMBINAR SWITCH Y ALGUNO DE LOS BUCLES.
 */

public class Principal {

    public static void main(String[] args) {
        char opcion = '0';
        do {
            try {
                opcion = JOptionPane.showInputDialog("****** GESTION CINEMATOGRÁFICA ********\n" +
                        "\t1 - NUEVO ACTOR\n" +
                        "\t2 - BUSCAR ACTOR\n" +
                        "\t3 - ELIMINAR ACTOR\n" +
                        "\t4 - MODIFICAR ACTOR\n" +
                        "\t5 - VER TODOS LOS ACTORES\n" +
                        "\t6 - VER PELICULAS DE LOS ACTORES\n" +
                        "\t7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                        "\t8 - SALIR\n").charAt(0);
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Excepción atrapada: " + e.getMessage());
            }
            if(opcion < '1' || opcion > '8') JOptionPane.showMessageDialog(null,"¡Opción Incorrecta! Intente nuevamente.");
        } while(opcion != '8');

    }
}
