package DesafioPeliculas.modelos;

import DesafioPeliculas.calculos.Clasificacion;

public class Episodios implements Clasificacion{

    private int numero;

    private String nombre;

    private Series series;

    private int visualizaciones;

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClasificacion() {
       if(visualizaciones > 100){
            return 6;
       }else{
            return 2;
       }
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    
}
