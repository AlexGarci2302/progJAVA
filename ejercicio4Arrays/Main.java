package inicio.ejercicio4Arrays;

public class Main {
    public static Libro[] libros = new Libro[30];
    public static int indice = 0;

    public static void insertarLibro(Libro libro){
        libros[indice] = libro;
        indice++;
    }

    public static Libro buscarLibro(Libro libro){
        Libro res = null;
        for (Libro l : libros){
            if (l.getAutor().equals(libro.getAutor())){
                return l;
            }
        }
        return res;
    }

    public static void mostrarLibrosAntesDe(int anioDado){
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getAnio() < anioDado){
                System.out.println(libros[i].imprimir());
            }
        }
    }

    public static void mostrarLibros(){
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null){
                System.out.println(libros[i].imprimir());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Insertamos libros: ");
        insertarLibro(new Libro("50 sombras de grey", "E.L.James", 2011));
        insertarLibro(new Libro("Alas de sangre", "Rebecca Yarros", 2023));
        insertarLibro(new Libro("Libro troll", "Ruben Doglas", 2014));
        mostrarLibros();
        System.out.println("Mostrar libros antes del 2020: ");
        mostrarLibrosAntesDe(2020);
        System.out.println("Buscar libro por autor: ");
        System.out.println(buscarLibro(new Libro("fictio", "Rebecca Yarros", 0)).imprimir());
    }
}
