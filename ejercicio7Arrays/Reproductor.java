package inicio.ejercicio7Arrays;

public class Reproductor {
    private Cancion[] canciones;
    private static final int CAPACIDAD = 10;
    private int indice;

    public Reproductor(){
        this.canciones = new Cancion[CAPACIDAD];
        this.indice = 0;
    }

    public Reproductor(int capacidad){
        this.canciones = new Cancion[capacidad];
        this.indice = 0;
    }

    public void insertarCancion(Cancion cancion){
        if(indice > canciones.length){
            System.out.println("Error.");
        }
        canciones[indice] = cancion;
        indice++;
    }

    public Cancion buscarCancionPorArtista(String artistaBusacado){
        for (int i = 0; i < indice; i++) {
            Cancion c = canciones[i];
            if (c.getArtista().equals(artistaBusacado)){
                return c;
            }
        }
        return null;
    }

    public void masLargasDe3Min(){
        for (int i = 0; i < indice; i++) {
            Cancion c = canciones[i];
            if (c.getDuracion() > 3.0){
                c.imprimir();
            }
        }
    }
}
