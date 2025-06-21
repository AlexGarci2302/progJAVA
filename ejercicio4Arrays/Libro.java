package inicio.ejercicio4Arrays;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    //Constructor

    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    //Getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    //Método imprimir

    public String imprimir(){
        return "Título: " + getTitulo() +
                ", autor: " + getAutor() +
                ", año: " + getAnio();
    }
}
