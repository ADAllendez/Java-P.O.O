package DesafioPeliculas.modelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import alura.poo.desafio_peliculas.Pelicula;

@SpringBootApplication
public class DesafioPeliculasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPeliculasApplication.class, args);


		Pelicula pelicula = new Pelicula();

		pelicula.setNombre("Interestelar");
		pelicula.setFechaDeLanzamiento(2014);
		pelicula.setDuracion("2h 49 min");
		pelicula.setIncluidoEnPlan(true);

		pelicula.evaluciones(10);
		pelicula.evaluciones(10);
		pelicula.evaluciones(7.8);
		
		pelicula.informacionDePeliculas();
		pelicula.mediaEvaluaciones();

		System.out.println(pelicula.getTotalDeEvaluaciones());
		System.out.println(pelicula.mediaEvaluaciones());
	}

}
