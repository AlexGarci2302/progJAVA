package inicio.ejercicio4Arrays;

public class Bibliotecario {
    private Libro[] libros;
    private int indice;
    private static final int CAPACIDAD = 10;

    public Bibliotecario(){
        this.libros = new Libro[CAPACIDAD];
        this.indice = 0;
    }

    public Bibliotecario(int tamano){
        this.libros = new Libro[tamano];
        this.indice = 0;
    }

    public void insertarLibro(Libro libro){
        libros[indice] = libro;
        indice++;
    }

    public Libro buscarLibro(String autorBuscado){
        Libro res = null;
        for (int i = 0; i < indice; i++) {
            Libro l = libros[i];
            if (l.getAutor().equals(autorBuscado)){
                return l;
            }
        }
        return res;
    }

    public void mostrarLibrosAntesDe(int anio){
        for (int i = 0; i < indice; i++) {
            Libro l = libros[i];
            if (l.getAnio() < anio){
                System.out.println(l.imprimir());
            }
        }
        System.out.println("No se ha encontrado ningún libro por ese año.");
    }

    public void mostrarLibros(){
        for (int i = 0; i < indice; i++) {
            System.out.println(libros[i].imprimir());
        }
    }
}
