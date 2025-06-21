package inicio.ejercicio7Arrays;

public class Main {
    public static void main(String[] args) {
        Reproductor r = new Reproductor();

        r.insertarCancion(new Cancion("Jardín de enanitos", "Melendi", 4));
        r.insertarCancion(new Cancion("Rap god", "Eminem", 7.1));
        r.insertarCancion(new Cancion("Violinista en tu tejado", "Melendi", 2.5));
        System.out.println("Canción que dura más de 3 minutos: ");
        r.masLargasDe3Min();
        System.out.println("Canción o canciones de eminem");
        r.buscarCancionPorArtista("Eminem").imprimir();
    }
}
