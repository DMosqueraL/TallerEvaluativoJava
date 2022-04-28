package Ejercicio18.Clases;

import Ejercicio18.Clases.Interfaces.IEntregable;

public class Serie implements IEntregable {
    private String titulo;
    private Integer numTemporadas = 3;
    private Boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Integer getNumTemporadas() {
        return this.numTemporadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCreador() {
        return this.creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie:" + "\n" +
                "Título: " + titulo + "\n" +
                "Temporadas: " + numTemporadas + "\n" +
                "Entregado: " + entregado + "\n" +
                "Género: " + genero +  "\n" +
                "Creador: " + creador;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        if(this.numTemporadas > ((Serie)a).getNumTemporadas()) {
            return 1;
        } else if(this.numTemporadas < ((Serie)a).getNumTemporadas()) {
            return -1;
        }
        return 0;
    }
}
