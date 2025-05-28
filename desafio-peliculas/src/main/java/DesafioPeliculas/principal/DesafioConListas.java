package DesafioPeliculas.principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import DesafioPeliculas.modelos.Pelicula;
import DesafioPeliculas.modelos.Series;
import DesafioPeliculas.modelos.Titulos;


public class DesafioConListas {

    public static void main(String[] args) {
        
        Pelicula pelicula = new Pelicula("Interestelar", 2014);
        pelicula.evaluciones(9);
        
        var peliculaAlejo = new Pelicula("The Lord Of The Ring",2001);
        peliculaAlejo.evaluciones(10);
        
        Series reacher = new Series("Reacher", 2022);
        reacher.evaluciones(7);

        ArrayList<Titulos> lista = new ArrayList<>();
		lista.add(pelicula);
        lista.add(reacher);
        lista.add(peliculaAlejo);


        for (Titulos item : lista) {
            System.out.println(item.getNombre());
            if(item instanceof Pelicula Peelicula){
            System.out.println(Peelicula.getClasificacion());
            }
            
        }
        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Tom Cruise");
        listaArtistas.add("The Rock");
        listaArtistas.add("Mark Wahlber");

        //El .sort ordena la listas alfabeticamente
        Collections.sort(listaArtistas);
        System.out.println("Lista de Artistas ordenadas: "+listaArtistas);


       Collections.sort(lista);
       System.out.println("Lista ordenada de Titulos: "+lista);

       //Aqui ademas de ordenar por Nombre tambien odenamos por Fecha de Lanzamiento 
       lista.sort(Comparator.comparing(Titulos::getFechaDeLanzamiento));
       System.out.println("Lista ordenada por fecha: "+lista);
    }
}
