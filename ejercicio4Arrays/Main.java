package inicio.ejercicio4Arrays;

public class Main {

    public static void main(String[] args) {

        Bibliotecario bibliotecario = new Bibliotecario();
        System.out.println("Insertamos libros: ");
        bibliotecario.insertarLibro(new Libro("50 sombras de grey", "E.L.James", 2011));
        bibliotecario.insertarLibro(new Libro("Alas de sangre", "Rebecca Yarros", 2023));
        bibliotecario.insertarLibro(new Libro("Libro troll", "Ruben Doglas", 2014));
        bibliotecario.mostrarLibros();
        System.out.println("Mostrar libros antes del 2020: ");
        bibliotecario.mostrarLibrosAntesDe(2020);
        System.out.println("Buscar libro por autor: ");
        System.out.println(bibliotecario.buscarLibro("Rebecca Yarros").imprimir());
    }
}
