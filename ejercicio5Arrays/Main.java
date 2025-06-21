package inicio.ejercicio5Arrays;

public class Main {
    public static int indice = 0;
    public static Pelicula[] peliculas = new Pelicula[10];

    public static void imprimirPeliculas(){
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null){
                System.out.println(peliculas[i].imprimir());
            }
        }
    }

    public static void insertarPelicula(Pelicula peliculaInsertada){
        peliculas[indice] = peliculaInsertada;
        indice++;
    }

    public static double mediaTiempo(){
        double media = 0;
        int contador = 0;
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null){
                media += peliculas[i].getDuracion();
                contador++;
            }
        }
        return media/contador;
    }

    public static Pelicula buscarGenero(String genero){
        Pelicula res = null;
        for (Pelicula p : peliculas){
            if (p.getGenero().equals(genero)){
                return p;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        insertarPelicula(new Pelicula("Lilo y Stitch", "Comedia/Aventura", 108));
        insertarPelicula(new Pelicula("Como entrenar a tu dragón LA", "Fantasía/Acción", 116));
        insertarPelicula(new Pelicula("Titanic", "Romance", 194));
        imprimirPeliculas();
        System.out.println("Busqueda de peli: ");
        System.out.println(buscarGenero("Romance").imprimir());
        System.out.println(mediaTiempo());
    }
}
