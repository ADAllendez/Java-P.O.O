package DesafioPeliculas.modelos;


public class Titulos implements Comparable <Titulos>{

    
    private String nombre;
   
    private int fechaDeLanzamiento;

    private int duracionEnMinutos;

    private boolean incluidoEnPlan;

    private double sumaDeEvaluciones;

    private int totalDeEvaluaciones = 0;

    //Constructor
    public Titulos(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    public Titulos(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if(miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No pude convertir la duracion, "
            + "porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", ""));
    }
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

    public void setSumaDeEvaluciones(double sumaDeEvaluciones) {
        this.sumaDeEvaluciones = sumaDeEvaluciones;
    }

    public void setTotalDeEvaluaciones(int totalDeEvaluaciones) {
        this.totalDeEvaluaciones = totalDeEvaluaciones;
    }

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }
    public int getDuracionEnMinutos(){
        return duracionEnMinutos;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public double getSumaDeEvaluciones() {
        return sumaDeEvaluciones;
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
    @Override
    public int compareTo(Titulos otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
    @Override
    public String toString() {
        return " (Nombre: " + nombre + ", FechaDeLanzamiento: " + fechaDeLanzamiento + ", Duracion: " + duracionEnMinutos +")";
    }

    
}
