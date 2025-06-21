package inicio.ejercicio5Arrays;

public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;

    public Pelicula(String titulo, String genero, int duracion){
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    //Getters

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    //Método imprimir

    public String imprimir(){
        return "Título: " + getTitulo() +
                ", género: " + getGenero() +
                ", duración: " + getDuracion();
    }
}
