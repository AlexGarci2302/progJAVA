package inicio.ejercicio2Arrays;

public class Inventario {
    private Articulo[] articulos;
    private int indice;
    private static final int CAPACIDAD = 50;

    public Inventario() {
        this.articulos = new Articulo[CAPACIDAD];
        this.indice = 0;
    }

    public void insertarArticulo(Articulo articulo){
        if (indice > CAPACIDAD){
            System.out.println("Error.");
        }
        articulos[indice] = articulo;
        indice++;
    }

    public Articulo buscarPorCodigo(int codigoBuscado){
        Articulo res = null;
        for (int i = 0; i < indice; i++) {
            Articulo a = articulos[i];
            if (a.getCodigo() == codigoBuscado){
                res = a;
            }
        }
        return res;
    }

    public double calcularTotal(){
        double total = 0.0;
        for (int i = 0; i < indice; i++) {
            Articulo a = articulos[i];
            total+=a.getPrecio();
        }
        return total;
    }

}
