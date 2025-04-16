package DesafioPeliculas.calculos;

public class FiltroRecomendaciones {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Evaluacion Buena de episodio");
        }else if (clasificacion.getClasificacion() >=6){
            System.out.println("Evaluacion Muy Buena de episodio");
        }else if(clasificacion.getClasificacion() ==10){
            System.out.println("Excelente evaluacion del episodio");
        }else{
            System.out.println("Evaluacion Mala de episodio");
        }
    }
}
