package inicio.ejercicio5Arrays;

public class Main {
    public static void main(String[] args) {
        Cine c = new Cine();
        c.insertarPelicula(new Pelicula("Lilo y Stitch", "Aventura", 108));
        c.insertarPelicula(new Pelicula("Como entrenar a tu dragón LA", "Aventura", 116));
        c.insertarPelicula(new Pelicula("Titanic", "Romance", 194));
        c.imprimirPeliculas();
        System.out.println("Busqueda de peli: ");
        c.buscarGenero("Miedo");
        System.out.println("Media de tiempo de películas: ");
        System.out.println(c.mediaTiempo());
    }
}
