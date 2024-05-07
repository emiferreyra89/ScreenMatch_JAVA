package models;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacionPorCriticos;
    private boolean incluidoEnPlanBasico;
    private String sinopsis;
    private double tiempoDeDuracionEnMinutos;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacionPorCriticos() {
        return evaluacionPorCriticos;
    }

    public void setEvaluacionPorCriticos(double evaluacionPorCriticos) {
        this.evaluacionPorCriticos = evaluacionPorCriticos;
    }

    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }

    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return (int) tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("* * * * FICHA TÉCNICA * * * *");
        System.out.println("Título: " + nombre);
        System.out.println("Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración en minutos: " + getTiempoDeDuracionEnMinutos() + " min");
        if(getTiempoDeDuracionEnMinutos() > 59){
            int horas = getTiempoDeDuracionEnMinutos()/60;
            int minutos = getTiempoDeDuracionEnMinutos()%60;
            System.out.println("Tiempo de duración en horas: " + horas + " hs " + minutos + " min");
        }
    }
}
