package Ejercicio18.Clases;

import Ejercicio18.Clases.Interfaces.IEntregable;

public class Videojuego implements IEntregable {

    private String titulo;
    private Integer horasEstimadas = 10;
    private Boolean entregado = false;
    private String genero;
    private String compannia;

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compannia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compannia = compannia;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Integer getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCompannia() {
        return this.compannia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompannia(String compannia) {
        this.compannia = compannia;
    }

    @Override
    public String toString() {
        return  "Título: " + titulo + "\n" +
                "Horas Estimadas: " + horasEstimadas + "\n" +
                "Entregado: " + entregado + "\n" +
                "Género: " + genero +  "\n" +
                "Compañía: " + compannia;
    }

    @Override
    public void devolver() {

    }

    @Override
    public void entregar() {

    }

    @Override
    public boolean isEntregado() {
        return false;
    }

    @Override
    public int compareTo(Object a) {
        if(this.horasEstimadas > ((Videojuego)a).getHorasEstimadas()) {
            return 1;
        } else if(this.horasEstimadas < ((Videojuego) a).getHorasEstimadas()) {
            return -1;
        }
        return 0;
    }


}
