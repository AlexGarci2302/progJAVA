package inicio.ejercicio5Arrays;

public class Cine {
    private Pelicula[] peliculas;
    private int indice;
    private static final int CAPACIDAD = 10;

    public Cine(){
        this.peliculas = new Pelicula[CAPACIDAD];
        this.indice = 0;
    }

    public Cine(int tamano){
        this.peliculas = new Pelicula[tamano];
        this.indice = 0;
    }

    public void insertarPelicula(Pelicula pelicula){
        peliculas[indice] = pelicula;
        indice++;
    }

    public double mediaTiempo(){
        double total = 0.0;
        int reps = 0;
        for (int i = 0; i < indice; i++) {
            total += peliculas[i].getDuracion();
            reps++;
        }
        return total/reps;
    }

    public void buscarGenero(String genero){
        int contador = 0;
        for (int i = 0; i < indice; i++) {
            Pelicula p = peliculas[i];
            if (p.getGenero().equals(genero)){
                System.out.println(p.imprimir());
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("No hay ninguna peli con ese género.");
        }
    }

    public void imprimirPeliculas(){
        for (int i = 0; i < indice; i++) {
            System.out.println(peliculas[i].imprimir());
        }
    }
}
