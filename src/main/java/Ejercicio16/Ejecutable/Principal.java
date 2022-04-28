package Ejercicio16.Ejecutable;

import Ejercicio16.Clases.Persona;

import javax.swing.*;

/**
 * Haz una clase llamada Persona que siga las siguientes condiciones:
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que
 * se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su
 * tipo. Si quieres añadir algún atributo puedes hacerlo.
 * Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números,
 * cadena vacía para String, etc.). Sexo será hombre por defecto, usa una constante para ello.
 * Se implantarán varios constructores:
 * • Un constructor por defecto.
 * • Un constructor con el nombre, edad y sexo, el resto por defecto.
 * • Un constructor con todos los atributos como parámetro.
 * Los métodos que se implementaran son:
 * • calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, la función
 * devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que
 * está por debajo de su peso ideal la función devuelve un 0 y si devuelve un valor
 * mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te
 * recomiendo que uses constantes para devolver estos valores.
 * • esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 * • comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es
 * correcto, sera H. No será visible al exterior.
 * • toString(): devuelve toda la información del objeto.
 * • generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su
 * número su letra correspondiente. Este método será invocado cuando se construya el
 * objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
 * • Métodos set de cada parámetro, excepto de DNI.
 * Ahora, crea una clase ejecutable que haga lo siguiente:
 * • Pide por teclado el nombre, la edad, sexo, peso y altura.
 * • Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
 * pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso
 * y la altura y el último por defecto, para este último utiliza los métodos set para darle
 * a los atributos un valor.
 * • Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por
 * debajo de su peso ideal con un mensaje.
 * • Indicar para cada objeto si es mayor de edad.
 * • Por último, mostrar la información de cada objeto.
 */

public class Principal {
    public static void main(String[] args) {

        String[] mensajesIMC = {"Está por debajo de su peso ideal.", "Está en su peso ideal.", "Tiene sobrepeso."};

        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre de la Persona 1: ");
        Integer edad1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad de la Persona 1: "));
        String sexo1 = JOptionPane.showInputDialog("Ingrese el sexo de la Persona 1 (H/M): ");
        Double peso = Double.valueOf(JOptionPane.showInputDialog("Ingrese el peso de la Persona 1: "));
        Double altura = Double.valueOf(JOptionPane.showInputDialog("Ingrese la altura de la Persona 1: "));

        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre de la Persona 2: ");
        Integer edad2 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad de la Persona 2: "));
        String sexo2 = JOptionPane.showInputDialog("Ingrese el sexo de la Persona 2 (H/M): ");

        Persona persona1 = new Persona(nombre1, edad1, sexo1, peso, altura);
        Persona persona2 = new Persona(nombre2, edad2, sexo2);
        Persona persona3 = new Persona();

        persona2.setPeso(56.5);
        persona2.setAltura(1.85);

        persona3.setNombre("Daniela");
        persona3.setEdad(24);
        persona3.setSexo("M");
        persona3.setPeso(80.0);
        persona3.setAltura(1.70);

        String mayorEdad1 = (persona1.esMayorDeEdad())? "Es mayor de edad" : "Es menor de edad";
        String mayorEdad2 = (persona2.esMayorDeEdad())? "Es mayor de edad" : "Es menor de edad";
        String mayorEdad3 = (persona3.esMayorDeEdad())? "Es mayor de edad" : "Es menor de edad";

        String mensajeIMC1 = mensajesIMC[persona1.calcularIMC()+1];
        String mensajeIMC2 = mensajesIMC[persona2.calcularIMC()+1];
        String mensajeIMC3 = mensajesIMC[persona3.calcularIMC()+1];
        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*");
        System.out.println("Información Persona 1:");
        System.out.println(persona1.toString());
        System.out.println(mayorEdad1);
        System.out.println(mensajeIMC1);
        System.out.println("");
        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*");
        System.out.println("Información Persona 2:");
        System.out.println(persona2.toString());
        System.out.println(mayorEdad2);
        System.out.println(mensajeIMC2);
        System.out.println("");
        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*");
        System.out.println("Información Persona 3:");
        System.out.println(persona3.toString());
        System.out.println(mayorEdad3);
        System.out.println(mensajeIMC3);






}


}

