package Ejercicio9;

/**
 * Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String
 * anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran
 * incluir por consola y las muestre luego unidas
 */
public class Principal {
    public static void main(String[] args) {
        String frase1 = "La sonrisa sera la mejor arma contra la tristeza.";
        String frase2 = "El equilibrio es no dejar que nadie te quiera menos de lo que te quieres tú.";
        String frase3 = frase1.replace("a", "e");
        StringBuilder fraseFinal = new StringBuilder();
        fraseFinal.append(frase3).append(" ").append(frase2);
        System.out.println("Frase a concatenar: \n" + frase2);
        System.out.println("Resultado: \n" + fraseFinal);

    }
}
