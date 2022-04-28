package Utilidades;

import java.util.Scanner;

public class CapturaDatos {
    private Integer numero;
    private String dato;
    Scanner captura = new Scanner(System.in);

    public Integer capturarNumero() {
        return this.numero = captura.nextInt();
    }

    public String capturarDato() {
        return this.dato = captura.nextLine();
    }


}
