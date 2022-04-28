package Utilidades;

public class Numero {
    private Integer numero1;
    private Integer numero2;

    public Numero(int num1, int num2) {
        setNumero1(num1);
        setNumero2(num2);
    }

    public Numero() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void esMayor(int num1, int num2) {
        if (num1 > num2)
            System.out.println(num1 + " es mayor que " + num2);
    }

    public void esMenor(int num1, int num2) {
        if (num1 < num2)
            System.out.println(num1 + " es menor que " + num2);
    }

    public void esIgual(int num1, int num2) {
        if (num1 == num2)
            System.out.println(num1 + " es igual a " + num2);
    }

    public void deDosEnDos(Integer limiteInferior){
        for (int numero = limiteInferior; numero <=1000; numero++ ){
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        }
    }
}
