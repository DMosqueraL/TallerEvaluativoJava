package Ejercicio17.Clases;

import java.util.HashMap;

public class Electrodomestico {
    protected Double precioBase;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
        this.precioBase = 100.0;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5.0;
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Double getPrecioBase() {
        return this.precioBase;
    }

    public String getColor() {
        return this.color;
    }

    public Character getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public Double getPeso() {
        return this.peso;
    }

    private String comprobarColor(String color) {
        String [] colores = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        for (String colorE : colores){
            return (colorE.equalsIgnoreCase(color.toUpperCase())) ? colorE : "BLANCO";
        }
        return "BLANCO";
    }
    private Character comprobarConsumoEnergetico(Character letra) {
        Character[] consumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (Character l : consumoEnergetico) {
            return (l == letra) ? l : 'F';
        }
        return 'F';
    }

    public Double precioFinal(){
        return getPrecioBase() + aumentoPorConsumo() + aumentoPorTamanno();
    }

    private Double aumentoPorConsumo() {
        HashMap<Character, Double> valorPorConsumo = new HashMap<>();
        valorPorConsumo.put('A', 100.0);
        valorPorConsumo.put('B', 80.0);
        valorPorConsumo.put('C', 60.0);
        valorPorConsumo.put('D', 50.0);
        valorPorConsumo.put('E', 30.0);
        valorPorConsumo.put('F', 10.0);

        Double aumentoConsumo = 0.0;
        for (Character letra : valorPorConsumo.keySet()){
            if (letra == getConsumoEnergetico()){
                aumentoConsumo += valorPorConsumo.get(letra);
                break;
            }
        }
        return aumentoConsumo;
    }

    private Double aumentoPorTamanno() {
        Double aumentoTamanno = 0.0;
        Double tamanno = getPeso();

        if (tamanno <20){
            aumentoTamanno += 10;
        }else if (tamanno >= 20 && tamanno <50){
            aumentoTamanno += 50;
        } else if (tamanno >=50 && tamanno <80){
            aumentoTamanno += 80;
        }else{
            aumentoTamanno += 100;
        }
        return aumentoTamanno;
    }
}
