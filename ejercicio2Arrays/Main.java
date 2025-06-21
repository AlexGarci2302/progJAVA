package inicio.ejercicio2Arrays;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.insertarArticulo(new Articulo(1, "pelota", 50.99));
        inventario.insertarArticulo(new Articulo(2, "bicicleta", 349.75));
        inventario.insertarArticulo(new Articulo(3, "cartulina", 16.75));

        System.out.println("Buscamos el artículo con el código 2: ");
        System.out.println(inventario.buscarPorCodigo(2).imprimir());

        System.out.println("Calcula todo el valor de los productos: ");
        System.out.println("Precio total: " + inventario.calcularTotal());
    }
}
