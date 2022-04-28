package Ejercicio3;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

/**
 * Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
 * (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método
 * pow de Math.
 */
public class Principal {
    public static void main(String[] args) {
        double radio = Principal.ingresarRadio();
        DecimalFormat df = new DecimalFormat("###.##");
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + df.format(Principal.calcularArea(radio)) + " unidades cuadradas");
    }

    private static double ingresarRadio() {
        Double radio = null;   //Wrapper class (Autoboxing operation)
        do {
            try {
                radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio para calcular su área: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e2.getMessage());
            }
        } while(radio == null || radio < 0);
        return(radio);
    }

    private static double calcularArea(double radio) {
        return (Math.PI * Math.pow(radio,2));
    }
}
