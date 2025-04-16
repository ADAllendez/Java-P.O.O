package DesafioPeliculas.modelos;

public class Titulos {
    private String nombre;

    private int fechaDeLanzamiento;

    private int duracionEnMinutos;

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

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }



    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

   
    //////////////////////// getters /////////////////////////////////////////////

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }
    public int getDuracionEnMinutos(){
        return duracionEnMinutos;
    }
    ////////////////////////       METODOS     //////////////////////////////////////
    public void informacionDePeliculas(){
        System.out.println("\nEl nombre del titulo es: "+ nombre);
        System.out.println("La fecha de lanzamiento fue en: "+ fechaDeLanzamiento);
        System.out.println("El titulo dura en minutos dura: "+ getDuracionEnMinutos());
    }

    public void evaluciones(double nota){
        sumaDeEvaluciones+= nota;
        totalDeEvaluaciones++;
    }
    public double mediaEvaluaciones(){
        return sumaDeEvaluciones / totalDeEvaluaciones;
    }
}
