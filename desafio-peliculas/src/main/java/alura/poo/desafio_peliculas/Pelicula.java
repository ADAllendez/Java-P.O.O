package alura.poo.desafio_peliculas;

public class Pelicula {
    private String nombre;

    private int fechaDeLanzamiento;

    private String duracion;

    private boolean incluidoEnPlan;

    private double sumaDeEvaluciones;

    private int totalDeEvaluaciones = 0;

    /////////////////////////// setters /////////////////////////////////////////
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

     public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

   
    //////////////////////// getters /////////////////////////////////////////////

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }
 
    ////////////////////////       METODOS     //////////////////////////////////////
    public void informacionDePeliculas(){
        System.out.println("\nEl nombre de la pelicula es: "+ nombre);
        System.out.println("La fecha de lanzamiento fue en: "+ fechaDeLanzamiento);
        System.out.println("La pelicula dura: "+ duracion);
    }

    public void evaluciones(double nota){
        sumaDeEvaluciones+= nota;
        totalDeEvaluaciones++;
    }
    public double mediaEvaluaciones(){
        return sumaDeEvaluciones / totalDeEvaluaciones;
    }
}
