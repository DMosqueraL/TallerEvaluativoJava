package Ejercicio17.Clases;

public class Television extends Electrodomestico{

    private Float resolucion = 20F;
    private Boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Float resolucion, Boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Float getResolucion() {
        return this.resolucion;
    }

    public Boolean isSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    @Override
    public Double precioFinal() {
        Double aumentoResolucion = super.precioFinal();
        Double aumentoSintonizador = 0.0;

        if (getResolucion()>40){aumentoResolucion += super.precioFinal() + this.getPrecioBase()*.30;}
        if (isSintonizadorTDT()) {aumentoSintonizador += super.precioFinal()+50;}
        return aumentoResolucion + aumentoSintonizador;
    }
}
