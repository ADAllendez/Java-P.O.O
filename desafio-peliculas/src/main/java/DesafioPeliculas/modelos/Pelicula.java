package DesafioPeliculas.modelos;

import DesafioPeliculas.calculos.Clasificacion;

public class Pelicula extends Titulos implements Clasificacion{
   
    private String director;

    //constructor
    public Pelicula(String nombre, int fechaDeLanzamiento){
        super(nombre, fechaDeLanzamiento);
    }

   //setter
    public String getDirector() {
        return director;
    }

    //getter
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (mediaEvaluaciones() /2) ;
    }

    @Override
    public String toString() {
        return "Pelicula " + this.getNombre() + "( " + getFechaDeLanzamiento()+")";
    }

    

}
