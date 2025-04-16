package DesafioPeliculas.calculos;


import DesafioPeliculas.modelos.Titulos;


public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulos titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
