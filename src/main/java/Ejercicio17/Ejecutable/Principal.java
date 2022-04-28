package Ejercicio17.Ejecutable;

import Ejercicio17.Clases.Electrodomestico;
import Ejercicio17.Clases.Lavadora;
import Ejercicio17.Clases.Television;

/**
 * Crearemos una superclase llamada Electrodoméstico con las siguientes características:
 * • Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
 * Indican que se podrán heredar.
 * • Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 €
 * y el peso de 5 kg. Usa constantes para ello.
 * • Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está
 * en mayúsculas o en minúsculas.
 * • Los constructores que se implementarán serán:
 * • Un constructor por defecto.
 * • Un constructor con el precio y peso. El resto por defecto.
 * • Un constructor con todos los atributos.
 * • Los métodos que implementara serán:
 * • Métodos get de todos los atributos.
 * • comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es
 * correcta usara la letra por defecto. Se invocará al crear el objeto y no será visible.
 * • comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por
 * defecto. Se invocará al crear el objeto y no será visible.
 * • precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño,
 * también. Esta es la lista de precios:
 * Crearemos una subclase llamada Lavadora con las siguientes características:
 * • Su atributo es carga, además de los atributos heredados.
 * • Por defecto, la carga es de 5 kg. Usa una constante para ello.
 * • Los constructores que se implementarán serán:
 * • Un constructor por defecto.
 * • Un constructor con el precio y peso. El resto por defecto.
 * • Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al
 * constructor de la clase padre.
 * • Los métodos que se implementara serán:
 * • Método get de carga.
 * • precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se
 * incrementara el precio. Llama al método padre y añade el código necesario. Recuerda que las
 * condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
 * Crearemos una subclase llamada Television con las siguientes características:
 * • Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los
 * atributos heredados.
 * • Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
 * • Los constructores que se implementarán serán:
 * • Un constructor por defecto.
 * • Un constructor con el precio y peso. El resto por defecto.
 * • Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
 * Recuerda que debes llamar al constructor de la clase padre.
 * • Los métodos que se implementara serán:
 * • Método get de resolución y sintonizador TDT.
 * • precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un
 * 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las
 * condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
 * Ahora crea una clase ejecutable que realice lo siguiente:
 * • Crea un array de Electrodomesticos de 10 posiciones.
 * • Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
 * • Ahora, recorre este array y ejecuta el método precioFinal().
 * • Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado,
 * el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos
 * Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos).
 * Recuerda el uso operador instanceof.
 * Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión
 * de 500, el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para
 * televisión.
 */

public class Principal {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        Principal.llenarArreglo(electrodomesticos);
        Principal.imprimirElectrodomesticos(electrodomesticos);
    }

        private static void llenarArreglo(Electrodomestico[] electrodomesticos) {
            electrodomesticos[0] = new Television(100.5, "BEIGE", 'A', 30.8, 32.0F,false);
            electrodomesticos[1] = new Lavadora(250.5, "NEGRO", 'F', 100.0, 60.0);
            electrodomesticos[2] = new Electrodomestico(300.5, "AZUL", 'B', 300.0);
            electrodomesticos[3] = new Electrodomestico(80.0, "VERDE", 'F', 110.8);
            electrodomesticos[4] = new Television(200.5, "CELESTE", 'A', 100.2, 75.0F,true);
            electrodomesticos[5] = new Lavadora(100.0, "MORADO", 'F', 100.5, 20.0);
            electrodomesticos[6] = new Lavadora(200.0, "SILVER", 'B', 250.0, 90.0);
            electrodomesticos[7] = new Electrodomestico(170.0, "ROJO", 'C', 20.0);
            electrodomesticos[8] = new Lavadora(120.0, "AZUL", 'A', 150.5, 80.0);
            electrodomesticos[9] = new Electrodomestico(140.0, "ROSADO", 'K', 50.0);
        }

        private static void imprimirElectrodomesticos(Electrodomestico[] electrodomesticos) {
            double precioElectrod = 0, precioTelevisores = 0, precioLavadoras = 0, precioTotal = 0;
            for (int i = 0; i < electrodomesticos.length; i++) {
                if(electrodomesticos[i] instanceof Television) precioElectrod += electrodomesticos[i].precioFinal();
                else if(electrodomesticos[i] instanceof Lavadora) precioLavadoras += electrodomesticos[i].precioFinal();
                else if(electrodomesticos[i] instanceof Electrodomestico) precioTelevisores += electrodomesticos[i].precioFinal();
                precioTotal += electrodomesticos[i].precioFinal();
            }
            System.out.println("El precio final de los electrodomésticos es de: \n$" + precioTotal +
                    " (" + precioElectrod + "," + precioLavadoras + "," + precioTelevisores + ") para electrodomésticos. \n$"
                    + precioLavadoras + " para lavadoras. \n$" + precioTelevisores + " para televisores.");
        }
    }



