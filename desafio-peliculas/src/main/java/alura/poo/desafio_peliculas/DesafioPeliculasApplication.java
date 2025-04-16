package alura.poo.desafio_peliculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import DesafioPeliculas.calculos.CalculadoraDeTiempo;
import DesafioPeliculas.calculos.FiltroRecomendaciones;
import DesafioPeliculas.modelos.Episodios;
import DesafioPeliculas.modelos.Pelicula;
import DesafioPeliculas.modelos.Series;

@SpringBootApplication
public class DesafioPeliculasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPeliculasApplication.class, args);


		Pelicula pelicula = new Pelicula();

		pelicula.setNombre("Interestelar");
		pelicula.setFechaDeLanzamiento(2014);
		pelicula.setDuracionEnMinutos(167);
		pelicula.setIncluidoEnPlan(true);

		pelicula.evaluciones(10);
		pelicula.evaluciones(10);
		pelicula.evaluciones(7.8);
		
		pelicula.informacionDePeliculas();
		pelicula.mediaEvaluaciones();

		System.out.println(pelicula.getTotalDeEvaluaciones());
		System.out.println(pelicula.mediaEvaluaciones());

		Series reacher = new Series();
		reacher.setNombre("Reacher");
		reacher.setFechaDeLanzamiento(2022); 
		reacher.setTemporadas(3);
		reacher.setDuracionPorEpisodio(42);
		reacher.setEpisodiosPorTemporada(8);
		reacher.getDuracionEnMinutos();
		reacher.informacionDePeliculas();

		CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
		calculadora.incluye(pelicula);
		calculadora.incluye(reacher);
		System.out.println(calculadora.getTiempoTotal());


		FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
		filtroRecomendaciones.filtra(pelicula);

		Episodios episodio = new Episodios();
		episodio.setNumero (1);
		episodio.setNombre("La casa Targaryen");
		episodio.setSeries(reacher);
		episodio.setVisualizaciones (50);

		filtroRecomendaciones.filtra(episodio);


	}

}
