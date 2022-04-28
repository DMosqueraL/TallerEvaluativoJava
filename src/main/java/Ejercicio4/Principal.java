package Ejercicio4;

import Utilidades.CapturaDatos;

import java.text.DecimalFormat;

/**
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
 * calcule el precio final con IVA. El IVA será una constante que será del 21%.
 */
public class Principal implements Iimpuesto {
    public static void main(String[] args) {

        CapturaDatos dato = new CapturaDatos();
        System.out.print("Ingrese el precio del producto: $");
        Double precio = Double.parseDouble(dato.capturarDato());
        Principal main = new Principal();
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("$" +df.format(main.precioTotalConIva(precio)));

    }

    @Override
    public double precioTotalConIva(Double precio) {
        Double precioTotal = precio + (precio * IVA);
        System.out.println("El precio total a pagar por el producto es: ");
        return precioTotal;

    }
}
