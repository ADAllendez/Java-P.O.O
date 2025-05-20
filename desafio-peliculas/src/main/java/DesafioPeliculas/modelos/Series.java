package DesafioPeliculas.modelos;

public class Series extends Titulos{
    
    //constructor
    public Series(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
        
    }
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionPorEpisodio;
    
   @Override
    public int getDuracionEnMinutos(){
    return temporadas * episodiosPorTemporada * duracionPorEpisodio;
   }
    
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public int getDuracionPorEpisodio() {
        return duracionPorEpisodio;
    }
    public void setDuracionPorEpisodio(int duracionPorEpisodio) {
        this.duracionPorEpisodio = duracionPorEpisodio;
    }
    

    
}
