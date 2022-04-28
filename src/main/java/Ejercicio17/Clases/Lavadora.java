package Ejercicio17.Clases;

public class Lavadora extends Electrodomestico {
    private Double carga = 5.0;

    public Lavadora() {
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return this.carga;
    }

    @Override
    public Double precioFinal() {
        return (this.getCarga() > 30) ? super.precioFinal() + 50 : super.precioFinal();
    }
}
