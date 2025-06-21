package inicio.ejercicio9;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    //Constructor

    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    //Método devolver

    public void devolver(){
        this.disponible = true;
    }

    //Método prestar

    public void prestar(){
        if (!this.disponible){
            System.out.println("El libro que busca no está.");
        } else {
            this.disponible = false;
        }
    }

    //Getter

    public String getTitulo() {
        return titulo;
    }
}
